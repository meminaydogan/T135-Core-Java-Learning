package day09_forLoop_methodOlusturma;

public class C14_ismiistenenFormattayazdirma {
    public static void main(String[] args) {


        // Verilen isim,soyisim ve kredi kartı numarasını aşağıda verilen
        // formatta yazdıran bir method oluşturun.
        // input Ali, Kayali, 1234567890123456
        // output A** K*****, **** **** **** 3456

        isimDuzenleYazdir("Berk", "Yılmazlar", "1234567890123456");
        isimDuzenleYazdir("Selçuk emin","Yılmaz","7658987623415676");
    }

    public static void isimDuzenleYazdir (String isim, String soyisim, String kkNo) {

      String duzenlenmisHali = isim.toUpperCase().charAt(0) +
                               isim.substring(1).replaceAll("\\w","*") +
                               " " +
                               soyisim.toUpperCase().charAt(0)+
                               soyisim.substring(1).replaceAll("\\w","*")+
                               ", **** **** **** " +
                               kkNo.substring(kkNo.length()-4);


        System.out.println(duzenlenmisHali);

    }


}
