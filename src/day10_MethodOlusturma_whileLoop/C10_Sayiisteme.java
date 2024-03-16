package day10_MethodOlusturma_whileLoop;

import java.util.Scanner;

public class C10_Sayiisteme {
    public static void main(String[] args) {



        // Kullanicidan pozitif sayi isteyin
        // girilen sayinin pozitifTamBolenleriSayisi 5'den buyukse
        // "Guzel sayi" yazdirin ve islemi bitirin
        // buyuk degilse "Kotu sayi" yazdirin ve tekrar sayi girmesini isteyin


        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0;
        boolean devamMi = true;
        int ptbs = 0;

        while (devamMi){ // devamMi == true

            System.out.println("Pozitif bir tam sayı giriniz...");
            girilenSayi = scanner.nextInt();

            ptbs = pozitifTamBolenSayisiBul(girilenSayi);

            if (ptbs > 5) {
                System.out.println("Güzel Sayı");
                break;
            }else {
                System.out.println("Kötü Sayı");
            }
        }


    }

    public static int pozitifTamBolenSayisiBul(int sayi) {

        int sayac = 0;

        for (int i = 1; i <= sayi ; i++) {

            if (sayi % i == 0){
                sayac ++;
            }
        }
        return sayac;
    }
}
