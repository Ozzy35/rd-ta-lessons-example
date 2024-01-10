package Lesson10HomeWork;

public enum Gezegenler {
    MERKUR(24397, 689, 5),
    VENUS(38000000, 60518, 243025),
    DUNYA(150000000, 6371, 24),
    MARS(230000000, 33895, 24),
    JUPİTER(750000000, 69911, 9),
    SATURN(145000000, 36584, 78),
    URANUS(478000000, 2145, 36),
    NEPTUN(598000000, 2148, 75);
    private double uzaklik;
    private double yaricapi;
    private double donmeSuresi;

    public double getUzaklik() {
        return uzaklik;
    }

    public void setUzaklik(double uzaklik) {
        this.uzaklik = uzaklik;
    }

    public double getYaricapi() {
        return yaricapi;
    }

    public void setYaricapi(double yaricapi) {
        this.yaricapi = yaricapi;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }

    public void setDonmeSuresi(double donmeSuresi) {
        this.donmeSuresi = donmeSuresi;
    }

    Gezegenler(double uzaklik, double yaricapi, double donmeSuresi) {
        {
            this.uzaklik = uzaklik;
            this.yaricapi = yaricapi;
            this.donmeSuresi = donmeSuresi;
        }


        }


    }





//Güneş'e olan sıralama numarasını,
// uzaklığı,
// yarıçapı,
// dönme süresini

//    Güneş sistemindeki tüm gezegenleri listeleyen bir Gezegen sınıfı tasarlayın.
//    Her gezegen, Güneş'e olan sıralama numarasını, uzaklığı, yarıçapı, dönme süresini içeren bilgileri içermelidir (kesin veriler gerekli
//değil).
