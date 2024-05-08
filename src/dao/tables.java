/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class tables {
    public static void main(String[] args) {
        try {
            // Mendefinisikan tabel pengguna
            String userTable = "CREATE TABLE IF NOT EXISTS user ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(255) NOT NULL,"
                    + "email VARCHAR(255) NOT NULL UNIQUE,"
                    + "mobileNumber VARCHAR(255) NOT NULL,"
                    + "address VARCHAR(255) NOT NULL,"
                    + "password VARCHAR(255) NOT NULL,"
                    + "securityQuestion VARCHAR(255) NOT NULL,"
                    + "answer VARCHAR(255) NOT NULL,"
                    + "status VARCHAR(20) NOT NULL"
                    + ")";
            
            // Memanggil metode untuk membuat atau menghapus tabel
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
        } catch(Exception e) {
            // Menampilkan pesan kesalahan jika terjadi pengecualian
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
