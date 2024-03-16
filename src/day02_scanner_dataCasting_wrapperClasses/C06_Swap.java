package day02_scanner_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C06_Swap {
    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip
        // ikisinin degerlerini degistirin(swap).


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 1. Sayıyı Giriniz...");
        int sayi1 = scanner.nextInt();

        System.out.println("Lütfen 2. Sayıyı Giriniz...");
        int sayi2 = scanner.nextInt();


        int temp = 0;

        temp = sayi2;
        sayi2= sayi1;
        sayi1= temp;

        System.out.println("Verdiğiniz sayıların yerini değiştirdim...");
        System.out.println("sayı1 : " + sayi1 + " ve sayı2 : " + sayi2 + "oldu.");





    }
}
