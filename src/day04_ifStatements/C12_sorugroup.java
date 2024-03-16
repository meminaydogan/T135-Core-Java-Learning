package day04_ifStatements;

import java.util.Scanner;

public class C12_sorugroup {
    public static void main(String[] args) {
        /*
      kullanıcıdan 2 adet notunu alınız
      aldığımız notların ortalamasını alıp
      hangi harf notunu aldığını yazdırınız.

      90(90 dahil) 'dan büyük ise, harf notu olarak AA,
      80(80dahil)   ile 90 arasında ise  BA,
      70(70 dahil)   ile 80 arasında ise BB,
      60(60dahil) ile 70 arasında ise CB,
      50(50 dahil) ile 60 arasında ise CC,
      40(40 dahil) ile 50 arasında ise DC,
      30(30 dahil) ile 40 arasında ise DD,
      30 'dan düşük ise FF   gelmeli.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 1. notunuzu giriniz : ");
        double not1 = scanner.nextDouble();

        System.out.println("Lütfen 2. notunuzu girinz : ");
        double not2 = scanner.nextDouble();

        double ortalama = ((not1+not2)/2);

        if (not1 < 0 || not1 >100 ){
            System.out.println("1. Not hatalı");
        } else if (not2 <0 || not2 >100) {
            System.out.println("2. Not hatalı");
        } else if (ortalama >= 90) {
            System.out.println("AA");
        } else if (ortalama >= 80) {
            System.out.println("BA");
        } else if (ortalama >= 70) {
            System.out.println("BB");
        } else if (ortalama >= 60) {
            System.out.println("CB");
        } else if (ortalama >= 50) {
            System.out.println("CC");
        } else if (ortalama >= 40) {
            System.out.println("DC");
        } else if (ortalama >= 30) {
            System.out.println("DD");
        } else {
            System.out.println("FF");
        }

    }


    }

