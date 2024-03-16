package day05_nestedifElse_termary;

import java.util.Scanner;

public class C12_SwitchStatements {
    public static void main(String[] args) {


        //Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini
        // ogrenmek istedigini alin ve girilen harfin karsiligini yazdirin.
        // I : International
        // S : Software
        // T : Testing
        // Q : Qualifications
        // B: Board

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen anlamını görmek istediğiniz harf giriniz...");
        char girilenHarf = scanner.next().charAt(0);


        switch (girilenHarf) {

            case 'i' :
            case 'I' :
                System.out.println("İnternational");
                break;
            case 's' :
            case 'S' :
                System.out.println("Software");
                break;
            case 't' :
            case 'T' :
                System.out.println("Testing");
                break;
            case 'Q' :
            case 'q' :
                System.out.println("Qualifications");
                break;
            case 'b' :
            case 'B' :
                System.out.println("Board");
                break;


        }


    }
}
