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
import java.sql.ResultSet;
import br.com.ilist.dto.ItemDTO;
import br.com.ilist.dao.ItemDAO;
import br.com.ilist.dto.UsuarioDTO;
import br.com.ilist.dao.UsuarioDAO;
import br.com.ilist.dao.ConexaoDAO;

public class ItemCTR {

    ItemDAO itemDAO = new ItemDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    public ItemCTR() {
    }

    public String inserirItem(ItemDTO itemDTO) {
        try {
            if (itemDAO.inserirItem(itemDTO)) {
                return "Item cadastrado com sucesso!!";
            } else {
                return "Item NÃO cadastrado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Item NÃO cadastrado";
        }

    }//Fecha método inserirUsuario

    public String editarItem(ItemDTO itemDTO) {
        try {
            if (itemDAO.editarItem(itemDTO)) {
                return "Item editado com sucesso!!";
            } else {
                return "Item NÃO editado";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Item NÃO editado";
        }

    }//Fecha método editarUsuario

//    public ResultSet selecionarItem(ItemDTO itemDTO, UsuarioDTO usuarioDTO, int opcao) {
    public ResultSet selecionarItem(ItemDTO itemDTO, int opcao) {
        ResultSet rs = null;

//                rs = itemDAO.selecionarItem(itemDTO, usuarioDTO, opcao);
        rs = itemDAO.selecionarItem(itemDTO, opcao);

        return rs;
    }//Fecha método selecionarUsuario

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }//Fecha método CLoseDB

}
