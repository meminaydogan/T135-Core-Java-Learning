package day05_nestedifElse_termary;

import java.util.Scanner;

public class C03_NestedifElseEmeklilik2 {
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



    }
}
