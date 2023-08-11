package com.Conection;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Conection {
  private String url;
  private String user;
  private String password;
  private Connection con;

    public Conection() {
        url = "jdbc:postgresql://localhost:5432/GestaoProjeto";
        user = "postgres";
        password = "******"; //Senha ficcional do BD
        
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int executaSQL(String sql){
        try {
            Statement stm = (Statement) con.createStatement();
            int res = stm.executeUpdate(sql);
            con.close();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public ResultSet executaBusca(String Sql){
        try {
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(Sql);
            con.close();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String executaCodigoLivro(){
       Conection con = new Conection();
       String sql = "SELECT CodigoLivro()"; 
       ResultSet res = con.executaBusca(sql);
       String codigoLivro = null;
       
       try {
           while(res.next()){
            codigoLivro = res.getString(1); 
           }
           return codigoLivro;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
    }
    
    public String executarCodigoAutor(){
       Conection con = new Conection();
       String sql = "SELECT CodigoAutor()"; 
       ResultSet res = con.executaBusca(sql);
       String codigoAutor = null;
       
       try {
           while(res.next()){
            codigoAutor = res.getString(1); 
           }
           return codigoAutor;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
    }
    
    public String executarCodigoAvaliation(){
        Conection con = new Conection();
       String sql = "SELECT CodigoAvaliation()"; 
       ResultSet res = con.executaBusca(sql);
       String avaliation = null;
       
       try {
           while(res.next()){
            avaliation = res.getString(1); 
           }
           return avaliation;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
    }
    
    public String procurarAutor(String nome){
       Conection con = new Conection();
       String sql = "SELECT Id FROM Autor WHERE Nome = '" + nome + "'"; 
       ResultSet res = con.executaBusca(sql);
       String codigoAutor = null;
       
       try {
           while(res.next()){
            codigoAutor = res.getString("Id"); 
           }
           return codigoAutor;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
    }
    
    public String procurarLivro(String nome){
        Conection con = new Conection();
       String sql = "SELECT Id FROM Livro WHERE Titulo = '" + nome + "'"; 
       ResultSet res = con.executaBusca(sql);
       String codigoLivro = null;
       
       try {
           while(res.next()){
            codigoLivro = res.getString("Id"); 
           }
           return codigoLivro;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
    }
}
