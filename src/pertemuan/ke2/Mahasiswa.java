package pertemuan.ke2;

import javax.swing.*;
import java.nio.channels.CancelledKeyException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm, nama;
    Date tanggalLahir;

    void tampilkanIdentitasDiri() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("NPM : " + this.npm);
        System.out.println("NAMA : " + this.nama);
        System.out.println("TANGGAL LAHIR : " + sdf.format(this.tanggalLahir));
    }

    int hitungUsia() {
        Calendar tglLahir = Calendar.getInstance();
        tglLahir.setTime(this.tanggalLahir);
        Calendar hariIni = Calendar.getInstance();

        int selisih = hariIni.get(Calendar.YEAR) - tglLahir.get(Calendar.YEAR);
        if (hariIni.get(Calendar.MONTH) < tglLahir.get(Calendar.MONTH)) {
            selisih--;
        } else {
            if (hariIni.get(Calendar.MONTH) == tglLahir.get(Calendar.MONTH)
                    &&
                    hariIni.get(Calendar.DAY_OF_MONTH) < tglLahir.get(Calendar.DAY_OF_MONTH)) {
                selisih--;
            }
        }
        return selisih;
    }

    double hitungKali(double param1, double param2)
    {
        return param1*param2;
    }
    void sapaNama(String nama)
    {
        JOptionPane.showMessageDialog(
                null, "Hai "+nama, "Ini Judul", JOptionPane.WARNING_MESSAGE);
    }
}