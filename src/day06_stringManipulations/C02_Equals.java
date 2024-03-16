package day06_stringManipulations;

public class C02_Equals {
    public static void main(String[] args) {


        String str1 = "Ali" ;
        String str2 = "ali" ;
        String str3 = "ALİ" ;
        String str4 = "ALi" ;
        String str5 = "Ali ";
        String str6 = "Ali" ;


        //false
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str2));
        System.out.println(str3.equals(str4));
        System.out.println(str1.equals(str5));

        //true
        System.out.println(str1.equals(str6));


        // equals ignore case büyük küçük harfe dikkat etmeden
        //metinlerin aynı olup olmadığını kontrol eder.

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str3.equalsIgnoreCase(str2)); // true
        System.out.println(str3.equalsIgnoreCase(str4)); // true
        System.out.println(str1.equalsIgnoreCase(str5)); // false
        System.out.println(str1.equalsIgnoreCase(str6)); // true



    }
}
