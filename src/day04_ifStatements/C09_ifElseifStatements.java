package day04_ifStatements;

import java.util.Scanner;

public class C09_ifElseifStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double not = scanner.nextDouble();


        if (not<0 || not>100 ) {
            System.out.println("Geçersiz Not");
        } else if (not>=85) {
            System.out.println("AA");
        } else if (not>=65) {
            System.out.println("BB");
        } else if (not>=50) {
            System.out.println("CC");
        }else {
            System.out.println("DD");
        }
    }
}
