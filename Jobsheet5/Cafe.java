import java.util.Scanner;

public class Cafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String minuman, pilihan;
        int count = 0;

        do {
            System.out.println("Masukkan nama minuman:");
            minuman = input.nextLine();
            System.out.println(minuman + " dipesan");
            count++;
            System.out.println("Apakah ada minuman lain? (ya/tidak)");
            pilihan = input.nextLine();
        } 
        while (pilihan.equalsIgnoreCase("ya"));

        System.out.println("Total variasi minuman yang dibeli: " + count);
        input.close();
    }
}
