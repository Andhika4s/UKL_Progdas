
import java.util.Scanner;

public class sedang2{
     static void hitung(int r , int t) {
        double phi = 3.14;
        double hasil = phi * r * r * t;
        System.out.println("volume tabung : " + hasil);
   }
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari jari tabung");
        int j = input.nextInt();
        System.out.println("Masukkan tinggi tabung");
        int t = input.nextInt();
        hitung(j, t);
   }
}