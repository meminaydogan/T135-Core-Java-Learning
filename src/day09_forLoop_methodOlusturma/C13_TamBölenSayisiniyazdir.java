package day09_forLoop_methodOlusturma;

import day112_kendiCözümlerim.S05_ArrayList_QbasmaliSoru;

public class C13_TamBölenSayisiniyazdir {
    public static void main(String[] args) {




        // verilen pozitif bir tam sayının
        // pozitif tam böle sayısını yazdıran bir method oluşturun
        // PTBS input: 20        output: 6  (1,2,4,5,10,20)
   tamBolenSayisiniYazdir(20);
    }


    public static void tamBolenSayisiniYazdir(int sayi){

        int sayac = 0;

        for (int i = 1; i <= sayi ; i++) {

            if (sayi % i == 0){
                sayac ++;
            }
        }
        System.out.println("Verilen " + sayi + " sayısının " + sayac + "adet pozitif tam böleni var");

    }
}
