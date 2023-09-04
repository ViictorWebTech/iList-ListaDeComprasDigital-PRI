/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ilist.dao;

/**
 *
 * @author Aluno
 */
import java.sql.*;
public class ConexaoDAO {
    
    
    public static Connection con = null;
    
    public ConexaoDAO() {
    }
    
    public static void ConectDB(){
        try{
            String dsn = "ilist";
            String user = "postgres";
            String senha = "postdba";
            
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            String url = "jdbc:postgresql://localhost:5432/" + dsn;
            
            con = DriverManager.getConnection(url, user, senha);
            
            con.setAutoCommit(false);
            if (con == null) {
                System.out.println("Erro ao abrir o banco de dadps Postgres");
            }
            /////////////////////////////////
            
            
        } //fecha try
        catch (Exception e) {
            System.out.println("Problema ao abrir a base de dados! " + 
                    e.getMessage());
        }//fecha o catch
    }//fecha o método ConectDB
    
    
    
    public static void CloseDB() {
        try{
            con.close();
        }//fecha o try
        
        catch (Exception e){
            System.out.println("Problema ao fechar a base de dados!" + e.getMessage());
        }//fecha o catch
    }//fecha o método CloseDB
 }//Fecha a classe ConexaoDAO
