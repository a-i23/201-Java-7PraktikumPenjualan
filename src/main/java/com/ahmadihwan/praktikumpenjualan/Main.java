package com.ahmadihwan.praktikumpenjualan;

import com.ahmadihwan.praktikumpenjualan.db.Database;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        Database db = new Database();
        Connection con = db.getConnection();
    }
}
