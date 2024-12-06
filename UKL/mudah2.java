import java.util.Scanner;
public class mudah2{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai : ");
        int angka = scanner.nextInt();
    
            if (angka % 2 == 0) {
                System.out.println(angka + "  merupakan bilangan genap  ");
            
            } else {
                System.out.println(angka + "  merupakan bilangan ganjil  ");
            
        }
    }
}
