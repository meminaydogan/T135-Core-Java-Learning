package day03_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        // kullanıcıdan 4 basamaklı poizitif bir tam sayı alın.
        // sayının rakamlar toplamını yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir tam sayı girin : ");

        int girilenSayi = scanner.nextInt(); // 245

        int sayi = girilenSayi;
        int birlerBasamaği = 0;
        int rakamlarToplami = 0;

        birlerBasamaği = sayi %10;
        rakamlarToplami = rakamlarToplami + birlerBasamaği ;
        sayi = sayi / 10 ;

        birlerBasamaği = sayi %10;
        rakamlarToplami = rakamlarToplami + birlerBasamaği ;
        sayi = sayi / 10 ;

        birlerBasamaği = sayi %10;
        rakamlarToplami = rakamlarToplami + birlerBasamaği ;
        sayi = sayi / 10 ;


        System.out.println(girilenSayi + "sayısının rakamlar toplamı : " + rakamlarToplami);
    }
}
