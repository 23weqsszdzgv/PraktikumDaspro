import java.util.Scanner;
public class SearchNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah nilai mahasiswa");
        int jumlah = input.nextInt();
        int[] arrNilai = new int[jumlah];

        for (int i = 0;  i< jumlah; i++) {
                 System.out.println("Masukkan nilai mahasiswa ke" +(i+1) + ":");
                arrNilai[i] = input.nextInt();
        }

                System.out.println("Masukkan nilai yang anda cari");
                int key = input.nextInt();
                int hasil = -1;


            for (int i = 0; i< arrNilai.length; i++) {
                        if (key== arrNilai[i]) { 
                            hasil = i;
                            break;
                        }

            }

            System.out.println();
            if (hasil != -1) {
                    System.out.println("Nilai"+key+"Ditemukan di indeks ke-" + key);

            } else {
                 System.out.println("Nilai"+key+"Tidak Ditemukan");

            }

            input.close();
                
                
        }

    }

