package br.com.javalearn.todolist.utils;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Utils {

  public static void copyNonNullProperties(Object source, Object target) {
    BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
  }

  public static String[] getNullPropertyNames(Object source) {
    final BeanWrapper src = new BeanWrapperImpl(source);
    System.out.println(src);

    PropertyDescriptor[] pds = src.getPropertyDescriptors();
    System.out.println(pds);

    Set<String> emptyNames = new HashSet<>();
    System.out.println(emptyNames);
    for (PropertyDescriptor pd : pds) {
      System.out.println(pd);
      Object srcValue = src.getPropertyValue(pd.getName());
      if (srcValue == null) {
        emptyNames.add(pd.getName());
      }
    }
    String[] result = new String[emptyNames.size()];
    System.out.println(result);
    return emptyNames.toArray(result);
  }
}
