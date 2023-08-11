package com.Pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JLabel;

public class Window extends javax.swing.JFrame {
    private final String TITLE = "Book Collection";
    private Main main;
    private AdcLivro livro;
    private AdcAutor autor;
    private Avaliation av;
    private ListarListros ListLivro;
    private ListarAutor ListAutor;
    private ProcurarLivro procurar;
    
    public Window() {
        initComponents();
        setTitle(TITLE);
        this.setResizable(false);
        
        main = new Main();
        main.setSize(795,520);
        main.setLocation(0, 0);
        
        Container.removeAll();
        Container.add(main, BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
        
        dataSO();
    }
    
    public void dataSO(){
         // Obtém a data atual do sistema
        LocalDate dataAtual = LocalDate.now();
        
        // Você também pode formatar a data conforme desejado
        String dataFormatada = dataAtual.toString(); // Data no formato padrão (yyyy-MM-dd)
        
        String dataPersonalizada = "Welcome, " + dataAtual.getDayOfMonth() + " de " + dataAtual.getMonthValue() + " de " + dataAtual.getYear();
        Data.setText(dataPersonalizada);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        ProcurarLivro = new javax.swing.JTextField();
        Avaliation = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ListarAutores = new javax.swing.JLabel();
        AdcAutor = new javax.swing.JLabel();
        AdcLivro = new javax.swing.JLabel();
        ListarLivros = new javax.swing.JLabel();
        BtnLupa = new javax.swing.JLabel();
        BarraPesquisa = new javax.swing.JPanel();
        Data = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main.setBackground(new java.awt.Color(71, 71, 71));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(51, 51, 51));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/Logo3.png"))); // NOI18N
        Logo.setText("jLabel1");
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoMouseClicked(evt);
            }
        });
        Menu.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 185, 91));

        ProcurarLivro.setBackground(new java.awt.Color(51, 51, 51));
        ProcurarLivro.setForeground(new java.awt.Color(255, 255, 255));
        ProcurarLivro.setText("Procurar Livros");
        ProcurarLivro.setBorder(null);
        ProcurarLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProcurarLivroKeyPressed(evt);
            }
        });
        Menu.add(ProcurarLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 20));

        Avaliation.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        Avaliation.setForeground(new java.awt.Color(255, 255, 255));
        Avaliation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Avaliation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/Avaliation.png"))); // NOI18N
        Avaliation.setText("   Realizar avaliação");
        Avaliation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AvaliationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AvaliationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AvaliationMouseExited(evt);
            }
        });
        Menu.add(Avaliation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, 50));
        Menu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, 20));

        ListarAutores.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        ListarAutores.setForeground(new java.awt.Color(255, 255, 255));
        ListarAutores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListarAutores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/pessoa.png"))); // NOI18N
        ListarAutores.setText("          Listar Autores");
        ListarAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListarAutoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListarAutoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListarAutoresMouseExited(evt);
            }
        });
        Menu.add(ListarAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, 50));

        AdcAutor.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        AdcAutor.setForeground(new java.awt.Color(255, 255, 255));
        AdcAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdcAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/pessoa.png"))); // NOI18N
        AdcAutor.setText("      Adicionar Autor");
        AdcAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdcAutorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdcAutorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdcAutorMouseExited(evt);
            }
        });
        Menu.add(AdcAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 230, 50));

        AdcLivro.setBackground(new java.awt.Color(51, 51, 51));
        AdcLivro.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        AdcLivro.setForeground(new java.awt.Color(255, 255, 255));
        AdcLivro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdcLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/LendoLivro.png"))); // NOI18N
        AdcLivro.setText("       Adicionar Livro");
        AdcLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AdcLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdcLivroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdcLivroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdcLivroMouseExited(evt);
            }
        });
        Menu.add(AdcLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 50));

        ListarLivros.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        ListarLivros.setForeground(new java.awt.Color(255, 255, 255));
        ListarLivros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListarLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/LendoLivro.png"))); // NOI18N
        ListarLivros.setText("             Listar Livros");
        ListarLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListarLivrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListarLivrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListarLivrosMouseExited(evt);
            }
        });
        Menu.add(ListarLivros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 230, 50));

        BtnLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagens/Lupa.png"))); // NOI18N
        BtnLupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLupaMouseClicked(evt);
            }
        });
        Menu.add(BtnLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 30, -1));

        Main.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 720));

        BarraPesquisa.setBackground(new java.awt.Color(0, 153, 153));
        BarraPesquisa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Data.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        Data.setForeground(new java.awt.Color(255, 255, 255));
        BarraPesquisa.add(Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 600, 20));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book  Collection/ Gestão Biblioteca");
        BarraPesquisa.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 330, 20));

        Main.add(BarraPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 795, 150));

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Access Every Knowledge");
        Main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 160, 20));

        Container.setBackground(new java.awt.Color(71, 71, 71));

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        Main.add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 795, 520));

        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdcLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdcLivroMouseClicked
        livro = new AdcLivro();
        livro.setSize(795,520);
        livro.setLocation(0, 0);
        
        Container.removeAll();
        Container.add(livro, BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
    }//GEN-LAST:event_AdcLivroMouseClicked

    private void LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseClicked
        main = new Main();
        main.setSize(795,520);
        main.setLocation(0, 0);
        
        Container.removeAll();
        Container.add(main, BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
    }//GEN-LAST:event_LogoMouseClicked

    private void AdcAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdcAutorMouseClicked
        autor = new AdcAutor();
        autor.setSize(795,520);
        autor.setLocation(0, 0);
        
        Container.removeAll();
        Container.add(autor, BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
    }//GEN-LAST:event_AdcAutorMouseClicked

    private void AdcLivroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdcLivroMouseEntered
        AdcLivro.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_AdcLivroMouseEntered

    private void AdcLivroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdcLivroMouseExited
        AdcLivro.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_AdcLivroMouseExited

    private void AdcAutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdcAutorMouseEntered
       AdcAutor.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_AdcAutorMouseEntered

    private void AdcAutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdcAutorMouseExited
        AdcAutor.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_AdcAutorMouseExited

    private void AvaliationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvaliationMouseEntered
        Avaliation.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_AvaliationMouseEntered

    private void AvaliationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvaliationMouseExited
        Avaliation.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_AvaliationMouseExited

    private void ListarLivrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarLivrosMouseEntered
        ListarLivros.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_ListarLivrosMouseEntered

    private void ListarLivrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarLivrosMouseExited
        ListarLivros.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_ListarLivrosMouseExited

    private void ListarAutoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarAutoresMouseEntered
        ListarAutores.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_ListarAutoresMouseEntered

    private void ListarAutoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarAutoresMouseExited
         ListarAutores.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_ListarAutoresMouseExited

    private void AvaliationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvaliationMouseClicked
        av = new Avaliation();
        av.setSize(795,520);
        av.setLocation(0, 0);
        
        Container.removeAll();
        Container.add(av, BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
    }//GEN-LAST:event_AvaliationMouseClicked

    private void ListarLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarLivrosMouseClicked
        ListLivro = new ListarListros();
        ListLivro.setSize(795,520);
        ListLivro.setLocation(0, 0);
        
        Container.removeAll();
        Container.add(ListLivro, BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
    }//GEN-LAST:event_ListarLivrosMouseClicked

    private void ListarAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarAutoresMouseClicked
        ListAutor = new ListarAutor();
        ListAutor.setSize(795,520);
        ListAutor.setLocation(0, 0);
        
        Container.removeAll();
        Container.add(ListAutor, BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
    }//GEN-LAST:event_ListarAutoresMouseClicked

    private void BtnLupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLupaMouseClicked
        procurar = new ProcurarLivro(ProcurarLivro.getText());
        procurar.setSize(795,520);
        procurar.setLocation(0, 0);
        
        Container.removeAll();
        Container.add(procurar, BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
    }//GEN-LAST:event_BtnLupaMouseClicked

    private void ProcurarLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProcurarLivroKeyPressed
        int cod = evt.getKeyCode();
        if(cod == KeyEvent.VK_ENTER){
            procurar = new ProcurarLivro(ProcurarLivro.getText());
            procurar.setSize(795,520);
            procurar.setLocation(0, 0);
        
            Container.removeAll();
            Container.add(procurar, BorderLayout.CENTER);
            Container.revalidate();
            Container.repaint();
        }
    }//GEN-LAST:event_ProcurarLivroKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdcAutor;
    private javax.swing.JLabel AdcLivro;
    private javax.swing.JLabel Avaliation;
    private javax.swing.JPanel BarraPesquisa;
    private javax.swing.JLabel BtnLupa;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel ListarAutores;
    private javax.swing.JLabel ListarLivros;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Menu;
    private javax.swing.JTextField ProcurarLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
