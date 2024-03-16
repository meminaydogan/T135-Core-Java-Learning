package day03_matematikselislemler;

public class C05_PreincrementPostincrement {
    public static void main(String[] args) {

        //Preincrement ve Postincrement sadece ++,-- işlemleri için geçerlidir.

        int sayi = 10;

        sayi++;
        System.out.println(sayi);

        ++sayi;
        System.out.println(sayi);

        // sayi++ ve ++sayi yazımının farkı yoktur.
        // sayi-- ve --sayi yazımının farkı yoktur.
        // aynı satırda atama veya yazdırma yapılıyorsa farklı sonuçlar olabilir.

        sayi = 10;
        System.out.println( sayi++ );
        System.out.println(sayi);

        System.out.println("-------------------------------------");

        sayi = 10;
        System.out.println( ++sayi );
        System.out.println(sayi);


        System.out.println("===========");



        int a = 20;
        int b = a++ ;
        System.out.println("a : " + a + ", b : " + b); // a : 21, b : 20



        System.out.println("===========");


        a = 20 ;
        b = --a;
        System.out.println("a : " + a + ", b : " + b); // a : 19, b : 19
    }
}
