package com.Pages;

import com.Conection.Conection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ListarListros extends javax.swing.JPanel {
    private String id;
    private String title;
    private String status;
    private String geneOne;
    private String geneTwo;
    private String autor;
    
    public ListarListros() {
        initComponents();
        inserirTabela();
    }
    
    public void inserirTabela(){
       Conection con = new Conection();
       String sql = "SELECT * FROM Livro"; 
       ResultSet res = con.executaBusca(sql);
       
       try {
           while(res.next()){
            id = res.getString("id");
            title = res.getString("Titulo");
            status = res.getString("Status");
            geneOne = res.getString("GeneOne");
            geneTwo = res.getString("GeneTwo");
            autor = res.getString("CodAutor");
            
            DefaultTableModel model = (DefaultTableModel) TableBook.getModel();
        
            Object[] newRom = {id, title, status, autor, geneOne, geneTwo};
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
        Table = new javax.swing.JScrollPane();
        TableBook = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(71, 71, 71));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setBackground(new java.awt.Color(51, 51, 51));

        TableBook.setAutoCreateRowSorter(true);
        TableBook.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        TableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Título", "Status", "Autor", "Gênero 1", "Gênero 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.setViewportView(TableBook);

        jPanel1.add(Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 760, 420));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Livros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 180, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 795, 520));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Table;
    private javax.swing.JTable TableBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
