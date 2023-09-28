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


public boolean inserirItem(ItemDTO itemDTO){
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "Insert into itens (nome, "
                + "preco, nome_mercado) values ( " 
                + "'" + itemDTO.getNome() + "', " 
                + itemDTO.getPreco() + "', "
                + itemDTO.getNome_mercado() + "', "
                + itemDTO.getId_usuario() + "', ) ";
        
        stmt.execute(comando.toUpperCase());
        
        ConexaoDAO.con.commit();
        
        stmt.close();
        return true;
    }//Fecha try
    catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
    }//Fecha catch
    finally{
        ConexaoDAO.CloseDB();
    }//Fecha finally
} //Fecha método inserirItem

public boolean editarItem(ItemDTO itemDTO){
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "UPDATE Itens "
                + "SET nome = '" + itemDTO.getNome() + "',"
                + "preco = '" + itemDTO.getPreco() + "',"
                + "nome_mercado = '" + itemDTO.getNome_mercado() 
                + "' WHERE id_item = '" + itemDTO.getId_item() + "';";
        
        stmt.execute(comando.toUpperCase());
        
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

public boolean removerItem(ItemDTO itemDTO){
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "DELETE FROM itens"
                + "' WHERE id_item = '" + itemDTO.getId_item()
                + "';";
        
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

public boolean selecionarItem(ItemDTO itemDTO, UsuarioDTO usuarioDTO){
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "SELECT * FROM itens i INNER JOIN usuarios u" 
                + "ON u.id_usuario = i.id_usuario"
                + "' WHERE u.id_usuario = '" + usuarioDTO.getId_usuario() + "' "
                + "ORDER BY '" + itemDTO.getNome() + "';";
        
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

}//Fecha classe ItemDAO
