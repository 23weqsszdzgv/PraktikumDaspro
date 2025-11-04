import java.util.Scanner;

public class SearchNilaiPerubahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1️⃣ Masukkan banyaknya nilai yang akan diinputkan
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = input.nextInt();

        int[] arrNilai = new int[jumlah];

        // 2️⃣ Input nilai-nilai mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = input.nextInt();
        }

        // 3️⃣ Masukkan nilai yang ingin dicari
        System.out.print("\nMasukkan nilai yang ingin dicari: ");
        int key = input.nextInt();

        // 4️⃣ Proses pencarian
        int hasil = -1; // -1 berarti belum ketemu
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        // 5️⃣ Menampilkan hasil pencarian
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ditemukan di indeks ke-" + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam daftar.");
        }

        input.close();
    }
}
