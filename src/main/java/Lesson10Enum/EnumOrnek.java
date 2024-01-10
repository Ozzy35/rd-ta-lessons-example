package Lesson10Enum;

public class EnumOrnek {
    public enum Gunler{
        PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR
    }
    public static void main(String[] args) {
//eger sadece asagıdakı persembe gıbı ılgılı yerde yazdırcaksanız persembe satırı yazımı daha dogru,ENUM lara farklı sekılde erısımımız
// mevcut 3unude gorduk
        System.out.println("Bugün günlerden: " + Gunler.PERSEMBE);

        System.out.println("-------------");
//Vlues le ıcerısındekı tum degerlerı alıyoruz.
//        For each dongusuyle haftanın gunelrını yazdırdık gunler enum ıcerısndekı
//   tum degerlerı tek tek donup gun degıskenınee atayıp tek tek yazdırdı
        for (Gunler gun : Gunler.values()){
//Tum gunlerı tek tek dolasarak alıcak
            System.out.println(gun);
//            yukarıda tum gunlerı telk  tek dolsarak yazıcak
        }

        System.out.println("-------------");
// secılen gun tıpınde nesne olustuyoruyoruz sonrada yazdırıyoruz
//        cuma olarak1 tane value alarak bunu secılen gun dıyerek degıskene atayıp yazdırdık
//        degısken olarak da ıslem yapabılırız
//        eger bır degıskene atayıp ıslem yapılacaksa asagıdakı ıslem gıbı yapılması daha mantıklı cuma dakı gıbı
        Gunler secilenGun = Gunler.valueOf("CUMA");
        System.out.println("Seçilen Gün: " + secilenGun);
//        9cu satır ıle 26.cı stır yazımı aynı seyı ıfade edıyor

    }
}

