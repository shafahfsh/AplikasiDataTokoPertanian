/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Koneksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koneksi tesDatabase = new Koneksi();
        tesDatabase.koneksi();
    }

    static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     String status = "Tidak Terhubung";
     Connection con = null;
     
     
      public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost:3306/tokopertanian";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);

            status = "Terhubung";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Terhubung");
            e.printStackTrace();

        }
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

