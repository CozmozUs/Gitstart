package day01;

public class C04_MethodCreation {

    public static void main(String[] args) {


        //konsola;
        /*
        hello world
        Hello World
        HEllo WOrld
        HELlo WORld
        HELLo WORLd
        HELLO WORLD
        yazdırın
         */


        System.out.println("hello world");
        System.out.println("Hello World");
        System.out.println("HEllo WOrld");
        System.out.println("HELlo WORld");
        System.out.println("HELLo WORLd");
        System.out.println("HELLO WORLD");

        System.out.println("hello world");
        System.out.println("Hello World");
        System.out.println("HEllo WOrld");
        System.out.println("HELlo WORld");
        System.out.println("HELLo WORLd");
        System.out.println("HELLO WORLD");         // Bu sekilde yazarsak kalabalik bir kod fazlaligi olur...






        yazdir();
        //tekrar yazdır
        yazdir();
        //tekrar yazdır
        yazdir();
    }
    //method olusturuken syntax
    //access modıfıer + static + return type + methodismi (){}
    public static void yazdir() {
        System.out.println("hello world\n" +
                "Hello World\n" +
                "HEllo WOrld\n" +
                "HELlo WORld\n" +
                "HELLo WORLd\n" +
                "HELLO WORLD");







    }


}
