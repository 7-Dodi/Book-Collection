/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.Pages;

import com.Conection.Conection;
import com.Content.Apresentation;
import java.awt.BorderLayout;
import java.sql.ResultSet;

public class Main extends javax.swing.JPanel {
    private Apresentation ap;
    
    public Main() {
        initComponents();
        
        ap = new Apresentation();
        ap.setSize(795,400);
        ap.setLocation(0, 0);
        
        Content.removeAll();
        Content.add(ap, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nome1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Content = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(71, 71, 71));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nome1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        Nome1.setForeground(new java.awt.Color(255, 255, 255));
        Nome1.setText("Início");
        Nome1.setToolTipText("Nome");
        jPanel1.add(Nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 690, 20));

        Content.setBackground(new java.awt.Color(71, 71, 71));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel1.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 795, 450));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 795, 520));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JLabel Nome1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
