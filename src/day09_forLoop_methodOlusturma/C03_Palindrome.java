package day09_forLoop_methodOlusturma;

import java.util.Scanner;

public class C03_Palindrome {
    public static void main(String[] args) {


        // Soru 10 (interview)-
        // Kullanicidan bir String isteyin ve String’in Palindrome olup olmadığını yazdırın.
        // palindrome = terstende yazılışı aynı olan. örn: madam / ey edip adanada pide ye
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome kontrolu için bir metin giriniz.");
        String metin = scanner.nextLine();


        String tersMetin = "";


        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin += metin.charAt(i);

        }
        if ( metin.equalsIgnoreCase(tersMetin)) {
            System.out.println("Girdiğiniz metin Palindrome.");
        }else {
            System.out.println("Girdiğiniz metin Palindrome değil.");
        }
    }
}
