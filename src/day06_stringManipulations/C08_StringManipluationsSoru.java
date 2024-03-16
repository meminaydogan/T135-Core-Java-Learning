package day06_stringManipulations;

import java.util.Scanner;

public class C08_StringManipluationsSoru {
    public static void main(String[] args) {


        // SORU : kullanicidan bir mail alin
        //         - mail @ icermiyorsa "gecersiz mail"
        //         - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //         - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        //         yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz...");
        String mail = scanner.nextLine();

        // if else ile yaparsak,
        //      ++++  en sonda bu hatalar yoksa mail basarili diyebiliriz
        //      ---- hatalardan sadece ilk buldugunu yazar, digerlerine bakmaz


        // bagimsiz if cumleleri ile yaparsak
        //      ++++ tum hatalari yazdirabiliriz
        //      ---- sifre basarili demek icin ayrica flag veya sayac kullanmaliyiz

        // bagimsiz if cumleleri ile yapalim
        // en sonda başarılı olarak kaydedildi demek için flag kullanalım.

        int flag = 0;
        //- mail @ icermiyorsa "gecersiz mail"
        if (!mail.contains("@")) {
            System.out.println("Geçersiz mail, @ içermiyor");
            flag++;
        }

        //  - mail @gmail.com icermiyorsa, "mail gmail olmali"

        if (!mail.contains("@gmail.com")) {
            System.out.println("mail  gmail olmalıdır");
            flag++;
        }

        //  - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"

        if (!mail.endsWith("@gmail.com")) {
            System.out.println("Mailde yazım hatası var.");
            flag++;
        }

        if (flag == 0) {
            System.out.println("mail başarıyla kaydedildi");
        }

    }
}
