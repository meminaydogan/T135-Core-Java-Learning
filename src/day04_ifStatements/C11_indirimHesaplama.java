package day04_ifStatements;

import java.util.Scanner;

public class C11_indirimHesaplama {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin
        //kullaniciya musteri karti olup olmadigini sorun
        //Musteri karti varsa 10 urunden fazla alirsa %20
        //az alirsa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla alirsa %15
        //az alirsa %10 indirim yapin
        // ve toplam fiyatı verin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet ürün aldığınızı giriniz");
        int urunAdedi = scanner.nextInt();

        System.out.println("Ürünün indirimsiz fiyatını giriniz");
        double indirimsizFiyat = scanner.nextDouble();

        System.out.println("Müşteri kartiniz varmi ? E : Evet, H : Hayır");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        double indirimsizToplamFiyat = urunAdedi * indirimsizFiyat;

        if (kartVarMi == 'E' && urunAdedi > 10 ) {
            System.out.println("%20 inidirimli toplam tutar : " + indirimsizToplamFiyat * 80 /100);
        } else if (kartVarMi == 'E' && urunAdedi <=10) {
            System.out.println("%15 inidirimli toplam tutar : " + indirimsizToplamFiyat * 85 /100);
        } else if (kartVarMi == 'H' && urunAdedi > 10) {
            System.out.println("%15 inidirimli toplam tutar : " + indirimsizToplamFiyat * 85 /100);
        } else if (kartVarMi == 'H' && urunAdedi <=10) {
            System.out.println("%10 inidirimli toplam tutar : " + indirimsizToplamFiyat * 90 / 100);
        }else {
            System.out.println("Giriş Hatalı");
        }

    }
}
