package day10_MethodOlusturma_whileLoop;

import day09_forLoop_methodOlusturma.C12_AsalSayiSonucYazdirma;

import java.util.Scanner;

public class C02_Soru {
    public static void main(String[] args) {

        // verilen bir sayi asal sayi ise true,
        // asal sayi degilse false donduren bir method olusturun

        C12_AsalSayiSonucYazdirma.asalSayiMiSonucYazdirma(20); // Verilen 20 sayisi asal degil

        System.out.println(isAsal(20)); // false




    }

    public static boolean isAsal(int sayi){

        boolean sonuc = false;

        for (int i = 2; i <=sayi ; i++) {

            if (i == sayi){
                sonuc = true;
            } else if ( sayi % i == 0) {
                sonuc = false;
                break;
            }
        }

        return sonuc;
    }
}
