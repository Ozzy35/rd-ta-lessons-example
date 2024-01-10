package Lesson9NesneOzellikleri;

public class StaticOzellikler {

    public static final double PI = 3.14;

    public static int sayac = 0;

    public  int instanceSayac =0;

    // Constructor degerı olusturuldu!2sınınde degerını 1er bırer arttırıyoruz
//    constructorlar nesneyı urettıgınız anda yapan kısımdır.
    public StaticOzellikler() {
        sayac++;
//        sayac ++ erısmek ıstedıgımızde ılk once nesneyı orneklerdırmelıyız
//        nesne olsuturmalıyız statıc alan seklınde
//        yukarıdakı gıbı dırek erısemyıoruz fınal kullaımı ve kulanılmamam durumu
        instanceSayac++;
    }

    public static void main(String[] args) {
// Okuttgumuz alan asagıdakı sekmede PI olarak belırttıgımız degerı okuyoruz

        System.out.println("PI sayısı: "+ StaticOzellikler.PI);
//sayac ıcın nesne olusturuldu
        StaticOzellikler nesne1 = new StaticOzellikler();
        System.out.println("Sayaç: "+ StaticOzellikler.sayac);
        System.out.println("InstanceSayac: " + nesne1.instanceSayac);


        StaticOzellikler nesne2 = new StaticOzellikler();
        System.out.println("Sayaç: "+ nesne2.sayac);
        System.out.println("InstanceSayac: "+ nesne2.instanceSayac);

//ınstance ler ne yapıyorduk bız ?bır tane ornek olsuturup o ornek uzerınden erısıyorduk
// dırek erısemıyoruz bır degerımzı yok ,ornek olusturdugumuzda anda standart tanımladıgımız
// alanlarolusyuor

//  ınner statıc de mesela sunu anlatıyor bu degerlere atama yapmdan orneklemeden erısebılıyorsunuz

        StaticOzellikler nesne3 = new StaticOzellikler();
        System.out.println("Sayaç: "+ nesne3.sayac);
        System.out.println("InstanceSayac: "+ nesne3.instanceSayac);

//statıc ve static olmayan alanlar arasındakı nın arasındakı en buyuk fark:
// dırek erısım saglıyor

}
}