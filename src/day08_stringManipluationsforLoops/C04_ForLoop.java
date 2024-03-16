package day08_stringManipluationsforLoops;

public class C04_ForLoop {
    public static void main(String[] args) {

// 1 den 10 a kadar ( 10 dahil) olan sayıları yazdırın
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+ " ");
        }


        System.out.println("");



        for (int i = 10; i <100 ; i+=2) {
            System.out.print(i + " ");
        }


        System.out.println("");


        for (int i = 190; i >=0 ; i-=5) {
            System.out.print(i + " ");
        }

        System.out.println("");


        for (int i = 100; i <=999 ; i++) {
            if (i % 17 == 0){
                System.out.print(i + " ");
            }

        }
    }
}
