package day09_forLoop_methodOlusturma;

public class C16_FaktoryelHesaplama {
    public static void main(String[] args) {

        // verilen pozitif bir tam sayının
        // faktoryel degerini yazdıran bir method olusturun.

        // 5! = 5*4*3*2*1 = 120

        faktoryelDegeriyazdir(5); // 5! = 120
    }

    public static void faktoryelDegeriyazdir( int sayi ){

        int faktoryel = 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel *=i ;

        }

        System.out.println(sayi + "! = " + faktoryel);
    }
}
