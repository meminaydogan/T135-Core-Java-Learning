package day05_nestedifElse_termary;

import java.util.Scanner;

public class C10_SwitchStatements {
    public static void main(String[] args) {


        // kullanıcıdan gün numarasını alın
        // girilen numaraya göre gün ismini yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gün numarasını giriniz...");
        int gunNo = scanner.nextInt();


        switch (gunNo){

            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gün numarası 1-7 arasında olmalıdır");
        }




    }
}
