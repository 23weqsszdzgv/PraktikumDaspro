import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Cek Bilangan Genap atau Ganjil (Ternary Operator) ---");
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        // Menggunakan Ternary Operator
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Bilangan " + angka + " adalah " + hasil);

        input.close();
    }
}
