package coreJava;

import java.util.Scanner;

public class String_Manipulations {
    public static void main(String[] args) {
        /*Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
yazdırınız.
Örnek: mIAMI - Miami
miami - Miami
MIAMI - Miami
mIaMi - Miami vb.
String sehirIsim = " mIAMI ";
String konsolSehirIsım = sehirIsim.trim().toLowerCase();
konsolSehirIsım = konsolSehirIsım.substring(0,1).toUpperCase() + konsolSehirIsım.substring(1);
System.out.println(konsolSehirIsım);*/

        Scanner input = new Scanner(System.in);
        System.out.println("Şehir ismi giriniz: ");
        String city = input.next();

        System.out.println("Girdiğiniz Şehir: " + city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase());

        /*
2) Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
karakter sayısının toplamını yazdırınız.
Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
String isim1 = "Ali Can";
String isim2 = "Aliye Canan";
String isim3 = "Aliyev Can Cananov";
Integer c1 = isim1.replaceAll("\\s","").length();
Integer c2 = isim2.replaceAll("\\s","").length();
Integer c3 = isim3.replaceAll("\\s","").length();
System.out.println("Bosluk karakteri olmadan 3 ismin toplam karakter sayisi: " + (c1 + c2 + c3));*/

        String name1 = "Esra AKIN";
        String name2 = "Merve AKIN";
        String name3 = "Ahmet AKIN";

        String nameNoSpaces = (name1 + name2 + name3).replace(" ", "");
        System.out.println("İsimlerdeki boşluk harici karakter sayısı toplamı: " + nameNoSpaces.length());

        /*
3) Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
konsolda yazdırınız.
Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
String s = " Miami 33018!!! ";
Integer karakterSayisi = s.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
System.out.println("Toplam alfabetik ve sayısal karakter sayisi:" + karakterSayisi);
8 Techpro Education
String Manipulations*/
        String dummy = input.nextLine();
        System.out.println("Alfabetik ve Numerik toplam için Bir metin gir.");
        String alphabetundNum = input.nextLine();
        String alphabetundNumNew = alphabetundNum.replaceAll("[^a-zA-Z0-9]", "");
        //Harf ve rakam dışındaki herşeyi sildim.

        System.out.println(alphabetundNumNew);
        System.out.println("Alfabetik ve Numerik toplam: " + alphabetundNumNew.length());



        /*
4) Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
konsolda yazdırınız.
Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
String s = "2a3B4?-!5";
Integer rakamOlmayanKrkSayisi = s.replaceAll("[0-9]","").length();
System.out.println("rakam olmayan toplam karakter sayisi: " + rakamOlmayanKrkSayisi);*/
        String dummy1 = input.nextLine();

        String s = "Java 121212";
        String s1 = s.replaceAll("[0-9]", "");  //Tüm rakamları sildim.
        System.out.println(s1);
        System.out.println("Rakam hariç sayı= " + s1.length());


        /*
5) Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
karakteri yazdırınız.
Örnek: 'Ali Can' için n yazdırmalısınız.
‘Miami’ için i yazdırmalısınız.
String s = "Miami ";
int boslukOlmayanSonKrkIndex= s.trim().length()-1;
String boslukOlmayanSonKrk = s.substring(boslukOlmayanSonKrkIndex,
boslukOlmayanSonKrkIndex +1);
System.out.println("Bosluk olmayan son karakter: " + boslukOlmayanSonKrk);*/

        String dummy2 = input.nextLine();
        String s2 = "Ali Can ";
        String s2New = s2.trim();
        System.out.println(s2New.trim());
        System.out.println(s2New.charAt(s2New.length() - 1));


        /*
6) Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
toplamını bulunuz.
String s = "Miami";
int sonKrkIndex = s.length()-1;
int ilkKrkAscii= s.charAt(0);
int sonKrkAscii = s.charAt(sonKrkIndex);
System.out.println("ilk ve son karakterlerin ASCII degerlerinin toplami: " + (ilkKrkAscii +
sonKrkAscii));
Techpro Education 9
String Manipulations*/

        String s3 = "Miami";
        char s3Ilk = s3.charAt(0);
        char s3Son = s3.charAt(s3.length() - 1);
        System.out.print("İlk ve son karakterlerin ASCII toplamı= ");
        System.out.println(s3Ilk + s3Son);

        /*
7) Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
yazdırınız.
Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
String s = "Java";
String ilkKrkDisindakiler = s.substring(1);
System.out.println("ilk karakter disindaki tum karakterleri: " + ilkKrkDisindakiler);*/

        String s4 = "Java kolaydır.";
        String s4Yeni = s4.replace(s4.substring(0, 1), "");
        System.out.println(s4Yeni);

        /*
8) Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
büyük harfle yazdırınız.
Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
String s = "Java";
Integer sonKrkIndex = s.length()-1;
String sonKrkDisindakiler = s.substring(0, indexOfLastChar).toUpperCase();
System.out.println("son karakter disindaki tum karakterler buyuk harf ile : " + sonKrkDisindakiler);*/

        String s5="Java kolaydır";
        String s5New=(s5.substring(0,s5.length()-1)).toUpperCase();
        System.out.println(s5New);



/*
9) Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
karakterleri büyük harflerle yazdırınız.
Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
String s = "Java";
Integer sonKrkIndex = s.length()-1;
String ilkSonKrkDisindakiler = s.substring(1, sonKrkIndex).toUpperCase();
System.out.println("ilk ve son karakter disindaki tum karakterler buyuk harf ile : " +
ilkSonKrkDisindakiler);
10 Techpro Education
String Manipulations
10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
olmadığını kontrol etmek için kod yazınız.
Örnek: ‘Ali Can’ için konsolda false yazmalıdır.
‘ Ali Can ’ için konsolda false yazmalıdır.
‘ Ali Can ’ için konsolda false yazmalıdır.
‘Ali Can’ için konsolda true yazmalıdır.
String s = "Tom Hanks";
String trimlenmis = s.trim();
String hicBoslukYok = trimlenmis.replaceAll("\\s", "");
Boolean ortadaTekBoslukVarMi = trimlenmis.length() - hicBoslukYok.length()==1;
System.out.println("ortada tek bosluk var " + ortadaTekBoslukVarMi);
11) Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
yazınız.
Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır
‘Ali’ için kodunuz konsolda true yazmalıdır
String s = " Tom ";
String trimlenmis = s.trim();
Boolean sonuc = s.equals(trimlenmis);
System.out.println("basinda ve sonunda bosluk var mi : " + !sonuc);
12) Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
yazınız.
Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır
‘ali.’ için kodunuz konsolda false yazdırmalıdır
‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
‘Ali.’ için kodunuz konsolda true yazdırmalıdır
‘ALI.’ için kodunuz konsolda true yazdırmalıdır
String s = "Tom Hanks.";
char ilkKrk = s.charAt(0); char sonKrk = s.charAt(s.length()-1);
Boolean ilkKrkBuyukMu = ilkKrk >='A' && sonKrk <='Z';
Boolean sonKrkNoktaMi= sonKrk =='.';
Boolean ilkKrkBuyukSonKrkNoktaMi = ilkKrkBuyukMu && sonKrkNoktaMi;
System.out.println("Ilk karakter buyuk harf, son karakter nokta mi? "+ilkKrkBuyukSonKrkNoktaMi);
Techpro Education 11
String Manipulations
13) Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
sembol olmalıdır.
Örnek: 'A2b!' için kodunuz konsolda false yazdırmalıdır.
'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
'!1a23b4' için kodunuz konsolda false yazdırmalıdır.
'!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
'! a b 3 k' kodunuz konsolda false yazdırmalıdır.
String sifre = "!1a23b4?es";
Boolean enAzSekizKrkMi= sifre.replaceAll("\\s","").length()>=8;
Boolean enAzBirSembolVarMi = sifre.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>0;
System.out.println("sifre gecerli mi ? " + (enAzSekizKrkMi && enAzBirSembolVarMi));
14) Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek
için kod yazınız.
1. Yol:
String s = "Java";
Boolean sonuc = s.contains("v");
System.out.println("karakteri iceriyor mu? " + sonuc);
2. Yol:
String s = "Java";
Boolean sonuc = s.replaceAll("[^v]", "").length()>0;
System.out.println("karakteri iceriyor mu? " + sonuc);
3. Yol:
String s = "Java";
Boolean sonuc = s.indexOf("v")!=-1;
System.out.println("karakteri iceriyor mu? " + sonuc);
12 Techpro Education
String Manipulations
15) String gomlekFiyat = ‘$12.99’;
String kitapFiyat = ‘$35.99’;
Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
String s = gomlekFiyat.replaceAll("[$.]","");
String b = kitapFiyat.replaceAll("[$.]","");
double x = Double.valueOf(s);
double y = Double.valueOf(b);
System.out.println("Toplam Fiyat : " + (x+y)/100);
16) Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
Not: İkinci isim kapsam dışındadır.
Örnek: Tom Hanks ==> TH, Mary Star ==> MS
1.Yol:
String isim = "Tom Hanks";
String adIlkHarf = isim.substring(0,1);
int soyadIlkHarfIndex = isim.indexOf(" ") + 1;
String soyadIlkHarf= isim.substring(soyadIlkHarfIndex, soyadIlkHarfIndex +1);
System.out.println(adIlkHarf + soyadIlkHarf );
2.Yol:
String isim = "Tom Hanks";
String adIlkHarf = isim.substring(0,1);
String soyadIlkHarf = isim.split(" ")[1].substring(0, 1);
System.out.println(adIlkHarf + soyadIlkHarf );
17) Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
String s = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
int toplamKrkSayisi = s.length();
int noktalamaIsaretleriDisindakilerinSayisi = s.replaceAll("\\p{Punct}", "").length();
int noktalamaIsaretlerininSayisi= toplamKrkSayisi - noktalamaIsaretleriDisindakilerinSayisi;
System.out.println(noktalamaIsaretlerininSayisi);*/
    }
}
