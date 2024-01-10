package Lesson5HelloWorld;

public class CalisanTest {
    public static void main(String[] args) {
        //calisan sinifi olusturma

        Calisan calisan1 = new Calisan();
        Calisan calisan2= new Calisan();
        Calisan calisan3= new Calisan();


        calisan1.isim= "Vesela";
        calisan1.soyisim="Bochevska";

        calisan2.isim= "Damiano";
        calisan2.soyisim="Toretti";

        calisan1.calisanBilgileriGoster();
       calisan2.calisanBilgileriGoster();


    }
}
