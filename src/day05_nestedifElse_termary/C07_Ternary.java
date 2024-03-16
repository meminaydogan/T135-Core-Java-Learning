package day05_nestedifElse_termary;

public class C07_Ternary {
    public static void main(String[] args) {

        int sayi = 11;


        // ternary operatörü tek başına kullanılamaz
        // ya direk yazdırılmalı veya bir veriableye atanmalıdır
        // sayi  > 0 ? "Güzel sayı" : "Uygun değil" ;


        // sayı sıfırdan büyükse " Güzel sayı" değilse " uygun degil " yazdırın.

        System.out.println(sayi  > 0 ? "Güzel sayı" : "Uygun değil");



        // sayı çift ise sayıyı iki katına çıkartın,
        // tek sayı ise değerini 5 azaltın

        sayi = sayi % 2 == 0 ? sayi*2 : sayi - 5;

        System.out.println("Sayının son hali : " + sayi);
    }
}
