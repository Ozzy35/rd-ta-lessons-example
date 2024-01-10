package Lesson10HomeWork;
//Güneş'e olan sıralama numarasını,
// uzaklığı,
// yarıçapı,
// dönme süresini

//    Güneş sistemindeki tüm gezegenleri listeleyen bir Gezegen sınıfı tasarlayın.
//    Her gezegen, Güneş'e olan sıralama numarasını, uzaklığı, yarıçapı, dönme süresini içeren bilgileri içermelidir (kesin veriler gerekli
//değil).

public class GezegenlerListesi {

        public static void main(String[] args) {
            System.out.println("**********GEZEGENLERİMİZ****************");

            Gezegenler m =Gezegenler.MERKUR;
            System.out.println("1." +m );

            System.out.println("Güneş'e olan uzaklığı ortalama : " + Gezegenler.MERKUR.getUzaklik() + "km"  );
            System.out.println("Yarıçapı : "+Gezegenler.MERKUR.getYaricapi() + "km");
            System.out.println("Güneş etrafında dönüş süresi :    "+ Gezegenler.MERKUR.getDonmeSuresi() + "gün");

            System.out.println("**************************************************************************");

            Gezegenler v =Gezegenler.VENUS;
            System.out.println("2." +v);

            System.out.println("Güneş'e olan uzaklığı ortalama : " + Gezegenler.VENUS.getUzaklik() + "km"  );
            System.out.println("Yarıçapı: "+Gezegenler.VENUS.getYaricapi() + "km");
            System.out.println("Güneş etrafında dönüş süresi :    "+ Gezegenler.VENUS.getDonmeSuresi() + "gün");

            System.out.println("**************************************************************************");


            Gezegenler d =Gezegenler.DUNYA;
            System.out.println("3." +d);
            System.out.println("Güneş'e olan uzaklığı ortalama : " + Gezegenler.DUNYA.getUzaklik() +  "km" );
            System.out.println("Yarıçapı : "+ Gezegenler.DUNYA.getYaricapi() +  "km");
            System.out.println("Güneş etrafında dönüş süresi : "+ Gezegenler.DUNYA.getDonmeSuresi() + "gün");

            System.out.println("**************************************************************************");

            Gezegenler m2 =Gezegenler.MARS;
            System.out.println("4." +m);
            System.out.println("Güneş'e olan uzaklığı ortalama : " + Gezegenler.MARS.getUzaklik() +  "km"  );
            System.out.println("Yarıçapı : "+ Gezegenler.MARS.getYaricapi() + "km");
            System.out.println("Güneş etrafında dönüş süresi : " +Gezegenler.MARS.getDonmeSuresi() + "gün");

            System.out.println("**************************************************************************");

            Gezegenler j =Gezegenler.JUPİTER;
            System.out.println("5." +j);
            System.out.println("Güneş'e olan uzaklığı ortalama : " + Gezegenler.JUPİTER.getUzaklik() +  "km"  );
            System.out.println("Yarıçapı : "+ Gezegenler.JUPİTER.getYaricapi() + "km");
            System.out.println("Güneş etrafında dönüş süresi: "+ Gezegenler.JUPİTER.getDonmeSuresi() + "gün");

            System.out.println("**************************************************************************");

            Gezegenler s =Gezegenler.SATURN;
            System.out.println("6." +s);
            System.out.println("Güneş'e olan uzaklığı ortalama :   " + Gezegenler.SATURN.getUzaklik() +  "km"  );
            System.out.println("Yarıçapı :  "+ Gezegenler.SATURN.getYaricapi() + "km");
            System.out.println("Güneş etrafında dönüş süresi  :    "+  Gezegenler.SATURN.getDonmeSuresi() + "gün");

            System.out.println("**************************************************************************");

            Gezegenler u =Gezegenler.URANUS;
            System.out.println("7." +u);
            System.out.println("Güneş'e olan uzaklığı ortalama : " + Gezegenler.URANUS.getUzaklik() +  "km"  );
            System.out.println("Yarıçapı : "+ Gezegenler.URANUS.getYaricapi() + "km");
            System.out.println("Güneş etrafında dönüş süresi :    "+ Gezegenler.URANUS.getDonmeSuresi() + "gün");

            System.out.println("**************************************************************************");

            Gezegenler n =Gezegenler.NEPTUN;
            System.out.println("8." +n);
            System.out.println("Güneş'e olan uzaklığı ortalama : " + Gezegenler.NEPTUN.getUzaklik() +  "km"  );
            System.out.println("Yarıçapı : "+ Gezegenler.NEPTUN.getYaricapi() + "km");
            System.out.println("Güneş etrafında dönüş süresi :    "+ Gezegenler.NEPTUN.getDonmeSuresi() + "gün");

            System.out.println("***************NOT: Veriler Doğruluk Payı İçermez.********************************");


        }


}



