/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database1;

/**
 *
 * @author hp
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksicrud {
    Connection cn;
    public static Connection BukaKoneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/latihan_crud", "root", "");
            return cn;
            }catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
               return null;
        }
    }
}
