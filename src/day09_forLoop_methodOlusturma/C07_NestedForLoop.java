package day09_forLoop_methodOlusturma;

import java.util.Scanner;

public class C07_NestedForLoop {
    public static void main(String[] args) {


        /*
        Kullanıcıdan satır ve sütun sayısını alıp
        aşşağıdaki şekli oluşturun

        örnek/ satır 5, sütun 7

        * * * * * * *
        * * * * * * *
        * * * * * * *
        * * * * * * *
        * * * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz...");
        int satir = scanner.nextInt();

        System.out.println("Lütfen sütun sayısını giriniz...");
        int sutun = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) {  // satırlar

            for (int j = 1; j <=sutun ; j++) { // sütunlar

                System.out.print("* ");

            }
            System.out.println("");
        }

    }
}
