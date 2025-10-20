import java.util.Scanner;

public class While {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mhs = 20, lulus = 0, tidaklulus = 0, i;
        double nilai;
        i = 1;
        while (i <= mhs){
            System.out.println("Masukkan nilai mahasiswa" + i + ":");
            nilai = sc.nextDouble();
            if (nilai >= 65){
                lulus++;

            } else {
                tidaklulus++;
            }
            i++;
        }
    }
}
