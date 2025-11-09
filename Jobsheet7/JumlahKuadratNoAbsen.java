import java.util.Scanner;

public class JumlahKuadratNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int total = 0;

        System.out.println("Perhitungan kuadrat bilangan 1 s.d " + n + ":");
        for (int i = 1; i <= n; i++) {
            int kuadrat = i * i;
            total += kuadrat;
            System.out.println(i + " x " + i + " = " + kuadrat);
        }

        System.out.println("Jumlah kuadrat 1 s.d " + n + " adalah: " + total);
        sc.close();
    }
}
