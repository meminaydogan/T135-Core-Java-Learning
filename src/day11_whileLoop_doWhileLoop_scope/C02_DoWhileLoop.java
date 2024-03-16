package day11_whileLoop_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        // Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        // Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        // ve bunlarin toplaminin kac oldugunu yazdirin
        // Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        // bu negatif sayiyi sayi adedine ve toplama eklemeyin


        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0;
        int pozitifSayilarınToplami = 0;
        int pozitifSayiAdeti = 0;


        do {
            System.out.println("Toplanmak üzere pozitif tam sayı giriniz...");
            girilenSayi = scanner.nextInt();

            if (girilenSayi>0){
                pozitifSayilarınToplami += girilenSayi;
                pozitifSayiAdeti++;

            } else if (girilenSayi < 0) {
                System.out.println("Negatif sayı kullanamazsınız");
            }

        }while (girilenSayi != 0);

        System.out.println("Girdiğiniz " + pozitifSayiAdeti + " Adet pozitif sayının toplamı : " + pozitifSayilarınToplami );
    }

}
