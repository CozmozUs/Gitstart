package day01;

public class C06_MethodCreation {

    public static void main(String[] args) {


         //kare prizmanin hacmini bulan ve donduren bir method yaziniz
         //not: kare prizmanin hacmi ==> taban alani x yukseklik ==> a*a*h

        int tabankenar = 3;
        int yukseklik = 4;
        // tabankenari 3 yuksekligi 4 olan prizmanin hacmi ==> 3*3*4=36

        System.out.println(karePrizmaHacimBul(3,4));
        System.out.println(karePrizmaHacimBul(tabankenar, yukseklik));


    }

    //access mod  + static  + return type  + isim (){}
    //public , default , private , protected

    public static int karePrizmaHacimBul(int tabanKenari, int yukseklik){

        int hacim = tabanKenari*tabanKenari*yukseklik;

        return hacim;




    }

}
