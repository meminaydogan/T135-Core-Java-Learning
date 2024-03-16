package day02_scanner_dataCasting_wrapperClasses;

public class C09_DataCastingChar {
    public static void main(String[] args) {

        char chr1 = 'a' ;
        char chr2 = 'b' ;

        System.out.println(chr1 + chr2);
/*
char data türü matematiksel işlemlerle karşılaştığında ASCII tablosundaki
değerler işleme girer
*/

        System.out.println( 'c' < 'e' );  // 99 < 101  doğrudur


        int sayi1 = chr2;
        System.out.println("'b' nin int a dönmüş hali : " + sayi1);

        System.out.println(  (char) 123    );
        System.out.println(  (char)   75   );
    }
}
