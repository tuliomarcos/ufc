package conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConectaBanco {
    public Statement stm; //responsavel por preparar e realizar pesquisa dentro do banco de dados
    public ResultSet rs; // responsável por armazenar o resultado de uma pesquisa passada para o statement
    private String driver;
    private String caminho;
    private String usuario;
    private String senha;
    private Connection conect; // responsável por realizar a conexão com o banco de dados
    
    public void conexao(){
        try {// (como se fosse um if/else) é uma tentativa e erro, o try = tentativa inicial
            System.setProperty("jdbc.Drivers", driver); //seta a propriedade do driver de conexão
            this.conect = DriverManager.getConnection(this.caminho, this.usuario, this.senha); //realiza a conexão com o banco de dados, o banco retorna true or false
            System.out.println("Conectado com sucesso!");
//            JOptionPane.showMessageDialog(null, "Conectado com sucesso!"); //imprime caixa de texto da tela
        } catch (SQLException ex) {//(excessão)O que ira acontecer se não der certo o que foi programado dentro do try
            System.out.println("ERRO de conexão!\nErro: " + ex.getMessage());
//            JOptionPane.showMessageDialog(null, "ERRO de conexão!\nErro: " + ex.getMessage());
//            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void desconect (){
        try {
            this.conect.close();
        } catch (SQLException ex) {
            System.out.println("ERRO ao fechar a conexão!\nErro: " + ex.getMessage());
//            JOptionPane.showMessageDialog(null, "ERRO ao fechar a conexão!\nErro: " + ex.getMessage());
        }
    }
}
