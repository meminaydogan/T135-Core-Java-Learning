package day09_forLoop_methodOlusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {


        /* kullanıcıdan bir sayı alıp 
         aşşağıdaki şekli oluşturun.
        
         örnek: sayı 4 olduğunda
         
         1 2 3 4
         2 4 6 8
         3 6 9 12
         4 8 12 16
           
        */
        
        // for loop ile  1 2 3 4 yazdırın

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i + " ");

        }
        System.out.println("");


        // for loop ile 2 4 6 8 yazdırın

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*2 + " ");

        }
        System.out.println("");

        // for loop ile 3 6 9 12 yazdırın

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*3 + " ");

        }
        System.out.println("");

        // for loop ile 4 8 12 16 yazdırın

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*4 + " ");

        }
        System.out.println("");

        System.out.println("=================================");


        for (int i = 1; i <=4 ; i++) { // dışardaki loop satırları kontrol eder.

            for (int j = 1; j <=4 ; j++) {
                System.out.print(i*j + "  ");

            }
            System.out.println("");
        }


    }
}
