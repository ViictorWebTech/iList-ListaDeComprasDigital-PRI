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
import br.com.ilist.dto.UsuarioDTO;
import br.com.ilist.dao.UsuarioDAO;
import br.com.ilist.dao.ConexaoDAO;

public class UsuarioCTR {
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    public UsuarioCTR(){
        }
        public String inserirUsuario(UsuarioDTO usuarioDTO){
            try{
                if(usuarioDAO.inserirUsuario(usuarioDTO)){
                    return "Usuário cadastrado com sucesso!!";
                }else{
                    return "Usuário NÃO cadastrado";
                }
            }catch (Exception e){
                        System.out.println(e.getMessage());
                        return "Usuário NÃO cadastrado";
                        }
            
        }//Fecha método inserirUsuario
        
            public String editarUsuario(UsuarioDTO usuarioDTO){
            try{
                if(usuarioDAO.editarUsuario(usuarioDTO)){
                    return "Usuário editado com sucesso!!";
                }else{
                    return "Usuário NÃO editado";
                }
            }catch (Exception e){
                        System.out.println(e.getMessage());
                        return "Usuário NÃO editado";
                        }
            
        }//Fecha método editarUsuario
            
            public ResultSet selecionarUsuario(UsuarioDTO usuarioDTO, int opcao){
                ResultSet rs = null;
                
                rs = usuarioDAO.selecionarUsuario(usuarioDTO, opcao);
                
                return rs;
            }//Fecha método selecionarUsuario
            
            public void CloseDB(){
                ConexaoDAO.CloseDB();
            }//Fecha método CLoseDB
        
}
