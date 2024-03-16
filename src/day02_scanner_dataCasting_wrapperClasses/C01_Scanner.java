package day02_scanner_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {


        //kullanıcıdan bir tam sayı alıp
        // tam sayının karesini yazdırın


      // 1. adim bir scanner objesi oluşturalım

        Scanner scanner = new Scanner(System.in);

        //2. adim kullaniciya ne istediğimizi söyleyin

        System.out.println("Lütfen bir tamsayi giriniz...");

        // 3. adim : istediğiniz bilgiyi deolayabilecek bir variable olusturun


        int girilenSayi = scanner.nextInt();

        System.out.println("Girdiğiniz sayının karesi : "+girilenSayi*girilenSayi);







    }
}
