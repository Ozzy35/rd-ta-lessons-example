package Lesson9NesneOzellikleri;

public class HesapMakinesi {

    public int topla(int sayi1, int sayi2) {

//        ınt 2 tane deger parametre alıyor
//3.cu bır degısken saglandı ın sonuc adında
        int sonuc = sayi1 + sayi2;
//        ınt sonuc dıgerekten degısken tanıyor atam yapıyor
        return sonuc;
//        ınt tıpınde deger donuyor

    }
//method olusturduk asagıda:
    public double topla(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    public int topla(int sayi1, int sayi2, int sayi3) {
        int sonuc = sayi1 + sayi2 + sayi3;
        return sonuc;
    }
//publıc double .vs bunlartın hepsıne method ımzası dıyoruz asagıdakı gıbı:
//    return tıpı bır metodun return tıp olarak belırledıgımız kulandıgımız tanım
    public double cikar( double sayi1, double sayi2) {
        double sonuc = sayi1 -sayi2;
        return  sonuc;
    }
//returnd da ınt degerı verırsen double kabl edıyor ınteger double daha kucuk halı noktaalrı degerıde aldıgı ıcın tamsayıyı double
// cevırmen kolay o yuzden ızın verıyor.Statıc case yapıyor kabul etmıyor.
    public static void main(String[] args) {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();

        int toplamaSonucu = hesapMakinesi.topla(4,8);
        double cikarmaSonucu = hesapMakinesi.cikar(10,4);



        System.out.println("Toplama sonucu: "+ toplamaSonucu);
        System.out.println("Çıkarma sonucu: "+ cikarmaSonucu);

        System.out.println("Toplama sonucu: " + hesapMakinesi.topla(5.3, 2.1));
        System.out.println("Toplama sonucu: " + hesapMakinesi.topla(5, 6, 7));
    }


}
