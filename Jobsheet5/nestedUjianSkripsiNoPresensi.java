import java.util.Scanner;

public class nestedUjianSkripsiNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah Anda bebas kompen? (Yes/No): ");
        String bebasKompen = sc.nextLine().trim();

        if (bebasKompen.equalsIgnoreCase("Yes")) {
            System.out.print("Masukkan jumlah bimbingan Pembimbing 1: ");
            int bimbinganP1 = sc.nextInt();
            System.out.print("Masukkan jumlah bimbingan Pembimbing 2: ");
            int bimbinganP2 = sc.nextInt();

            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Anda dapat mendaftar ujian skripsi.";
            } else {
                pesan = "Bimbingan belum memenuhi syarat.";
            }
        } else {
            pesan = "Tidak dapat mendaftar karena belum bebas kompen.";
        }

        System.out.println(pesan);
    }
}
