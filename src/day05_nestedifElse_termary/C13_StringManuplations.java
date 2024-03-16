package day05_nestedifElse_termary;

public class C13_StringManuplations {
    public static void main(String[] args) {


        String str = "Java candır , Selenium heyecan" ;

        // verilen str'ı tamamı büyük harf yapın.

        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDIR, SELENİUM HEYECAN


        // verilen str ın tamamını kücük harf olarak yazdırın

        System.out.println(str.toLowerCase()); // java candır , selenium heyecan


        // str ın il harfini yazdırın

        System.out.println(str.charAt(0)); // J


        // str ın 7. harfini küçük harf olarak yazdırın.

        System.out.println(str.toLowerCase().charAt(6)); // a


        // str da kaç karakter kullanıldığını yazdırın

        System.out.println(str.length()); // 30 kaç harf olduğunu bulduk


        // son harfi yazdırın

        System.out.println(str.charAt(29)); //N




    }
}
