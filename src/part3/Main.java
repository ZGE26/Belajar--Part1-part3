package part3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nama, jurusan, kelas;
        Scanner data = new Scanner(System.in);

        //Membuat Kolom untuk memasukan input yang di butuhkan
        System.out.print("Masukan Nama Anda : ");
        nama = data.nextLine();

        System.out.print("Masukan Kelas Anda : ");
        kelas = data.nextLine();
        
        System.out.print("Masukan Jurusan Anda : ");
        jurusan = data.nextLine();

        //Menampilkan Input yang telah dimunta
        System.out.println("Nama : " + nama );
        System.out.println("Kelas : " + kelas );
        System.out.println("NIM : " + jurusan );

        data.close();

        
    }
}
