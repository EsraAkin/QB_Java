package coreJava;

public class type_Casting {
    public static void main(String[] args) {
        /*1) Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.*/
        short yas = 12;
        int yeniYas = yas;
        
        /*
        2) Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.*/

        long sayi1 = 18888;
        int sayi2 = (int) sayi1;
        
        /* 
        3) Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.*/
        double fiyat = 545454.8;
        float yeniFiyat = (float) fiyat;
        
        
        /*      
        4) Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.*/
        double fiyatd = 45.444;
        short fiyats = (short) fiyatd;
        System.out.println("fiyats = " + fiyats);  //fiyats = 45

        /*              
        5) Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.*/
        byte age = 45;
        double aged = age;
        System.out.println("aged = " + aged);  //aged = 45.0

    }
}
