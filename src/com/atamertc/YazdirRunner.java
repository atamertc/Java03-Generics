package com.atamertc;

public class YazdirRunner {
    /*Generic:
     Genellikle tiplerin belirsiz oldugu durumlarda kullanilir
     Ne ise yarar:
     Compile time da tip guvenligi saglar
     Siniflarin ve metodlarin farkli siniflar ile calismasini saglar
     Generic Method:
         T:Type
         E:Element
         K:Key
         V:Value
         N:Number
         S,U,V

     ? : genericlerde bilinmeyen tur icin kullanilabilir
     ? extends T : ? isareti olan yere T sinifindan kalitim alan herhangi alt sinif gelebilir
     ? super T : ? isareti olan yere T nin ust sinifi olan herhangi ust sinif gelebilir
      */
    public static void main(String[] args) {

        Integer[] sayilar = {10, 20, 30};
        String[] kelimeler = {"Ilk kelime", "lorem", "ipsum"};

        DiziYazdir<String> iy = new DiziYazdir();
        iy.yazdir(kelimeler);
        DiziYazdir<Integer> iy2 = new DiziYazdir();
        iy2.yazdir(sayilar);

        DiziYazdirV2 dyv2 = new DiziYazdirV2();
        dyv2.yazdirV2(kelimeler);
        dyv2.yazdirV2(sayilar);

        DiziYazdirV3 dyv3 = new DiziYazdirV3();
        dyv3.yazdirV3(kelimeler);


    }
}
