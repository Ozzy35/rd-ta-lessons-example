//package Lesson8HomeWork;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//
//public class Algoritma {
//
//
////  Bir dizi metni dolaşan bir algoritma oluşturun; her metin, tüm karakterlerin tekrar edilebilirliğini kontrol eder, ardından gerekli iki kelime bulunduğunda işlemi sonlandırır
////  ve bu kelimelerin karakterlerinden benzersiz bir karakter kümesi döndürür.
//
//
//    public static void main(String[] args) {
//        System.out.println("************Bir dizi metni dolaşan bir algoritma****************");
//
//        String[] dize1 = {"Pazartesi", "Salı", "Çarşamba" };
//        String[] dize2 = {"Pazartesi", "Salı", "Çarşamba"};
//        String[] dize3= {"Cumartesi","Pazar"};
//        String[] dize4 = {"Pazartesi","Salı", "Çarşamba"};
//        String[] dize5 =dize2;
//
//        for (String[] )
//        System.out.println("1. "+ Arrays.equals(dize1,dize2));
//        System.out.println("3. "+ Arrays.equals(dize2 , dize3));
//        System.out.println("5. "+ Arrays.equals(dize2 , dize5));
//
//
//
//
//    }
//
//        }
//
//
////Çıktıda görüldüğü üzere d1 ve d2 nin elemanları birebir aynı olmasına rağmen
//// 1. sırada true, 2. sırada false döndürdü çünkü 1. sırada elemanları, 2. sırada ise dizilerin bellekteki yerlerini karşılaştırmış olduk.
////3. sırada false döndürdü çünkü d2 ve d3 dizilerinin elemanları farklı.
////4. sırada false döndürdü çünkü d2 ve d4 dizilerinin elemanları ve bellekteki yerleri farklı.
////5. ve 6. sıraların her ikisinde de true döndürdü çünkü d5 i oluştururken d2'nin bellekteki yeri ve elemanlarını d5'e atayarak tanımladık.
