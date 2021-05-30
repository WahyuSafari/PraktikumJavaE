package pertemuan.ke2;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class MahasiswaBeraksiMethod {

    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs2 = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");
        mhs2.npm = "16630020";
        mhs2.nama = "Fadillah";
        mhs2.tanggalLahir = formatTanggal.parse("09-08-2002");

        mhs2.tampilkanIdentitasDiri();
        System.out.println("Usia : "+mhs2.nama+" Adalah "+mhs2.hitungUsia()+" Tahun");
        System.out.println(mhs2.hitungKali(7,9));
        mhs2.sapaNama("Rina Apriani");
    }
}
