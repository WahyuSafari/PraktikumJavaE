package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hewan {
    String nama, jenis;
    Integer jumlahKaki;
    Date  tanggalLahir;

    public Hewan(String nama, String jenis , Integer jumlahKaki){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.nama = nama;
        this.jenis = jenis;
        this.jumlahKaki = jumlahKaki;

        System.out.println(nama+" "+jumlahKaki);
    }
}

