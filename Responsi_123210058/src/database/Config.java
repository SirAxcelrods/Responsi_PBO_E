/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import javax.swing.JOptionPane; //import swing
import java.sql.*;              //import sql
/**
 *
 * @author PC PRAKTIKUM
 */
public class Config {
    Connection conn; //buat koneksinya
    
    public Config(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");  //driver koneksi ke database
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db", "root", ""); //intinya koneksi ke nama db trs ada username & password
        
        
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e); //jika error muncul pesan ini utk handle errornya
        }
}
    public Connection getConnection(){
    return conn; //mengenbalikan nilai koneksi td
    }
    
}
