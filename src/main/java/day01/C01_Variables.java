package day01;

public class C01_Variables {


    public static void main(String[] args) {

        //Bir variable olustur, yazdir
        //syntax: data turu  +  datanin ismi =(atama operatoru)  variable degeri
        int yas = 35;
        int sayi = 50;

        System.out.println(yas);
        System.out.println(sayi);


        //sayi = 50 seklinde yazdir , yani etiketiyle yazdir.
        System.out.println("sayi = " + sayi);
        System.out.println("sayi = " + sayi); // soutv degiskeni etiketiyle birlikte yazdirma islemi yapar.


        //String bir data olusturalim ==> non-primitive
        String isim = "Ali";
        System.out.println("isim =" + isim);


        //Olusturdugun variable'i farkli bir variable'a kopyala
        int benimYasim = yas;
        System.out.println("benimYasim = " + benimYasim);
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        /*
        camelCase
        PascalCase
        snake_case
        kebab-case
         */


        //Ayni satirda coklu variable deklare et
        int yil= 2023 , ay= 4 , gun= 21;
        System.out.println("yil = " + yil);

        //Bir variable degerini guncelle
        yil = 2024;
        System.out.println("yil = " + yil);  //java yukaridan asagi ve ve soldan saga calisir, java run time programming


        //Degiskenleri(variable) yazdir


        //Bir variable deklare et : x
        double x;

        //Bir variable baslat : y (initialize)
        double y = 12.5;

        //Baska bir variable baslat : z degeri 33 olsun
        double z = 33;  // java bunu 33.0 olarak algiladi

        //x degiskenini y degiskeni ile baslat
        x = y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //Variable y'yi guncelle => 14.9 olarak
        y = 14.9;
        System.out.println("x = " + x);
        System.out.println("y = " + y);





    }



}
