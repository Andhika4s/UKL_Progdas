
import java.util.Random;
import java.util.Scanner;

public class sedang3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while(true){
            //data
            int bilangan1;
            int bilangan2;
            String operator = "";
            int jenisOperator;
            int jawabanUser;
            int jawabanBenar = 0;

            //random
            bilangan1      = random.nextInt(10);
            bilangan2      = random.nextInt(10);
            jenisOperator  = random.nextInt(3);

            //jawaban      
             if (jenisOperator == 0) {
                operator = "*";
                jawabanBenar = bilangan1 * bilangan2;
             } else if (jenisOperator == 1) {
                operator = "/";            
                jawabanBenar = bilangan1 / bilangan2;
             } else if (jenisOperator == 2) {
                operator = "%";            
                jawabanBenar = bilangan1 % bilangan2;  
             }

            //soal
            System.out.println("Berapa hasil dari: " + bilangan1 + " " + operator + " " + bilangan2 + " ?");
            System.out.print("Jawaban Anda: ");
            jawabanUser = input.nextInt();

            //cek jawaban
            if (jawabanUser == jawabanBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawabanBenar);
            }

            System.out.println("Apakah anda ingin bermain lagi (ya/tidak)");
            String pilihan = input.next();
            
            if(pilihan.equals("tidak")){
                break;
            }
              
        }
        System.out.println("Terimakasih telah bermain");          
            
        }
        
    }