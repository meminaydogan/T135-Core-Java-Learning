package day03_matematikselislemler;

public class C06_Concatenation {
    public static void main(String[] args) {


        String str = "Java";
        String s = "Candır";

        int sayi = 5;
        boolean bl = true;
        char chr = 'k';

        System.out.println(str+s);             //JavaCandır
        System.out.println(str+sayi);          //Java5
        System.out.println(str+sayi+chr);      //Java5 + k -> öncelik solda
        System.out.println("<<<----------------------------->>>");

        String s1 = "Java";
        String s2 = "Candır";
        String s3 = " ";
        String s4 = "";

        int a = 4;
        int b = 6;

        //sadece verilen variableleri istenen metinleri yazdırın.

        // java candır 46

        System.out.println(s1+s3+s2+s3+a+b);

        // java 10

        System.out.println(s1+s3+(a+b));

        // 10 Java

        System.out.println(a+b+s3+s1);

        // 46 java

        System.out.println(s4+a+b+s3+s1);



    }
}
