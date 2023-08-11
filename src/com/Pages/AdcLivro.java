package com.Pages;

import com.Conection.Conection;
import javax.swing.JOptionPane;

public class AdcLivro extends javax.swing.JPanel {
    public AdcLivro() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        StatusLivro = new javax.swing.JTextField();
        AutorLivro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        TituloLivro = new javax.swing.JTextField();
        GeneroTwo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        GeneroOne = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();

        Dialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(71, 71, 71));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Status");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 60, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 680, 20));

        StatusLivro.setBackground(new java.awt.Color(71, 71, 71));
        StatusLivro.setForeground(new java.awt.Color(255, 255, 255));
        StatusLivro.setText("Status do livro");
        StatusLivro.setBorder(null);
        StatusLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusLivroActionPerformed(evt);
            }
        });
        jPanel1.add(StatusLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 230, 30));

        AutorLivro.setBackground(new java.awt.Color(71, 71, 71));
        AutorLivro.setForeground(new java.awt.Color(255, 255, 255));
        AutorLivro.setText("Autor do livro");
        AutorLivro.setBorder(null);
        jPanel1.add(AutorLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 230, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Adicionar Livro");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 200, 50));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gênero 2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 90, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Autor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 60, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 230, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 230, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 230, 20));

        jToggleButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jToggleButton1.setText("Adicionar");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 130, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Título");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 60, 30));

        TituloLivro.setBackground(new java.awt.Color(71, 71, 71));
        TituloLivro.setForeground(new java.awt.Color(255, 255, 255));
        TituloLivro.setText("Título do livro");
        TituloLivro.setBorder(null);
        TituloLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloLivroActionPerformed(evt);
            }
        });
        jPanel1.add(TituloLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 230, 30));

        GeneroTwo.setBackground(new java.awt.Color(71, 71, 71));
        GeneroTwo.setForeground(new java.awt.Color(255, 255, 255));
        GeneroTwo.setText("Gênero 2 do livro");
        GeneroTwo.setBorder(null);
        GeneroTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneroTwoActionPerformed(evt);
            }
        });
        jPanel1.add(GeneroTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 230, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 230, 10));

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gêneros");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 80, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gênero 1");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 90, 30));

        GeneroOne.setBackground(new java.awt.Color(71, 71, 71));
        GeneroOne.setForeground(new java.awt.Color(255, 255, 255));
        GeneroOne.setText("Gênero 1 do livro");
        GeneroOne.setBorder(null);
        GeneroOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneroOneActionPerformed(evt);
            }
        });
        jPanel1.add(GeneroOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 230, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 230, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 795, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void StatusLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusLivroActionPerformed

    }//GEN-LAST:event_StatusLivroActionPerformed

    private void TituloLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloLivroActionPerformed

    private void GeneroTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroTwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneroTwoActionPerformed

    private void GeneroOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneroOneActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        Conection con = new Conection();
        String id = con.executaCodigoLivro();
        String titulo = TituloLivro.getText();
        String autor = con.procurarAutor(AutorLivro.getText());
        String genero1 = GeneroTwo.getText();
        String genero2 = GeneroTwo.getText();
        String status = StatusLivro.getText();

                
        if(autor == null){
             JOptionPane.showMessageDialog(null, "Autor não encontrado, tente novamente", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        else{
            String sql = "INSERT INTO Livro (Id, Titulo, Status, GeneOne, GeneTwo, CodAutor)"
                    + "VALUES('"+ id + "' , '" + titulo + "', '" + status + "', '" + genero1 + "', '" + genero2 +"', '" + autor + "' );";
            int res = con.executaSQL(sql);
            if(res != 0){
                JOptionPane.showMessageDialog(null, "Livro adicionado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jToggleButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AutorLivro;
    private javax.swing.JDialog Dialog;
    private javax.swing.JTextField GeneroOne;
    private javax.swing.JTextField GeneroTwo;
    private javax.swing.JTextField StatusLivro;
    private javax.swing.JTextField TituloLivro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
