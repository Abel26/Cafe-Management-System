/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DbOperations {
    public static void setDataOrDelete(String query, String msg) {
        Connection connection = null;
        Statement statement = null;
        try {
            // Mendapatkan koneksi
            connection = ConnectionProvider.getCon();
            
            // Membuat pernyataan SQL
            statement = connection.createStatement();
            
            // Mengeksekusi query
            statement.executeUpdate(query);
            
            // Menampilkan pesan jika diperlukan
            if (!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        } catch (SQLException e) {
            // Menangani pengecualian SQL
            JOptionPane.showMessageDialog(null, e.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Menangani pengecualian umum
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Menutup koneksi dan pernyataan
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                // Menangani pengecualian saat menutup koneksi
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
