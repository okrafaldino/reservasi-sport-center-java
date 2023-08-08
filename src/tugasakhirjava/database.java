/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirjava;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author OKRAFALDINO
 */
public class database {
    
    private static Connection koneksi;
    public static Connection getkoneksi()
    {
       if (koneksi==null)
       {
           try {
               Class.forName("com.mysql.jdbc.Driver");
               koneksi=DriverManager.getConnection("jdbc:mysql://localhost/db_futsal","root","");
               System.out.println("DATABASE TERKONEKSI");
           } catch (Exception e) {
               System.out.println("DATABASE TIDAK TERKONEKSI"+e.getMessage());
           } }
    return koneksi;
    }
    public static void main(String[]args){
        database test=new database();
        test.getkoneksi();
        System.exit(0);  
    }
    
}
