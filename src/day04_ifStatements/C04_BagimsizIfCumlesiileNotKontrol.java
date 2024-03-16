package day04_ifStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumlesiileNotKontrol {
    public static void main(String[] args) {


        //Soru 5- Kullanicidan notunu alin
//        50 veya daha buyukse "Sinifi Gectin",
//        50’den kucukse "Maalesef kaldin" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz");
        double girilenNot = scanner.nextDouble();

        if (girilenNot>=50) {
            System.out.println("Sınıfı Geçtin");
        }

        if (girilenNot<50) {
            System.out.println("Sınıfta Kaldın");
        }


    }
}
