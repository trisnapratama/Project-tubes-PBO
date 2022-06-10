package database;

/**
 *
 * @author Asus
 */
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    public static java.sql.Connection koneksi;
    public static java.sql.Connection getkoneksi(){
        
        if(koneksi==null){
            try{
                String url = "jdbc:mysql://localhost:3306/db_design";
                String user = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = (java.sql.Connection)
                        (Connection)
                        DriverManager.getConnection(url,user,password);
                
            }catch(SQLException t){
                System.out.println("Koneksi Gagal");
            }
        }
        return koneksi;
    }
public java.sql.Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet.");
    
    }
}
