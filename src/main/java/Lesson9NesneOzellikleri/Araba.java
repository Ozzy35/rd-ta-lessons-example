package Lesson9NesneOzellikleri;


public class Araba {
//    sınıf tanımlıyorsanız alan turu +alan ısmı atanıyor
//Nesneleri, sınıfın ozellıklerını belırtıyoruz.
//Alan turunu tanımlıyoruz strın ıfadede alanın turu markadır dıye belırttık
    private String marka;
    private String model;
    private int yil;
    private boolean otomatik;
//Nesne Metodları, bir sınıfın nesnenın davranıslarını, eylemlerını belırtıyoruz.
//    Nesnelere, metodlara, sınıflara hepsıne nasıl erişecegımız belırleyen ozel
//    kontrol etmek ıcın kullanılan belırleyıcı sagladık;
//    contructor adı sınıf adıyla aynı olmalı,sınıf olusturcaksan nesen turetırken kendısını cagırabılsın o yuzden aynısını yazıyoruz
//    bırden fazal farklı parametlerlerle yapabılırız asagıdakı gıbı

    public Araba(){
        System.out.println("Constructor metodu çalıştı");
    }
//Public her yerden saglanıyor class public oluyor,alan public oluyor her yerden erısılebılıyor
//    Private de tanımladıgı sınıfdan eırısme ızın verır


//Nesnelere deger atama
//aynı sekılde constroctor ısım saglıyamzssın
    public Araba(String model, int yil){
        System.out.println("Constructor metodu çalıştı. Araba model ve yıl bilgisi atandı");
        this.model = model;
        this.yil = yil;
    }
//aynı sekılde constrokto metodu olusturamazssın kızar
//    return model bılgısını donucek getModel metodunda
    public String getModel() {
        return model;
    }
//mevcuttakı atamıs ooldugumu modelı gerı donuyor
//    mevcut modelımizi setlemıze yarıyor cunku alanlarımızı
//    private cektık sadece nesen ıcerısıden edıtlenebılır hale getırdık
//    halıyle bız bunları okuyup setlıyemıycegız o yuzden bırer tane get ve set metodu olsuturduk
//    ve 2 tane constroktor olsyturuduk
    public void setModel(String model){
        this.model = model;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil){
        this.yil = yil;
    }


    void calistir() {
        model = "Yaris";
        System.out.println("Araba çalıştırıldı");
    }

    void durdur() {
        System.out.println("Araba durdu");
    }

}