package day02_scanner_dataCasting_wrapperClasses;

public class C12_WrapperClases {
    public static void main(String[] args) {

        int sayi = 10;

        String str = "Java";

        Integer sayi2 = 20;

        // Boolean, Character, Byte, Short, Integer, Long, Float, Double
        // non primitivelerdede aynı şekilde kullanılır ve geçiş wrapperle yapılır.
        // bunların araçları hazır methotlara sahipler.

        String sayi5 = "23";
        String sayi6 = "45";

        System.out.println(sayi5+sayi6);


        int sayi5Int = Integer.parseInt(sayi5);
        int sayi6Int = Integer.parseInt(sayi6);

        System.out.println(sayi5Int+sayi6Int);
        // stringi int e çevirme.

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        char chr = 'a' ;

        System.out.println(Character.toUpperCase(chr));
    }
}
