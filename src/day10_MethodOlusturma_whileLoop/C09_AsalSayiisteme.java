package day10_MethodOlusturma_whileLoop;

import java.util.Scanner;

public class C09_AsalSayiisteme {
    public static void main(String[] args) {

        // Kullanıcıdan asal bir sayı girmesini isteyin
        // kullanıcının girdigi sayı kontrol edip
        // asal sayı ise "Giriş başarılı" yazdırın
        // asal sayı değilse tekrar isteyin


        // kac kere giris olacığını bilmiyoruz, while loop daha avantajlı

        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0;
        boolean asalMi = false;

        while ( asalMi == false){

            System.out.println("Lütfen bir asal sayı giriniz...");
            girilenSayi = scanner.nextInt();

            asalMi = C03_AsalSayiSonucDondurme.isAsal(girilenSayi);

        }

        System.out.println("Giriş Başarılı");

    }
}
