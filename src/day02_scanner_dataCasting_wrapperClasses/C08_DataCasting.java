package day02_scanner_dataCasting_wrapperClasses;

public class C08_DataCasting {
    public static void main(String[] args) {


        /*
küçük data türündeki değeri büyük değere dönüştürme veya atama yaparken kullanılır.
büyük data türünü küçüğede aktarılabilir veya dönüştürülebilir(sorumluluk
almamız gerekir)
        */
        int sayi1 = 45;


        int sayi2 = sayi1 ; // atama

        double dbl = sayi1; // genişletme - auto widening

        System.out.println("dbl : " + dbl);

        short sayi3 = 66;

        sayi1 = sayi3 ;

        System.out.println("sayi1 : " + sayi1);

        int sayi4 = 22;

        byte byt1 = (byte)sayi4 ;

        System.out.println("byt1 : " + byt1);


        double dbl2 = 34.54;

        int sayi5 = (int)dbl2 ;
        System.out.println("sayi5 : " + sayi5);

        sayi5 = 132;

        byte byt2 = (byte) sayi5;
        System.out.println("132 nin byte hali : " + byt2);

        sayi5 = 256;

        byt2 = (byte)sayi5;
        System.out.println("256 nın byte hali : " + byt2);


        sayi5 = 522;

        byt2 = (byte)sayi5;
        System.out.println("522 nın byte hali : " + byt2);

    }
}
