package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");

        Date tglHariIni = new Date();
        mhs.npm = "17710033";
        mhs.nama = "Farida Norlita";
        mhs.tanggalLahir = formatTanggal.parse("17-01-1994");

        System.out.println("NPM : "+mhs.npm);
        System.out.println("NAMA : "+mhs.nama);
        System.out.println("TANGGAL LAHIR : "+formatTanggal.format(mhs.tanggalLahir));

        System.out.println("==========================================");

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.npm = "16630020";
        mhs2.nama = "Fadillah";
        mhs2.tanggalLahir = formatTanggal.parse("09-08-2002");

        System.out.println("NPM : "+mhs2.npm);
        System.out.println("NAMA : "+mhs2.nama);
        System.out.println("TANGGAL LAHIR : "+formatTanggal.format(mhs2.tanggalLahir));

        System.out.println("==========================================");
        System.out.println("Ini Menggunakan Method");
        System.out.println("==========================================");

        mhs.tampilkanIdentitasDiri();
        mhs2.tampilkanIdentitasDiri();
    }
}
