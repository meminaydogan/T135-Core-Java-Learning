package day02_scanner_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C11_Casting {
    public static void main(String[] args) {


        int sayi1 = 26;
        int sayi2 = 4;

        System.out.println(sayi1 / sayi2);

        double sayi3 = 30;

        System.out.println(sayi3 / sayi2);


        // Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak
        // yazdiran bir kod yazin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 3 tam sayı giriniz...");

        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();

        System.out.println("Girilen sayilarin ortalamasi : " + (s1+s2+s3)/3);

        System.out.println("Girilen sayilarin ortalamasi : " + (double)(s1+s2+s3)/3);

        System.out.println("Girilen sayilarin ortalamasi : " + ((double)s1+s2+s3)/3);


    }
}
