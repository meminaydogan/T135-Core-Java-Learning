package day05_nestedifElse_termary;

import java.util.Scanner;

public class C01_Emeklilik {
    public static void main(String[] args) {


        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //adin, 60 yas ve uzeri
        //Erkek 65 yas ve uzeri emekli olabilir
        //Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        // “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz. E : Erkek.  K : Kadın");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scanner.nextInt();


        if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("Erkek Emekli olabilir.");
        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("Emekli olmak için " + (65 - yas) + " Yıl daha çalışman gerekir");
        } else if (cinsiyet == 'K' && yas >=60) {
            System.out.println("Kadın Emekli olabilir");
        } else if (cinsiyet == 'K' && yas <60) {
            System.out.println("Emekli olmak için " + (60 - yas) + " Yıl daha çalışman gerekir");
        }else
            System.out.println("Cinsiyet olarak E veya K seçmelisiniz.");

    }
}
