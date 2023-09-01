package Tugas;

import java.util.Scanner;
import java.text.DecimalFormat;

class Buku {
    String jenis;
    int WaktuPinjam;
    double denda;

    public Buku(String jenis, int WaktuPinjam) {
        this.jenis = jenis;
        this.WaktuPinjam = WaktuPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        if (WaktuPinjam > 10) {
            if (jenis.equals("Pelajaran")) {
                denda = (WaktuPinjam - 10) * 2000;
            } else if (jenis.equals("Novel")) {
                denda = (WaktuPinjam - 10) * 5000;
            } else if (jenis.equals("Skripsi")) {
                denda = (WaktuPinjam - 10) * 10000;
            } else {
                System.out.println("Jenis buku tidak valid.");
            }
        } else {
            denda = 0;
        }
    }

    void tampilInfo() {
        DecimalFormat desimal = new DecimalFormat("0.00");
        System.out.println("\nJenis Buku: " + jenis);
        System.out.println("Waktu Peminjaman: " + WaktuPinjam + " Hari");
        System.out.println("Denda: Rp. " + desimal.format(denda));
    }
}

public class Books {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nJenis buku yang tersedia:");
        System.out.println("1. Pelajaran");
        System.out.println("2. Novel");
        System.out.println("3. Skripsi");

        int jenisBuku;
        String jenis;
        do {
            System.out.print("Masukkan jenis buku : ");
            jenisBuku = input.nextInt();
            switch (jenisBuku) {
                case 1:
                    jenis = "Pelajaran";
                    break;
                case 2:
                    jenis = "Novel";
                    break;
                case 3:
                    jenis = "Skripsi";
                    break;
                default:
                    System.out.println("Pilihan buku tidak valid. Silakan masukkan kembali.");
                    jenis = null;
                    break;
            }
        } while (jenis == null);

        System.out.print("Masukkan Waktu meminjam: ");
        int WaktuPinjam = input.nextInt();
        input.close();

        Buku buku = new Buku(jenis, WaktuPinjam);
        buku.tampilInfo();
    }
}
