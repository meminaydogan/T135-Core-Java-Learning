package day09_forLoop_methodOlusturma;

import java.util.Scanner;

public class C10_NestedForLoop {
    public static void main(String[] args) {
        
        /*
        Kullanıcıdan satır sayısını alıp
        aşşağıdaki şekli oluşturun

        *
        * *
        * * *
        * * * *
        * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz...");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) { // satır

            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
                
            }
            System.out.println("");
        }
    }
}
