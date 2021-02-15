package com.ahmadihwan.praktikumpenjualan;

import com.ahmadihwan.praktikumpenjualan.db.Database;
import com.ahmadihwan.praktikumpenjualan.model.JenisBarang;
import java.sql.Connection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        Database db = new Database();
        Connection con = db.getConnection();
        
        JenisBarang jenisBarang = new JenisBarang(con);
//        jenisBarang.setNamaJenisBarang("TESTING namajenisbarang");
//        jenisBarang.create();

//        ArrayList<Object> list = jenisBarang.read();
//        JenisBarang jb = (JenisBarang) list.get(1);
//        System.out.println(jb.getNamaJenisBarang());

        jenisBarang.setId((10));
        jenisBarang.setNamaJenisBarang("Sepuluh");
        jenisBarang.update();
    }
}
