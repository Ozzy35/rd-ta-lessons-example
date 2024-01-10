package Lesson9NesneOzellikleri;


public class ArabaTest {

    public static void main(String[] args) {
//deklara etmekıcın deger atamak ıcın araba nesnesı olsuturuyoruz
        Araba araba1 = new Araba();

//atama yaparken;
        araba1.setModel("Renault");
        araba1.setYil(2023);

//yazdırıyoruz
//Hem alanlarıatadık okduk ve metodlarını esleyıp calıstırdık nesneyı bu sekılde olusturuyourz
//   Nesne olusturma= alanları olustur deger ata fonsıyonları calıstır ıstedıgımız yerde bunları kullanıyoruz
        System.out.println("1. Araba modeli: "+ araba1.getModel());
        System.out.println("1. Araba yili: "+ araba1.getYil());

        System.out.println("---------------------------");

        Araba araba2 = new Araba("Toyota",2022);

        System.out.println("2. Araba modeli: "+ araba2.getModel());
        System.out.println("2. Araba yili: "+ araba2.getYil());
    }
}