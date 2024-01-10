package Lesson6OperatorveKosullar;

public class BonusHesabi {
    //Odev5 Muhasebe departmanı için personelin çalıştığı gün bilgisini girdiğinde bu girilen
// gün üzerinden maaşını hesaplayan ve eğer personelin o ay için çalıştığı gün sayısı
// 25’ten fazla ise fazla olan her gün için ekstra 1000TL prim veren metodu yazınız

    //sınıfın Nitelikleri yaziyoruz.Ozellıkler sınıfın ıcerısındekı degerler alıyor
    String name;
    double salary;
    int workHours;
    double bonus;

//constructor
    //Metodumuzu olusturlaım,eşleyelım.Nesne turetırken kendısını cagırıyor constroctor
    // farklı parametreler
    // alan hale getırıyoruz
    //aldıgımız modelı dısarıdan almamız gerekıyor ,bılgılerı aıtyıorz
    public BonusHesabi(String name, double salary, int workHours) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
    }

    //metodlarımı olusturalım içerıgını yazalım

    public void bonus() {
        if (this.workHours > 25) {
            this.bonus = (workHours - 25) * 1000;
            System.out.println("Extra çalışma saatlerine uygulanan bonus miktarı : 1000 TL " + this.bonus);
        } else {
            System.out.println("Bonus almaya hak kazanmadınız. ");

        }
    }

    public void printInfo() {
        System.out.println("  ");
        System.out.println("*******************************");
        System.out.println("Çalışanın adı:" + getName());
        System.out.println("Çalışsanın maaşı:" + getSalary());
        System.out.println("Çalışanın çalışma saatleri: " + getWorkHours());
        System.out.println("*********************************");

        bonus(); //Constructors

    }
 //GET Metodu
 //Bir özelliğin değeri okunmak istenildiğinde o özelliğe ait GET metodu çalışır.
//   SET Metodu
//Bir özelliğe atama yapılmak istenildiğinde o özelliğe ait SET metodu çalışır.
// Atanan değere SET metodu içerisinde value anahtar sözcüğü ile erişilir.
// value anahtar sözcüğünün önceden belirlenmiş herhangi bir türü yoktur.
// Özelliğe atanacak değer hangi türden ise value da o türden olur.

    public String getName() {
        return name;
        //nmae bılgısını aılıyor name donuyor.bzım mvecutta nesedek atadıgımız modelı gerı donuyor
    }

    public void setName(String name) {
        this.name = name;
//        name bılgısını st dıyoruz void ile yazılır parametre gecıyoruz strıng name ıle.
//        Mevcut modelı set lememız yarıyor.
    }

    public double getSalary() {
        return salary;

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }


    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}



