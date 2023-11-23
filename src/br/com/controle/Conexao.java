/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.controle;
import java.awt.List;
import java.sql.*;
/**
 *
 * @author lucas
 */
public class Conexao {
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/estoque";
        String user = "root";
        String password  = "123456";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    
}
