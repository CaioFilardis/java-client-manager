/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infoq.dal;
import java.sql.*;

/**
 *
 * @author Caio
 */
public class Conexao {
    
    public static Connection conector() {
        java.sql.Connection conexao = null;
        
        // chamar drive
        String driver = "com.mysql.cj.jdbc.Driver";
        
        
        // informações referente ao BD Local
        String url = "jdbc:mysql://localhost:3306/dbinfo";
        String user = "root";
        String password = "";
        
        // informações referente ao BD Hospedados
        /*String url = "jdbc:mysql://auth-db1596.hstgr.io:3306/dbinfoq";
        String user = "u947237277_caio@%";
        String password = "#F0rt&5252744@!";*/
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    
}
