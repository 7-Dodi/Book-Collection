/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.Pages;

import com.Conection.Conection;
import javax.swing.JOptionPane;

/**
 *
 * @author Silva
 */
public class Avaliation extends javax.swing.JPanel {

    /**
     * Creates new form Avaliation
     */
    public Avaliation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Descr = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Titlle = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Button = new javax.swing.JToggleButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(71, 71, 71));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Avaliação");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 130, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 670, 10));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descrição");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 100, -1));

        Descr.setBackground(new java.awt.Color(71, 71, 71));
        Descr.setForeground(new java.awt.Color(255, 255, 255));
        Descr.setText("Descrição");
        Descr.setBorder(null);
        Descr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescrActionPerformed(evt);
            }
        });
        jPanel1.add(Descr, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 300, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 310, 20));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Título");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 60, -1));

        Titlle.setBackground(new java.awt.Color(71, 71, 71));
        Titlle.setForeground(new java.awt.Color(255, 255, 255));
        Titlle.setText("Informe o título do livro");
        Titlle.setBorder(null);
        Titlle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitlleActionPerformed(evt);
            }
        });
        jPanel1.add(Titlle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 300, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 310, 20));

        Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button.setText("Avaliar");
        Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonMouseClicked(evt);
            }
        });
        jPanel1.add(Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 120, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 795, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void DescrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescrActionPerformed

    private void TitlleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitlleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitlleActionPerformed

    private void ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonMouseClicked
        Conection con = new Conection();
        String id = con.executarCodigoAvaliation();
        String title = con.procurarLivro(Titlle.getText());
        String descr = Descr.getText();
        
        if(title == null){
             JOptionPane.showMessageDialog(null, "Livro não encontrado, tente novamente", "Aviso", JOptionPane.WARNING_MESSAGE);
        }else{
            String sql = "INSERT INTO Avaliation (Id, CodLivro, Descrition)"
                    + "VALUES('" + id + "', '" + title + "', '" + descr + "' );"
                    + "UPDATE Livro SET Status = 'Lido' WHERE Id = '" + title + "';";
            int res = con.executaSQL(sql);
             if(res != 0){
                JOptionPane.showMessageDialog(null, "Avaliação adicionado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_ButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Button;
    private javax.swing.JTextField Descr;
    private javax.swing.JTextField Titlle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
