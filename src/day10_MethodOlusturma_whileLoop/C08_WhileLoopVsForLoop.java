package day10_MethodOlusturma_whileLoop;

import java.util.Scanner;

public class C08_WhileLoopVsForLoop {
    public static void main(String[] args) {


 /*
            Tekrar sayisi belli degil ise
            veya bitme sarti asil degiskene bagli degilse
            for loop yerine while loop kullanilmasi tercih edilir
         */

        // Kullanicidan toplanmak uzere sayilar alin
        // girilen sayilarin toplami 500 oldugunda
        // kac sayi girildigini ve toplamin kac oldugunu yazdirin


        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0 ;
        int sayilarinToplami = 0 ;
        int girilenSayiAdedi = 0 ;


        while (sayilarinToplami < 500) {

            System.out.println("Toplama eklemek üzere bir tam sayı giriniz...");
            girilenSayi = scanner.nextInt();
            sayilarinToplami += girilenSayi;
            girilenSayiAdedi ++ ;

        }

        System.out.println("Toplam " + girilenSayiAdedi + " Adet sayı girdiniz...");
        System.out.println("Girilen sayıların toplamı : " + sayilarinToplami);
    }
}
