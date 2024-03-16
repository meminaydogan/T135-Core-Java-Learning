package day27_abstractClasses_interfaces;

public class C11_ChildofMultipleParents extends C08_Parent implements C10_interfaceParent2,C09_interfaceParent1{


    @Override
    public void method2() {
        // InterfaceParent1 "Mutlaka method2'in olmali"
        // InterfaceParent2 "Mutlaka method2'in olmali"
        System.out.println("Child class method2");
    }

    @Override
    public int method3() {

        return 5;
    }



    public static void main(String[] args) {

        C11_ChildofMultipleParents obj = new C11_ChildofMultipleParents();

        obj.method1(); // Parent class method1
        obj.method2(); // Child class method2
        System.out.println(obj.method3()); // 5

        // System.out.println(sayi); iki interface'de de sayi variable'i oldugundan CTE verir
        System.out.println(C09_interfaceParent1.sayi); // 20
        System.out.println(C10_interfaceParent2.sayi); // 30

        System.out.println(isim); // Ali
        System.out.println(yas); // 40


    }
}
