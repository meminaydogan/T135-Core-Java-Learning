package day02_scanner_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lütfen soyisiminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Yaşınızı giriniz...");
        int yas = scanner.nextInt();

        System.out.println("\n İsminiz : " + isim +
                "\n Soyisminiz : " + soyisim +
                "\n Yaşınız : " + yas +
                "\n Kaydiniz basariyla tamamlanmistir");
    }
}
