package day02_scanner_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan ismini, soyismini ve yasini
        // alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz...");
        char isimIlkHarf = scanner.nextLine().charAt(0);

        System.out.println("Lütfen soyisiminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Yaşınızı giriniz...");
        int yas = scanner.nextInt();


        System.out.println("girilen bilgiler : " + isimIlkHarf+" "+soyisim+", "+yas);




    }
}
