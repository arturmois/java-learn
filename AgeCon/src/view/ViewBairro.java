package view;

import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author artur
 */
public final class ViewBairro extends DefaultForm {

    JLabel jlBairro;
    JComboBox jcbBairro;

    public ViewBairro() {
        setTitle("Cadastro de Bairro");
        
    }

    @Override
    public void initializeComponents() {
        jlBairro = new JLabel("Cidade");
        jlBairro.setBounds(30, 60, 50, 25);
        jpnForm.add(jlBairro);

        jcbBairro = new JComboBox();
        jcbBairro.setBounds(30, 80, 250, 25);
        jpnForm.add(jcbBairro);
    }

}
