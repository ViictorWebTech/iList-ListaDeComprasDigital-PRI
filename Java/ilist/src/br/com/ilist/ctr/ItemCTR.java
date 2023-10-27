/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ilist.ctr;

/**
 *
 * @author Aluno
 */
import java.sql.*;
import br.com.ilist.dto.ItemDTO;
import br.com.ilist.dao.ItemDAO;
import br.com.ilist.dto.UsuarioDTO;
import br.com.ilist.dao.ConexaoDAO;

public class ItemCTR {

    ItemDAO itemDAO = new ItemDAO();

    public ItemCTR() {
    }

    public String inserirItem(ItemDTO itemDTO, UsuarioDTO usuarioDTO) {
        try {
            if (itemDAO.inserirItem(itemDTO, usuarioDTO)) {
                return "Item cadastrado com sucesso!!";
            } else {
                return "Item NÃO cadastrado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Item NÃO cadastrado";
        }

    }//Fecha método inserirUsuario

    public String editarItem(ItemDTO itemDTO, UsuarioDTO usuarioDTO) {
        try {
            if (itemDAO.editarItem(itemDTO, usuarioDTO)) {
                return "Item editado com sucesso!!";
            } else {
                return "Item NÃO editado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Item NÃO editado";
        }

    }//Fecha método editarUsuario
    
    public String removerItem(ItemDTO itemDTO, UsuarioDTO usuarioDTO){
        try{
            if(itemDAO.removerItem(itemDTO, usuarioDTO)){
                return "Item excluído com Sucesso!!!";
            }else{
                return "Item NÃO Excluído!!!";
            }
          } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Item NÃO Excluído!!!";
        }
    }

//    public ResultSet selecionarItem(ItemDTO itemDTO, UsuarioDTO usuarioDTO, int opcao) {
    public ResultSet selecionarItem(ItemDTO itemDTO, UsuarioDTO usuarioDTO, int opcao) {
        ResultSet rs = null;

//                rs = itemDAO.selecionarItem(itemDTO, usuarioDTO, opcao);
        rs = itemDAO.selecionarItem(itemDTO, usuarioDTO, opcao);

        return rs;
    }//Fecha método selecionarUsuario

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }//Fecha método CLoseDB

}
