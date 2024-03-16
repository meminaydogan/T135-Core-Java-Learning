package day08_stringManipluationsforLoops;

public class C05_ForLoop {
    public static void main(String[] args) {



        // 123 ile 789 (dahil) arasındaki sayıların toplamını yazdırın

        int toplam = 0;

        for (int i = 123; i <=789 ; i++) {

            toplam += i;
        }
        System.out.println("toplama işleminin sonucu: "+ toplam);


        // 897 ile 1345 dahil - arasındaki 7 ile bölünebilen sayıları toplayın

        toplam = 0;
        for (int i = 897; i <=1345 ; i++) {

            if (i % 7 == 0){
                toplam += i;

            }
        }
        System.out.println("toplama işleminin sonucu: "+ toplam);


        // verilen başlangıç ve bitiş sayıları dahil olarak
        // aradaki tüm sayıları toplayıp, sonucu yazdırın.

        int bas = 45;
        int bit = 1450;
        toplam=0;

        for (int i = bas; i <= bit ; i++) {
            toplam += i;
        }
        System.out.println("toplama işleminin sonucu: "+ toplam);
    }
}
