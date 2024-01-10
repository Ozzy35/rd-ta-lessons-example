package Lesson9NesneOzellikleri;
//nesnemızın ıcersınde degısıklık yapmamaızı saglıyor.Nesne uzerınde degısıklık yapmak ıcın
// kullanıyoruz.Mesela toStrıng halıne geıtrdıgımzde  metodun parametresını alıp donusturme salayabılırız
//Bır metoda atama yapma yapıyoruz.Test tarafında API buılder pennet de ,toStrıng de kullanıcaz.Alanları parametrelerın degını
// gırıp donusturdugumde o nesenın tum degerlerını strınge cevırebılıyoruz

import Lesson8OtomasyonicinKullanilanVeriYapilari.Ogrenci;

public class NesneAktarma {

    public static void main(String[] args) {
//        ogencı nesnesı olsutrduk

        Ogrenci ogrenci = new Ogrenci("Ahmet", 20);

        System.out.println("Orijinal öğrenci bilgileri: " + ogrenci.getAd() + ", " + ogrenci.getYas());

        degisiklikYap(ogrenci);

    }

    public static void degisiklikYap(Ogrenci ogrenci) {
        ogrenci.setAd("Mehmet");
        ogrenci.setYas(22);

        System.out.println("Metot içerisindeki öğrenci bilgileri: " + ogrenci.getAd() + ", " + ogrenci.getYas());


    }
}