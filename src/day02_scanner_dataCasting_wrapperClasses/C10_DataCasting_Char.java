package day02_scanner_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C10_DataCasting_Char {
    public static void main(String[] args) {

        //kullanıcıdan herhangi bir karakter girmesini isteyin
        //asci tablosunda kullanıcının girdiği değerden sonra gelen ilk 3 karakteri
        //-yazdırın.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen herhangi bir karakter giriniz...");

        char girilenKarakter = scanner.next().charAt(0);

        System.out.println( (char) (girilenKarakter +1) );
        System.out.println( (char) (girilenKarakter +2) );
        System.out.println( (char) (girilenKarakter +3) );


    }
}
