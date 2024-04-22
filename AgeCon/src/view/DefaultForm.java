package view;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author artur
 */
abstract public class DefaultForm extends javax.swing.JInternalFrame {

    abstract public void initializeComponents();

    JLabel jlQuery;
    JTextField jtfQuery;

    // Constructor
    public DefaultForm() {
        initComponents();
        enableButtons(true);
        enableFields(false);
        jtfId.setEnabled(false);
        initializeComponents();

        // JLabel - Query
        jlQuery = new JLabel("Consulta");
        jlQuery.setBounds(9, 5, 50, 25);
        jpnQuery.add(jlQuery);

        //JTextField - Query
        jtfQuery = new JTextField();
        jtfQuery.setBounds(60, 5, 615, 25);
        jpnQuery.add(jtfQuery);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnButtons = new javax.swing.JPanel();
        jbNew = new javax.swing.JButton();
        jbChange = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbSave = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();
        jpnForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();
        jtfId = new javax.swing.JTextField();
        jpnQuery = new javax.swing.JPanel();

        jbNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        jbNew.setMnemonic('n');
        jbNew.setText("Novo");
        jbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewActionPerformed(evt);
            }
        });

        jbChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jbChange.setMnemonic('a');
        jbChange.setText("Alterar");
        jbChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbChangeActionPerformed(evt);
            }
        });

        jbDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        jbDelete.setMnemonic('e');
        jbDelete.setText("Excluir");

        jbSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        jbSave.setMnemonic('s');
        jbSave.setText("Salvar");
        jbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveActionPerformed(evt);
            }
        });

        jbCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        jbCancel.setMnemonic('c');
        jbCancel.setText("Cancelar");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        jbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fechar.png"))); // NOI18N
        jbClose.setMnemonic('f');
        jbClose.setText("Fechar");
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnButtonsLayout = new javax.swing.GroupLayout(jpnButtons);
        jpnButtons.setLayout(jpnButtonsLayout);
        jpnButtonsLayout.setHorizontalGroup(
            jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jbNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbChange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDelete)
                .addGap(57, 57, 57)
                .addComponent(jbSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbClose)
                .addGap(27, 27, 27))
        );
        jpnButtonsLayout.setVerticalGroup(
            jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNew)
                    .addComponent(jbChange)
                    .addComponent(jbDelete)
                    .addComponent(jbSave)
                    .addComponent(jbCancel)
                    .addComponent(jbClose))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel1.setText("ID");

        jLabel2.setText("Descrição");

        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnFormLayout = new javax.swing.GroupLayout(jpnForm);
        jpnForm.setLayout(jpnFormLayout);
        jpnFormLayout.setHorizontalGroup(
            jpnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnFormLayout.createSequentialGroup()
                        .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnFormLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnFormLayout.setVerticalGroup(
            jpnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jpnQuery.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jpnQueryLayout = new javax.swing.GroupLayout(jpnQuery);
        jpnQuery.setLayout(jpnQueryLayout);
        jpnQueryLayout.setHorizontalGroup(
            jpnQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );
        jpnQueryLayout.setVerticalGroup(
            jpnQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        // TODO add your handling code here:
        enableButtons(true);
        enableFields(false);
    }//GEN-LAST:event_jbCancelActionPerformed

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbCloseActionPerformed

    private void jbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewActionPerformed
        // TODO add your handling code here:
        enableButtons(false);
        enableFields(true);
        jtfDescricao.requestFocus();
    }//GEN-LAST:event_jbNewActionPerformed

    private void jbChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChangeActionPerformed
        // TODO add your handling code here:
        enableButtons(false);
        enableFields(true);
        jtfDescricao.requestFocus();
    }//GEN-LAST:event_jbChangeActionPerformed

    private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveActionPerformed
        // TODO add your handling code here:
        enableButtons(true);
        enableFields(false);
    }//GEN-LAST:event_jbSaveActionPerformed

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtfIdActionPerformed

    private void enableButtons(boolean state) {
        jbNew.setEnabled(state);
        jbChange.setEnabled(state);
        jbDelete.setEnabled(state);
        jbSave.setEnabled(!state);
        jbCancel.setEnabled(!state);
    }

    private void enableFields(boolean state) {
        if (state == false) {
            jtfDescricao.setText("");
        }
        jtfDescricao.setEnabled(state);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbChange;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbNew;
    private javax.swing.JButton jbSave;
    private javax.swing.JPanel jpnButtons;
    public javax.swing.JPanel jpnForm;
    private javax.swing.JPanel jpnQuery;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfId;
    // End of variables declaration//GEN-END:variables
}
