package br.com.javalearn.todolist.task;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.javalearn.todolist.utils.Utils;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("tasks")
public class TaskController {
  @Autowired
  private ITaskRepository taskRepository;

  @PostMapping
  @SuppressWarnings("rawtypes")
  public ResponseEntity create(@RequestBody TaskModel taskModel, HttpServletRequest request) {
    var idUser = request.getAttribute("idUser");
    taskModel.setIdUser((UUID) idUser);

    var currentDate = LocalDateTime.now();
    if (currentDate.isAfter(taskModel.getStartAt()) || currentDate.isAfter(taskModel.getEndAt())) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body("The start date or end date must be greater than the current date");
    }

    if (taskModel.getStartAt().isAfter(taskModel.getEndAt())) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body("The start date must be less than the end date");
    }
    var task = this.taskRepository.save(taskModel);
    return ResponseEntity.status(HttpStatus.OK).body(task);
  }

  @GetMapping()
  public List<TaskModel> list(HttpServletRequest request) {
    var idUser = request.getAttribute("idUser");
    var tasks = this.taskRepository.findByIdUser((UUID) idUser);
    return tasks;
  }

  @PutMapping("{id}")
  @SuppressWarnings("rawtypes")
  public ResponseEntity update(@RequestBody TaskModel newTask, HttpServletRequest request, @PathVariable UUID id) {
    var idUser = request.getAttribute("idUser");

    var currentTask = this.taskRepository.findById(id).orElse(null);

    if (currentTask == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body("Task not found");
    }

    if (!currentTask.getIdUser().equals(idUser)) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body("The user does not have permission to change this task");
    }

    Utils.copyNonNullProperties(newTask, currentTask);
    var taskUpdated = this.taskRepository.save(currentTask);

    return ResponseEntity.ok().body(taskUpdated);
  }
}
