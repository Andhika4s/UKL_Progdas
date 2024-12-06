
import java.util.Scanner;

public class sulit3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);           
        //input jumlah elemen
        System.out.print("Masukkan jumlah elemen array: ");
        int a = input.nextInt();
        int[] array = new int[a];

         //input bilangan array
         System.out.println("masukkan elemen array (0-9)");
         for (int i = 0; i < a; i++) {
         array[i] = input.nextInt();
         }
              int[] frekuensi = new int[10];
              for (int i = 0; i < array.length; i++) {
              frekuensi[array[i]]++;
              }
        
                 for (int i = 0; i < frekuensi.length; i++) {
                 if (frekuensi[i] > 0) {
                 System.out.println(i + " muncul " + frekuensi[i] + " kali");


            }
        }
    }
}
