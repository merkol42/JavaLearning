/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postgresqljava;

/**
 *
 * @author merkol
 */
public class PostgreSQLJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectionTest con = new ConnectionTest();
        
        con.commitAndRollBack();
    }
    
}
