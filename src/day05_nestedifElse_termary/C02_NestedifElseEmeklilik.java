package day05_nestedifElse_termary;

import java.util.Scanner;

public class C02_NestedifElseEmeklilik {
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

        // Eğer birden fazla değişkene göre kod yazmamız gerekiyorsa
        // kodun daha anlaşılır olması için nested if else kullanabiliriz

        // nested if else kullanmak için,
        // önce değişkenlerden birini (yaş cinsiyet) ana değişken kabul edelim
        // biz cinsiyeti seçtik

        if (cinsiyet == 'K') { // burada sadece kadınlar olacak
            if (yas<18 || yas >90) {
                System.out.println("Girdiğiniz yaş için emeklilik hesaplanamaz");
            } else if (yas>=60) {
                System.out.println("kadın emekli olabilir.");
            } else{
                System.out.println("Emekli olmak için " + (60 - yas) + " Yıl daha çalışman gerekir");
            }


        } else if (cinsiyet == 'E') { // burada sadece erkekler olacak
            if (yas<18 || yas >90) {
                System.out.println("Girdiğiniz yaş için emeklilik hesaplanamaz");
            } else if (yas>=65) {
                System.out.println("erkek emekli olabilir.");
            } else{
                System.out.println("Emekli olmak için " + (65 - yas) + " Yıl daha çalışman gerekir");
            }

        }else{
            System.out.println("Cinsiyet olarak K veya E seçmelisiniz");
        }


    }
}
