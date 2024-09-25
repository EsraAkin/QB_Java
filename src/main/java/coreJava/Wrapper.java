package coreJava;

public class Wrapper {
    public static void main(String[] args) {
        /*
        1) Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
        bulmak için bir kod yazınız.*/

        byte byteMin = Byte.MIN_VALUE;
        short shortMAx =Short.MAX_VALUE;
        System.out.println("Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamı = "+(byteMin + shortMAx));

        /*
        2) Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        değişken arasındaki farkı yazdırınız.*/
        
        String  str="103";
        byte strb=Byte.valueOf(str);
        System.out.println("strb = " + strb);  //103
        
        String str2="2351";
        short str2s=Short.valueOf(str2);
        System.out.println("str2s = " + str2s);  //2351

        System.out.println("fark = " + (str2s-strb));   //fark = 2248
        /*
        
         3) valueOf(String s) ile parseByte(String s) methodları arasındaki farklar nelerdir?*/
        /*
        parseByte() ilkel tamsayı (primitive integer) tipini (int) döndürürken; valueOf(), ilkel tamsayının
        nesne temsilcisi olan Java.lang.Integer'ı döndürür. Primitive türler yerine, bir tamasyı nesnesini
        isteyebileceğimiz durumlar da vardır.
        Bariz olan bir diğer fark ise; valueOf() bir örnek metod(instance method) iken parseByte() statik
        bir metoddur.
        */
    }
}
