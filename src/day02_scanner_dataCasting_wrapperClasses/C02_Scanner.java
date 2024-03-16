package day02_scanner_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {


        //Soru 2- Kullanicidan bir double, bir de int sayi alip
        //        bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz...");

        int girilenTamsayi = scanner.nextInt();

        System.out.println("Lütfen ondalıklı bir sayı giriniz...");

        double girilenDouble = scanner.nextDouble();



        System.out.println("Girilen sayıların toplamı : " + (girilenDouble+girilenTamsayi));
        System.out.println("Girilen sayıların çarpımı : " + (girilenDouble*girilenTamsayi));





    }
}
