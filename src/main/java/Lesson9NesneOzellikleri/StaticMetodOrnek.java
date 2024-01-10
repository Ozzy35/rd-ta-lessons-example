package Lesson9NesneOzellikleri;

public class StaticMetodOrnek {
    public static void staticMetod(){
        System.out.println("Bu static metotdur");
    }

    public static void nonStaticMetod(){
        System.out.println("Static olmayan metot");


    }
//NonStatıc metod ıcerısınden o metodu calıstıramzssın.
    public static void main(String[] args) {
        StaticMetodOrnek.staticMetod();

        StaticMetodOrnek nesne1= new StaticMetodOrnek();
        nesne1.nonStaticMetod();


    }
}
