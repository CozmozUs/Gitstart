package day01;

public class C05_MethodCreation {


    public static void main(String[] args) {
        //İki sayinin kareleri toplamini bulan ve yazdiran bir method olusturunuz

        //3 ve 5 --> 34 yazdiracak
        //methodum sadece yazdirma islemi yapacak bu yuzden return type void olabilir

        kareTopla(3, 5);//argument
        kareTopla(10, 100);
        kareTopla(4, 9);

    }
    public static void kareTopla (int sayi1, int sayi2)//parametre diyoruz ve burada deklare ettigimiz variablelar
    //method body kisminda kullanilabilir
    {
        int sonuc = sayi1*sayi1+sayi2*sayi2;
        System.out.println(sonuc);

    }







}
