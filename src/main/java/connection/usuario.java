/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
  public class usuario {
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto){
        conn = new connection().conectaBD();
       
        try {
            String sql= "select * from projeto where from email_responsavel = ? and codigo = ? ";
              PreparedStatement pstm = conn.prepareStatement(sql);
              pstm.setString(1, objusuariodto.getNome_usuario());
              pstm.setString(2, objusuariodto.getSenha_usuario());
              
              ResultSet rs = pstm.executeQuery();
              return rs;
              
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
            return null;
        }
    } 
}
