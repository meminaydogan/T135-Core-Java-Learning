package day09_forLoop_methodOlusturma;

import java.util.Scanner;

public class C04_AsalSayiKontrolu {
    public static void main(String[] args) {


        // Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.
        // asal sayi = sadece kendine ve 1 e bölünen sayılar. örn/ 13

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz.");
        int girilenSayi = scanner.nextInt();

        for (int i = 2; i <=girilenSayi ; i++) {

            if (i == girilenSayi){
                System.out.println("Girilen sayı Asal.");
            } else if (girilenSayi % i == 0) {
                System.out.println("Girilen sayı Asal Değil.");
                break;
            }

        }

    }
}
