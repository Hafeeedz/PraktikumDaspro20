package PraktikumDaspro20;
import java.util.Scanner;


public class StudiKasus2_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenis, status;
        int dokumen, juara, pendanaan;

        // Input data awal
        System.out.print("Nama mahasiswa  : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = sc.nextLine();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {
            // Cabang perlombaan (tingkat 1)
            System.out.print("Jumlah dokumen  : ");
            dokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                // Tingkat 2: juara 1, 2, atau 3
                if (dokumen == 4) {
                    // Tingkat 3: dokumen lengkap
                    status = "Berhak memperoleh dana penghargaan (Juara " + juara + ").";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).";
            }

        } else if (jenis.equalsIgnoreCase("PKM")) {
            // Cabang PKM (tingkat 1)
            System.out.print("Jumlah dokumen  : ");
            dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            pendanaan = sc.nextInt();

            if (pendanaan == 1) {
                // Tingkat 2: lolos pendanaan
                if (dokumen == 4) {
                    // Tingkat 3: dokumen lengkap
                    status = "Berhak memperoleh dana penghargaan (PKM lolos pendanaan).";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).";
            }

        } else {
            // Cabang Lainnya
            status = "Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).";
        }

        System.out.println("Status : " + status);

        sc.close();
    }
}