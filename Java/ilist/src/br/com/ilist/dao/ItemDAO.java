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

import br.com.ilist.dto.ItemDTO;
import br.com.ilist.dto.UsuarioDTO;
import java.sql.*;


public class ItemDAO {

    
//Método construtor da classe
public ItemDAO(){
}    

private ResultSet rs = null;
private Statement stmt = null;


public boolean inserirItem(ItemDTO itemDTO, UsuarioDTO usuarioDTO){
    String comando = "";
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
//        String comando = "Insert into itens(id_usuario, nome, "
//                + "nome_mercado, preco) values (" 
//                + "'" + itemDTO.getId_usuario() + "', '" 
//                + itemDTO.getNome() + "', '"
//                + itemDTO.getNome_mercado() + "', '"
//                + itemDTO.getPreco() + "');";

 comando = "Insert into itens(nome, "
                + "preco, nome_mercado, id_usuario) values (" 
                + "'" + itemDTO.getNome() + "', '"
                + itemDTO.getPreco() + "', '"
                + itemDTO.getNome_mercado() + "', "
                + usuarioDTO.getId_usuario() + ");";
        
 System.out.println(comando);
        stmt.execute(comando);
        
        ConexaoDAO.con.commit();
        
        stmt.close();
        return true;
    }//Fecha try
    catch (Exception e) {
        System.out.println("Erro ItemDAO " + e.getMessage());
        return false;
    }//Fecha catch
    finally{
        ConexaoDAO.CloseDB();
    }//Fecha finally
} //Fecha método inserirItem

public boolean editarItem(ItemDTO itemDTO, UsuarioDTO usuarioDTO){
    String comando = "";
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        
         comando = "UPDATE Itens "
                + "SET nome = '" + itemDTO.getNome() + "',"
                + "preco = '" + itemDTO.getPreco() + "',"
                + "nome_mercado = '" + itemDTO.getNome_mercado()  
                + "' WHERE id_item = " + itemDTO.getId_item() + " AND "
                + "id_usuario = " + usuarioDTO.getId_usuario() + ";";
        
        stmt.execute(comando);
        
        ConexaoDAO.con.commit();
        
        stmt.close();
        return true;
    }//Fecha Try
   catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
    }//Fecha catch
    finally{
        ConexaoDAO.CloseDB();
    }//Fecha finally
} //Fecha método editarItem

public boolean removerItem(ItemDTO itemDTO, UsuarioDTO usuarioDTO){
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "DELETE FROM itens"
                + " WHERE id_item = " + itemDTO.getId_item()
                + " AND id_usuario = " + usuarioDTO.getId_usuario() +";";
        
        stmt.execute(comando);
        
        ConexaoDAO.con.commit();
        
        stmt.close();
        return true;
    }//Fecha Try
   catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
    }//Fecha catch
    finally{
        ConexaoDAO.CloseDB();
    }//Fecha finally
} //Fecha método removerItem

//public ResultSet selecionarItem(ItemDTO itemDTO, UsuarioDTO usuarioDTO, int opcao){
public ResultSet selecionarItem(ItemDTO itemDTO, UsuarioDTO usuarioDTO, int opcao){
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
 

String comando = "";
switch(opcao){
    case 1:
               
//        String comando = "SELECT * FROM itens i INNER JOIN usuarios u" 
//                + "ON u.id_usuario = i.id_usuario"
//                + "' WHERE u.id_usuario = '" + usuarioDTO.getId_usuario() + "' "
//                + "ORDER BY '" + itemDTO.getNome() + "';";
        
         comando = "SELECT nome, nome_mercado, preco FROM itens i, usuarios u" 
                + " WHERE i.nome ilike '%" + itemDTO.getNome() + "%'" 
                + "AND i.id_usuario = " + usuarioDTO.getId_usuario() + " ORDER BY nome;";
         break;
//    case 2: 
//         comando = "SELECT * FROM itens i INNER JOIN usuarios u" 
//                + "ON u.id_usuario = i.id_usuario"
//                + "' WHERE u.id_usuario = '" + usuarioDTO.getId_usuario() + "' "
//                + "ORDER BY '" + itemDTO.getNome() + "';";
//         break;
    case 2:
        comando = "SELECT nome, nome_mercado, preco from itens" +
                "WHERE id_item = " + itemDTO.getId_item() + "%"
                + "AND id_usuario = " + usuarioDTO.getId_usuario() + " ORDER BY id_item;";
        
        break;
}

System.out.println(comando);
rs = stmt.executeQuery(comando);
        return rs;
    }//Fecha Try
   catch (Exception e) {
        System.out.println(e.getMessage());
        return rs;
    }//Fecha catch
} //Fecha método selecionarItem


}//Fecha classe ItemDAO
