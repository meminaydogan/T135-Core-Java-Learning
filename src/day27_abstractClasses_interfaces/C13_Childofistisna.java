package day27_abstractClasses_interfaces;

public class C13_Childofistisna implements C12_interfaceistisna{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    public static void main(String[] args) {

        /*
            implement ettigimiz C12_InterfaceIstisna
            interface'ine sonradan ekledigimiz
            method4() ve method5()'in body'leri oldugu icin
            override etme mecburiyeti yoktur

            interface icinde body'si olan
            istisnai method'lar olusturmak icin kullandigimiz
            default ve static keyword'lerinin farki
            o method'lara erisim yontemindedir.

            static keyword kullanilarak olusturulan istisnai method'lara
            InterfaceIsmi.staticMethodIsmi(); seklinde ulasabilirken

            default keyword kullanilarak olusturulan istisnai method'lara
            obje uzerinden ulasilabilir.
         */

        C12_interfaceistisna.method5();
        // Interface icindeki static keyword'une sahip istisnai method

        C13_Childofistisna obj = new C13_Childofistisna();
        obj.method4();
        // Interface icindeki default keyword'une sahip istisnai method

    }
}
