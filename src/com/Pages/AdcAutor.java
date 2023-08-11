package com.Pages;

import com.Conection.Conection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AdcAutor extends javax.swing.JPanel {
    public AdcAutor() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NacionalidadeAutor = new javax.swing.JTextField();
        NomeAutor = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        BtnAutor = new javax.swing.JToggleButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(71, 71, 71));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nacionalidade");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 140, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 640, 10));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adicionar Autor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 40));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 60, 30));

        NacionalidadeAutor.setBackground(new java.awt.Color(71, 71, 71));
        NacionalidadeAutor.setForeground(new java.awt.Color(255, 255, 255));
        NacionalidadeAutor.setText("Nacionalidade");
        NacionalidadeAutor.setBorder(null);
        jPanel1.add(NacionalidadeAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 320, 30));

        NomeAutor.setBackground(new java.awt.Color(71, 71, 71));
        NomeAutor.setForeground(new java.awt.Color(255, 255, 255));
        NomeAutor.setText("Nome do Autor");
        NomeAutor.setBorder(null);
        NomeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeAutorActionPerformed(evt);
            }
        });
        jPanel1.add(NomeAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 320, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 350, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 350, 10));

        BtnAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnAutor.setText("Adicionar");
        BtnAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAutorMouseClicked(evt);
            }
        });
        jPanel1.add(BtnAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 100, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void NomeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeAutorActionPerformed

    private void BtnAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAutorMouseClicked
        Conection con = new Conection();
        String id = con.executarCodigoAutor();
        String nome = NomeAutor.getText();
        String nacionalidade = NacionalidadeAutor.getText();
        
        String sql = "INSERT INTO Autor (Id, Nome, Nacionalidade)"
                + "VALUES('"+ id + "' , '" + nome + "', '" + nacionalidade + "' )";
        int res = con.executaSQL(sql);
        
        if(res != 0){
            JOptionPane.showMessageDialog(null, "Autor Adicionado", "Aviso", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_BtnAutorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnAutor;
    private javax.swing.JTextField NacionalidadeAutor;
    private javax.swing.JTextField NomeAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
