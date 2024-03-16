package day04_ifStatements;

import java.util.Scanner;

public class C06_ifElseStatements {
    public static void main(String[] args) {


        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenKarakter = scanner.next().charAt(0);

        if (girilenKarakter >= 'A' && girilenKarakter <= 'Z'){
            System.out.println("Girilen karakter büyük harf");
        }else {
            System.out.println("Girilen karakter büyük harf değil");

        }

        // Character wrapper class ı ile yapalım

        if (Character.isUpperCase(girilenKarakter)) {
            System.out.println("Girilen karakter büyük harf");
        }else {
            System.out.println("Girilen karakter büyük harf değil");
        }

    }
}
