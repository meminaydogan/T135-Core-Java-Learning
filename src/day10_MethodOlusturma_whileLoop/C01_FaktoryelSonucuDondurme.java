package day10_MethodOlusturma_whileLoop;

import day09_forLoop_methodOlusturma.C13_TamBölenSayisiniyazdir;

public class C01_FaktoryelSonucuDondurme {

    public static void main(String[] args) {
        // Verilen pozitif bir tamsayinin
        // faktoryel degerini donduren bir method olusturun
        // input:5   output :120   ( 5*4*3*2*1 )


        // 10 sayisinin faktoryel degerini hesaplayin
        // buldugunuz sonucun kac tane pozitif tam boleni oldugunu yazdirin

        int onFaktoryel = faktoryelHesapla(10);

        C13_TamBölenSayisiniyazdir.tamBolenSayisiniYazdir(onFaktoryel);
        // Verilen 3628800 sayisinin 270 adet pozitif tam boleni var


    }


    public static int faktoryelHesapla(int sayi){

        int faktoryel = 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel *= i ;
        }

        return faktoryel;
    }
}
