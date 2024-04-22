package view;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author artur
 */
public class ViewCity extends DefaultForm {
    
    JLabel jlUf;
    JLabel jlCep;
    
    JComboBox jcbUf;
    JTextField jtfCep;

    public ViewCity() {
        setTitle("Cadastro de Cidade");
    }

    @Override
    public void initializeComponents() {
        jlUf = new JLabel("UF");
        jlUf.setBounds(30, 60, 50, 25);
        jpnForm.add(jlUf);

        jcbUf = new JComboBox();
        jcbUf.setBounds(30, 80, 70, 25);
        jpnForm.add(jcbUf);
        
        jlCep = new JLabel("CEP");
        jlCep.setBounds(120, 60, 50, 25);
        jpnForm.add(jlCep);
        
        jtfCep = new JTextField();
        jtfCep.setBounds(120, 80, 150, 25);
        jpnForm.add(jtfCep);
    }

}
