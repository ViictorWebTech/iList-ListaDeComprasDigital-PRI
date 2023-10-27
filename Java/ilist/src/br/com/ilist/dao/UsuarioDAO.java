



package br.com.ilist.dao;

/**
 *
 * @author Aluno
 */




import br.com.ilist.dto.UsuarioDTO;
import java.sql.*;

public class UsuarioDAO {
    
public UsuarioDAO(){
}    

private ResultSet rs = null;
private Statement stmt = null;


public boolean inserirUsuario(UsuarioDTO usuarioDTO){
    String comando = "";
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        comando = "Insert into usuarios(nome_usuario, "
                + "email, senha) values ('" 
                + usuarioDTO.getNome_usuario() + "', '" 
                + usuarioDTO.getEmail() + "', '"
                + "md5('" + usuarioDTO.getSenha() + "'));";
           System.out.println(comando);
            stmt.execute(comando);
        
        ConexaoDAO.con.commit();
        
        stmt.close();
        return true;
    }//Fecha try
    catch (Exception e) {
        System.out.println("Erro no UsuarioDAO:" + e.getMessage());
        return false;
    }//Fecha catch
    finally{
        ConexaoDAO.CloseDB();
    }//Fecha finally
} //Fecha método inserirIUsuario


public int logarUsuario(UsuarioDTO usuarioDTO){
    String comando = " ";
    try{
        ConexaoDAO.ConectDB();
        stmt = ConexaoDAO.con.createStatement();
        comando = "SELECT u.id_usuario FROM usuarios u"
                + " WHERE u.email = '" + usuarioDTO.getEmail() + "' "
                + "and u.senha = md5('" + usuarioDTO.getSenha() + "')";
        
        rs = null;
        rs = stmt.executeQuery(comando);
        if(rs.next()){
            return rs.getInt("id_usuario");
        }
        else{
            return 0;
        }
    }
    catch (Exception e) {
        System.out.println(e.getMessage());
        return 0;
    }
    finally{
        ConexaoDAO.CloseDB();
    }
}//Fecha metodo logarUsuario

public boolean editarUsuario(UsuarioDTO usuarioDTO){
    try{
        ConexaoDAO.ConectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "UPDATE usuarios "
                + "SET nome_usuario = '" + usuarioDTO.getNome_usuario() + "', "
                + "senha = md5('" + usuarioDTO.getSenha() + "'),"
                + "email = '" + usuarioDTO.getEmail() 
                + "' WHERE id_usuario = '" + usuarioDTO.getId_usuario() + "';";
        
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
