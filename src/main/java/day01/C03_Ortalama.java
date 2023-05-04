package day01;

public class C03_Ortalama {


    public static void main(String[] args) {


    /*
           double num1 = 23.4;
           double num2 = 24.0;
           double num3 = 12;
           double num4 = 450.3;
           double num5 = 100;

           Bu sayilarin ortalamasini hesaplayan bir kod yaziniz.
     */


        double num1=23.4;
        double num2=24;
        double num3=12;
        double num4=450.3;
        double num5=100;

        //ortalama nasil hesaplanir ==> tum sayilari topla , sayi adetine bol


        double toplam = num1 + num2 + num3 + num4 + num5;
        //ifadenin onunde string varsa yan yana yazdirma islemi yapar
        //+ isaretini onunde string yoksa ve numerik datalar varsa + isareti matematiksel toplama islemi yapar
        System.out.println("toplam = " + toplam);  //609.7
        double ortalama = toplam/5;
        System.out.println("ortalama = " + ortalama);  //121.94000000000001

        System.out.println((num1 + num2 + num3 + num4 + num5)/5);  // bu sekildede yazabiliriz.





    }



}
