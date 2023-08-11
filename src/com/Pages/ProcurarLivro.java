package com.Pages;

import com.Conection.Conection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class ProcurarLivro extends javax.swing.JPanel {
    private String id;
    private String title;
    private String status;
    private String geneOne;
    private String geneTwo;
    private String autor;
    private String nacionalidade;
    private String data;
    private String descr;
    
    public ProcurarLivro(String nome) {
        initComponents();
        
        inserirTabela(nome);
        inserirTableAutor(nome);
        inserirTableAv(nome);
    }

    public void inserirTabela(String nome){
       Conection con = new Conection();
       String sql = "SELECT * FROM Livro WHERE Titulo = '" + nome + "';"; 
       ResultSet res = con.executaBusca(sql);
       
       try {
           while(res.next()){
            id = res.getString("id");
            title = res.getString("Titulo");
            status = res.getString("Status");
            geneOne = res.getString("GeneOne");
            geneTwo = res.getString("GeneTwo");
            autor = res.getString("CodAutor");
            
            DefaultTableModel model = (DefaultTableModel) TableLivro.getModel();
        
            Object[] newRom = {id, title, geneOne, geneTwo, status, autor};
            model.addRow(newRom);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
    
    public void inserirTableAutor(String nome){
       Conection con = new Conection();
       String sql = "SELECT * FROM Autor A INNER JOIN Livro L ON A.Id = L.CodAutor WHERE L.Titulo = '" + nome + "';"; 
       ResultSet res = con.executaBusca(sql);
       
       try {
           while(res.next()){
            id = res.getString("id");
            autor = res.getString("Nome");
            nacionalidade = res.getString("Nacionalidade");
            
            DefaultTableModel model = (DefaultTableModel) TabelaAutor.getModel();
        
            Object[] newRom = {id, autor, nacionalidade};
            model.addRow(newRom);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
    
    public void inserirTableAv(String nome){
      Conection con = new Conection();
       String sql = "SELECT * FROM AVLivro WHERE Titulo = '" + nome + "';"; 
       ResultSet res = con.executaBusca(sql);
       
       try {
           while(res.next()){
            id = res.getString("id");
            title = res.getString("Titulo");
            data = res.getString("Data");
            descr = res.getString("Descrition");
            
            DefaultTableModel model = (DefaultTableModel) TableAV.getModel();
        
            Object[] newRom = {id, title, data, descr};
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAV = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableLivro = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaAutor = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Avalaição Autor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 180, 50));

        jLabel2.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Encontar Livro");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 30, 270, 50));

        jLabel3.setFont(new java.awt.Font("Harlow Solid Italic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Dados Livro");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 140, 50));

        jLabel4.setFont(new java.awt.Font("Harlow Solid Italic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Dados Autor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 170, 50));

        TableAV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Título", "Data", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableAV);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 580, 50));

        TableLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Título", "Gênero 1", "Gênero 2", "Status", "Autor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableLivro);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 580, 50));

        TabelaAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Nacionalidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TabelaAutor);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 580, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 795, 520));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaAutor;
    private javax.swing.JTable TableAV;
    private javax.swing.JTable TableLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
