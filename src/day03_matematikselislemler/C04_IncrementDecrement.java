package day03_matematikselislemler;

public class C04_IncrementDecrement {
    public static void main(String[] args) {

        int sayi = 20;

        //sayının değerini 5 artırın

        sayi = sayi +5;
        System.out.println(sayi);

        sayi += 5;
        System.out.println(sayi);

        sayi++;
        sayi++;
        sayi++;
        sayi++;
        sayi++;
        System.out.println(sayi);


        //-----------------------------------

        double dbl = 3.5;

        // sayının değerini 3 katına çıkarın

        dbl = dbl * 3;
        System.out.println(dbl);

        dbl *= 3;
        System.out.println(dbl);


        //-----------------------------------

        sayi = 10;

        //sayının değerini yazdırın sonra sayının değerini 1 artırın

        System.out.println("sayının değeri : " + sayi);
        sayi++;

        //----------------------------------

        sayi= 10;


        //sayının değerini 1 artırın sonra sayının değerini yazdırın

        sayi++;

        System.out.println(sayi);

        //----------------------------------------------

        sayi =10;

        //önce sayının değerini oluşturacağınız b variablesine atayın
        //sonra sayının değerini 1 artırın

        int b = sayi;
        sayi++;
        System.out.println("sayi : " + sayi + ", b : " + b);

        //-------------------------------------------

        sayi = 10;
        //sayının değerini 1 artır
        // değerini b ye ata

        sayi++;
        b = sayi;

        System.out.println("sayi : " + sayi + ", b : " + b);
    }
}
