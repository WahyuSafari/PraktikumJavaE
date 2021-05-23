package id.ac.Java;

import javax.swing.*;

public class DataType {
    public static void main(String[] args) {
        String namaDepan    = "Muhammad";
        String namaTengah   = "Rasyid";
        String namaBelakang = "Ridho";
        int usia            = 18;
        int targetTahunKuliah = 4;
        double ipk            = 3.8;
        char nilaiAbjad       = 'A';
        boolean tampan        = true;

        System.out.println("Nama Depan : "+ namaDepan);
        System.out.println("Nama Tengah :"+ namaTengah);
        System.out.println("Nama Belakang :"+ namaBelakang);
        System.out.println("Usia : "+usia);
        System.out.println("Target Kuliah :"+targetTahunKuliah+ " Tahun");
        System.out.println("IPK : "+ipk);
        System.out.println("Nilai Abjad : "+nilaiAbjad);
        System.out.println("Tampan :"+tampan);

        JOptionPane.showMessageDialog(
                null, "hallo "+namaDepan+" "+namaTengah+" "+namaBelakang, "Ini Judul", JOptionPane.WARNING_MESSAGE);
    }
}
