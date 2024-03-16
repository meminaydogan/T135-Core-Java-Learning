package day14_arrays_arrayLists;

public class C02_MDA_TumElementlerinCarpimi {
    public static void main(String[] args) {

        // Soru 4- Verilen 2 katli bir array’de bulun
        // tum sayilarin carpinini bize donduren bir method olusturun.

        int[][] arr = {{3,5,6},{1,8,2,3,4,2},{1,8,5,4}}; // 5529600


        System.out.println(tumElemanlaricarp(arr));

    }



    public static int tumElemanlaricarp(int[][] arr) {

        int sayilarinCarpimi = 1;

        for (int i = 0; i < arr.length ; i++) { // outer dış bölüm

            for (int j = 0; j < arr[i].length ; j++) { // inner iç bölüm

                sayilarinCarpimi *= arr[i][j];

            }
        }
        return sayilarinCarpimi;
    }
}
