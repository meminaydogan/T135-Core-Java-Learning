package day04_ifStatements;

import java.util.Scanner;

public class C05_ıfElseStatements {
    public static void main(String[] args) {


        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        //ucgen eskenar ise “Eskenar ucgen” yazdirin
        //degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("3 kenar uzunluğunu girin");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0) {
            System.out.println("Eşkenar üçgen");
        } else {
            System.out.println("Eşkenar üçgen değil");
        }







    }
}
