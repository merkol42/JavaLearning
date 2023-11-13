/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresqljava;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author merkol
 */
public class ConnectionTest {
    private String user_name = "postgres";
    private String passwd = "1";
    
    private String db_name = "demo";
    private String host = "localhost";
    private int port = 5432;
    
    private Connection con = null;
    
    private Statement statement = null;

    public ConnectionTest() {
        String url = "jdbc:postgresql://" + host + ":" + port + "/" + db_name;
        
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println("Driver bulunamadı");
        }
        
        try {
            con = DriverManager.getConnection(url, user_name, passwd);
            statement = con.createStatement();
            System.out.println("Bağlantı başarılı!!");
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız!");
            ex.printStackTrace();
        }
    }
    
    public void getEmployees() {
        String query = "Select * From employees";
        
        try {
            
            
            ResultSet rs = statement.executeQuery(query);
            
            while (rs.next()) {
                System.out.print("id : " +rs.getInt("id"));
                System.out.print(" | name : " + rs.getString("name"));
                System.out.print(" | surname : " + rs.getString("surname"));
                System.out.println(" | email : " + rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void insertEmployee() {
        String query = "Insert Into employees (name,surname,email) VALUES('Muhammed', 'Yazıcı', 'mali@gmail.com')";
        System.out.println("************Öncesi*********");
        this.getEmployees();
        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("************Sonrası*********");
        this.getEmployees();
    }
    
    public void updateEmployee() {
        String query = "Update employees set email = 'zaaaxd@gmail.com' where id > 8 ";
        
        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteEmployee() {
        String query = "Delete from employees where id > 8";
        
        try {
            int count = statement.executeUpdate(query);
            System.out.println(count + " Veri tablodan silindi!");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // preparedStatement query (dynamic)
    private PreparedStatement preparedStatement = null;
    
    public void preparedGetEmployees() {
        String query = "Select * From employees where id > ? and name like ? ";
        
        
        ResultSet rs;
        try {
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, 6);
            preparedStatement.setString(2, "O%");
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void commitAndRollBack() {
        try {
            con.setAutoCommit(false);
            
            String query1 = "Delete From employees where id = 14";
            String query2 = "Update employees set email = 'meteez@gmail.com' where id = 6";
            
            System.out.println("Güncellemeden Önce !");
            this.getEmployees();
            
            Statement statement = con.createStatement();
            
            statement.executeUpdate(query1);
            statement.executeUpdate(query2); // query henüz çalışmadı
            
            int flag = 1;
            
            if (flag == 1) {
                con.commit(); // istekleri manuel çalıştır
                System.out.println("Veritabanı Güncellendi!");
                this.getEmployees();
            } else {
                con.rollback(); // buffer alınan istekler geri çekilir.
                System.out.println("Queryler iptal edildi");
                this.getEmployees();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
