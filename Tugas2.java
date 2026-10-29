import java.util.Scanner;
public class Tugas2  {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        int i = 1;
        int jmlAngka = 0;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                int hasilKali = i * j; 
                System.out.printf ("%4d", hasilKali); 
                jmlAngka += hasilKali;
                j++;
            }
            System.out.println();
            i++;
        }
        
        System.out.println("Jumlah seluruh angka: " + jmlAngka);
        
        sc.close();
    }
}