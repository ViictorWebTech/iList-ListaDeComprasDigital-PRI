



package br.com.ilist.dao;

/**
 *
 * @author Aluno
 */




import br.com.ilist.dto.UsuarioDTO;
import java.sql.*;

public class UsuarioDAO {
    
    
    //Método construtor da classe
public UsuarioDAO(){
}    

private ResultSet rs = null;
private Statement stmt = null;


public boolean inserirUsuario(UsuarioDTO usuarioDTO){
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "Insert into usuarios(nome_usuario, "
                + "email, senha) values ('" 
                + usuarioDTO.getNome_usuario() + "', '" 
                + usuarioDTO.getEmail() + "', '"
                + usuarioDTO.getSenha() + "');";
        
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

public boolean editarUsuario(UsuarioDTO usuarioDTO){
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "UPDATE usuarios "
                + "SET nome_usuario = '" + usuarioDTO.getNome_usuario() + "', "
                + "senha = '" + usuarioDTO.getSenha() + "',"
                + "email = '" + usuarioDTO.getEmail() 
                + "' WHERE id_usuario = '" + usuarioDTO.getId_usuario() + "';";
        
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

public boolean removerUsuario(UsuarioDTO usuarioDTO){
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "DELETE FROM usuarios"
                + " WHERE id_usuario = '" + usuarioDTO.getId_usuario()
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

public ResultSet selecionarUsuario(UsuarioDTO usuarioDTO, int opcao){
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "SELECT * FROM usuarios"
                + "' WHERE nome like '" + usuarioDTO.getNome_usuario() + "' "
                + "ORDER BY '" + usuarioDTO.getNome_usuario() + "';";
        
        ConexaoDAO.con.commit();
        
        stmt.close();
        return rs;
    }//Fecha Try
   catch (Exception e) {
        System.out.println(e.getMessage());
        return rs;
    }//Fecha catch
    finally{
        ConexaoDAO.CloseDB();
    }//Fecha finally
} //Fecha método removerItem
    
}
