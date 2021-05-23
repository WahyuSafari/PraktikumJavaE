package id.ac.Java;

import javax.swing.*;
import java.util.Scanner;

public class BelajarInput {
    public static void main(String[] args) {

        String namalengkap;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama Lengkap Anda : ");
        namalengkap = input.nextLine();

        System.out.println("Nama Lengkap anda Adalah : "+namalengkap);

    }
}
