/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Update {

    static void edit(String id, String nama, String harga, Integer jumlah, String total) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  Koneksi connect = new Koneksi();

    public void edit(String id, String nama, String kategori, String harga_beli, String harga_jual, String jumlah_barang) {

        try {

            connect.koneksi();
            Statement statement = connect.con.createStatement();

            String sql_nama = "update data_barang set nama_barang='" + nama + "'where kode='" + id + "'";
            String sql_kategori = "update data_barang set kategori='" + kategori + "'where kode='" + id + "'";
            String sql_harga_beli = "update data_barang set harga_beli='" + harga_beli + "'where kode='" + id + "'";
            String sql_harga_jual = "update data_barang set harga_jual='" + harga_jual + "'where kode='" + id + "'";
            String sql_jumlah = "update data_barang set jumlah_barang='" + jumlah_barang + "'where kode='" + id + "'";

            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_harga_beli);
            statement.executeUpdate(sql_kategori);
            statement.executeUpdate(sql_harga_jual);
            statement.executeUpdate(sql_jumlah);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    
  
  
  

    }    
}
