package day05_nestedifElse_termary;

import java.util.Scanner;

public class C05_NestedifElse {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir sayi alin
        //sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin
        //sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        if (sayi % 2 == 0) { // sadece çift sayılar
            if ( sayi % 10 == 0) {
                System.out.println("10 un tam katı");
            }else { //
                System.out.println("10 un tam katı değil");
            }
        }else { // // sadece tek sayılar
            if (sayi>0) {
                System.out.println("Pozitif tek sayı");
            } else {
                System.out.println("Pozitif tek sayı değil");
            }
        }
    }
}
