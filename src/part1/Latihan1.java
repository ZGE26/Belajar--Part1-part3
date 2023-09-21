package part1;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        String nama, alamat;
        int usia, uangBulanan;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
        System.out.print("Nama Mahasiswa: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        // Tampilkan outpu lagi
        System.out.print("Alamat: ");
        // menggunakan scanner lagi
        alamat = keyboard.nextLine();

        System.out.print("Usia: ");
        usia = keyboard.nextInt();

        System.out.print("UANG BULANAN: ");
        uangBulanan = keyboard.nextInt();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama Mahasisawa: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("UANG BULANAN: Rp " + uangBulanan);

        keyboard.close();
    }
}
