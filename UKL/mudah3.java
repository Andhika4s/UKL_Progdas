
import java.util.Scanner;

public class mudah3{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan awal");
        int start = input.nextInt();
        
        System.out.println("Masukkan bilangan akhir");
        int end = input.nextInt();

        for (int i = start; i > end; i--) {
            if (i % 3 == 0) {
               System.out.println(i + ".saya angkatan 33"); 
            }
             else if (i % 2 == 0) {
                System.out.println(i + ".saya anak moklet");               
            } else {
                System.out.println(i + ".saya anak wikusama");
            }
           
         }
         System.out.println(end + ".saya senang");
            
        }
    }
