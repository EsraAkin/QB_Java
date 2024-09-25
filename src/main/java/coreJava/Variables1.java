package coreJava;

import java.util.Scanner;

public class Variables1 {
    public static void main(String[] args) {
        //1)Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
        // toplamını konsola yazdırınız.
        double a = 14.7;
        double b = 13.3;
        double c = 12.7;

        double sum = a + b + c;
        System.out.println("Toplam Fiyat: " + sum);  //Toplam Fiyat: 40.7


        //2) Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
        //değişkenlerin değerlerinin çarpımını konsolda yazdırınız.
        float a1 = 1.5F;
        long b1 = 2;
        int c1 = 2;

        float multi = a1 * b1 * c1;
        System.out.println("multi = " + multi);  //multi = 6.0
        
        /*
        3) Basit faizi bulmak için bir kod yazınız.
           Not: Basit faiz formülü = anapara * oran * yılDegeri /100
         */

        int anapara = 10000;
        int oran = 6;
        int yil_degeri = 3;
        float faiz = anapara * 6 * yil_degeri / 100;

        System.out.println("faiz = " + faiz);   //faiz = 1800.0

        /*
        4) Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
        toplamını ve çarpımını String ile yazdırınız.*/

        String s = "Sonucu= ";
        long num1 = 58;
        long num2 = 12;

        System.out.println("Toplam " + s + (num1 + num2));  //Toplam Sonucu= 70
        System.out.println("Çarpım " + s + (num1 * num2));  //Çarpım Sonucu= 696

        /*
        5)Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve bu değerleri iki
ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.*/
        boolean m = true;
        boolean n = false;
        System.out.println("ardarda = " + m + " " + n);  //ardarda = true false

         /*6)
         3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
         Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.*/


        long kitap = 85, defter = 50, laptop = 100000;
        System.out.println("Toplam fiyat= " + (2 * kitap + 4 * defter + 3 * laptop));   //Toplam fiyat= 300370

        /*7) İki tamsayıyı değiştirmek için bir kod yazınız.*/
        Scanner input = new Scanner(System.in);
        System.out.println("2 sayı giriniz :");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        System.out.println("Sayı1 ve Sayı2 sırasıyla " + sayi1 + " " + sayi2);  //3 4

        int tutucu = sayi2;//3
        sayi2 = sayi1;
        sayi1 = tutucu;

        System.out.println("Değiştirdikten sonra = " + sayi1 + " " + sayi2);   //4 3

    }
}
