package day09_forLoop_methodOlusturma;

import java.util.Scanner;

public class C09_NestedForLoop {
    public static void main(String[] args) {

        /*
        Kullanıcıdan satır sayısını alıp
        aşşağıdaki şekli oluşturun

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz...");
        int satir = scanner.nextInt();


        for (int i = 1; i <=satir ; i++) {  // satır

            for (int j = 1; j <=i ; j++) { // sütun

                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }
}
