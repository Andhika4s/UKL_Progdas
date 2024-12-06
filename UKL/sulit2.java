import java.util.Scanner;

public class sulit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //inputan jumlah elemen array
        System.out.println("masukkan jumlah elemen array");
        int a = input.nextInt();       
        int array[] = new int[a];

        //inputan bilangan array
        System.out.print("masukkan " + a + " elemen array");
        for (int i = 0; i < a; i++) {
            array[i] = input.nextInt();
        }
        
        boolean adaDuplikat = false;
        System.out.print("Array memiliki elemen duplikat: ");
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");  
                    adaDuplikat = true;
                    break; 
                }
    }
}
        if (!adaDuplikat) {
            System.out.println("Tidak ada item duplikat");
        }
    }
}