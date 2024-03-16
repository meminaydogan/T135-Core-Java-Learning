package day11_whileLoop_doWhileLoop_scope;

public class C03_Loops {
    public static void main(String[] args) {


        // Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.




        /*
            Do while loop'un avantaji
            while loop'da kullanicidan alacagimiz degeri, baslangic icin kendimiz atadigimizda
            yanlis deger verirsek, loop body'si hic calismayabilirdi,
            Do-While loop, kontrolden once do body'sini calistirdigi icin
            do-body'sinde kullanicidan degeri aliriz ve
            basta bizim girdigimiz degerin yanlis olma riski ortadan kalkar

            Do while loop'un dezavantaji
            hic calismamasi gereken durum bile olsa
            loop body'si en az bir kere calisir
         */





        // for loop

        for (char i = 'k'; i <='t' ; i++) {
            System.out.print(i + " ");

        }

        System.out.println("");

        // while loop ile yapalım

        char harf = 'k';

        while (harf <= 't'){
            System.out.print(harf + " ");
            harf ++ ;

        }

        System.out.println("");


        // Do While Loop ile yapalım

        harf = 'k';

        do {
            System.out.print(harf + " ");
            harf++;
        }while (harf <= 't');

    }
}
