package day05_nestedifElse_termary;

import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {




        // kullanıcıdan gün numarasını alın
        // girilen numaraya göre hafta içi veya hafta sonu yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gün numarasını giriniz...");
        int gunNo = scanner.nextInt();


        switch (gunNo){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("HaftaSonu");
                break;
            default:
                System.out.println("Gün numarası 1-7 arasında olmalıdır");
        }

    }
}
