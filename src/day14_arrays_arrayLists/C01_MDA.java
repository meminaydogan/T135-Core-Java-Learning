package day14_arrays_arrayLists;

public class C01_MDA {
    public static void main(String[] args) {

        // Soru 1- Verilen 2 katli bir array’de
        // bulunan cift sayilari toplayip, sonucu yazdiran
        // bir method olusturun.


        int[][] arr = {{3,5,6},{1,8,2,3,4,2},{1,8,9,4}};


        ciftSayilariTopla(arr);

    }

    public static void ciftSayilariTopla(int[][] arr){

        int ciftSayilarinToplami = 0;

        for (int i = 0; i < arr.length ; i++) {


            for (int j = 0; j < arr[i].length ; j++) {

             if (arr[i][j] % 2 ==0){
                 ciftSayilarinToplami += arr[i][j];
             }

            }

        }
        System.out.println("Arraydeki Çift Sayıların TOplamı = " + ciftSayilarinToplami);
    }
}
