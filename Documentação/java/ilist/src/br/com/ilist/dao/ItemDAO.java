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
        
        String comando = "Insert into Item (id_item, nome, "
                + "preco, nome_mercado) values ( " 
                + "'" + itemDTO.getId_item() + "', "
                + itemDTO.getNome() + "', " 
                + itemDTO.getPreco() + "', "
                + itemDTO.getNome_mercado() + "') ";
        
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

}//Fecha classe ItemDAO
