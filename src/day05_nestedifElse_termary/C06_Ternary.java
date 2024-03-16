package day05_nestedifElse_termary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı alın
        // sayının çift veya tek olduğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Sayı çift");
        } else {
            System.out.println("Sayı tek");
        }


        System.out.println(sayi % 2 == 0 ? "Sayı çift" : "Sayı tek" );





    }
}
