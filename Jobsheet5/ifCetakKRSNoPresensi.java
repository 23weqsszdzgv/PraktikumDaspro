import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Cetak KRS ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        // Modifikasi IF-ELSE menjadi Ternary Operator
        String hasil = (uktLunas) ? "KRS berhasil dicetak." : "KRS tidak dapat dicetak karena UKT belum lunas.";
        System.out.println(hasil);

        input.close();
    }
}
