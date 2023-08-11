package com.Pages;

import com.Conection.Conection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ListarAutor extends javax.swing.JPanel {
    private String codAutor;
    private String nome;
    private String nacionalidade;
    private String titulo;
    private String codLivro;
    
    public ListarAutor() {
        initComponents();
        
        inserirTableAutor();
        inserirTableAutorLivro();
    }

   public void inserirTableAutor(){
       Conection con = new Conection();
       String sql = "SELECT * FROM Autor"; 
       ResultSet res = con.executaBusca(sql);
       
       try {
           while(res.next()){
            codAutor = res.getString("id");
            nome = res.getString("Nome");
            nacionalidade = res.getString("Nacionalidade");
            
            DefaultTableModel model = (DefaultTableModel) TableAutor.getModel();
        
            Object[] newRom = {codAutor, nome, nacionalidade};
            model.addRow(newRom);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   
   public void inserirTableAutorLivro(){
       Conection con = new Conection();
       String sql = "SELECT * FROM AutorLivro"; 
       ResultSet res = con.executaBusca(sql);
       
       try {
           while(res.next()){
            codLivro = res.getString("id");
            nome = res.getString("Nome");
            titulo = res.getString("Titulo");
            
            DefaultTableModel model = (DefaultTableModel) TableAutorLivro.getModel();
        
            Object[] newRom = {nome, codLivro, titulo};
            model.addRow(newRom);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAutorLivro = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableAutor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(71, 71, 71));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listar Autor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 28, 230, 50));

        TableAutorLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CodLivro", "Livro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableAutorLivro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 330, 350));

        TableAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Nacionalidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableAutor);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 330, 350));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Livros");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 50, 30));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Autor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 50, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 795, 520));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAutor;
    private javax.swing.JTable TableAutorLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
