package day09_forLoop_methodOlusturma;

public class C12_AsalSayiSonucYazdirma {
    public static void main(String[] args) {


        // Verilen sayinin asal sayi olup olmadigini kontrol edip,
        // sonuc olarak "asal sayi" veya "asal sayi degil" yazdiran
        // bir method olusturun

        asalSayiMiSonucYazdirma(15);
        asalSayiMiSonucYazdirma(37);
        asalSayiMiSonucYazdirma(9973);
    }

    public static void asalSayiMiSonucYazdirma(int sayi) {

        for (int i = 2; i <=sayi ; i++) {

            if (i==sayi){
                System.out.println("Verilen " + sayi +  " sayısı Asal!");
            } else if ( sayi % i == 0) {
                System.out.println("Verilen "+ sayi +" sayısı Asal Değil!");
                break;
            }

        }
    }
}
