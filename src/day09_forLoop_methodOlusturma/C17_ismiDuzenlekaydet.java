package day09_forLoop_methodOlusturma;

public class C17_ismiDuzenlekaydet {
    public static void main(String[] args) {

// Verilen isim,soyisim ve KK numarasini asagida verilen formatta
        // donduren bir method olusturun
        // input Ali, Kayali, 1234567890123456
        // output A** K*****, **** **** **** 3456

       
            String isim = "Ali";
            String soyisim ="Can";
            String kkNo = "1234543267896543";

            // ismi duzenleyip kaydedelim
            String duzenlenmisHali = "";

            isim.toUpperCase();
            ismiDüzenleKaydet(isim,soyisim,kkNo);
            // 20. satırda method çalışır ve düzenlenmiş hali bize getirir.
            // bu düzenlenmiş halini ya kaydetmeli, yada direk yazdırmalıyız
        System.out.println(ismiDüzenleKaydet(isim, soyisim, kkNo));


        // düzenlenmiş halindeki tüm *'lari kare yapın.

        duzenlenmisHali = ismiDüzenleKaydet(isim, soyisim, kkNo);


    }

    public static String ismiDüzenleKaydet(String isim, String soyisim, String kkNo) {


        String duzenlenmisHali = isim.toUpperCase().charAt(0) +
                isim.substring(1).replaceAll("\\w","*") +
                " " +
                soyisim.toUpperCase().charAt(0)+
                soyisim.substring(1).replaceAll("\\w","*")+
                ", **** **** **** " +
                kkNo.substring(kkNo.length()-4);
        return duzenlenmisHali;

    }
}
