package day06_stringManipulations;

public class C04_Substring {
    public static void main(String[] args) {


      

        String str = "Java Güzeldir" ;

        System.out.println(str.substring(2)); // va güzeldir
        System.out.println(str.substring(0)); // java güzeldir


        // substring kullanarak son harfi yazdırın.
        System.out.println(str.substring(12));  // dinamik değil

        System.out.println(str.substring(str.length() - 1)); // dinamik


        // son 3 harfi yazdırdım.
        System.out.println(str.substring(str.length() - 3));


        // son 5 harfi yazdırın
        System.out.println(str.substring(str.length() - 5));

        // str.substring(20); // StringIndexOutOfBoundsException
        // degerden kaynaklanan hatalari Java Compile ederken farketmez
        // calistirinca 20.index'e ulasmak istediginde
        // 20.index'in sinirlar disinda oldugunu farkeder ve
        // Run Time Error RTE verir

        // str = 56; Compile Time Error CTE
        // string str4 = "Java";  CTE
    }
}
