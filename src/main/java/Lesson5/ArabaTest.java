package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArabaTest {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
           Araba araba1 = new Araba();
           Araba araba2 = new Araba();


           araba1.marka = "Wolswagen";
           araba1.model = "Passat";
           araba1.renk = "Siyah";

           araba2.marka = "BMW";
           araba2.model = "X5";
           araba2.renk ="Siyah";

        araba1.calistir();
        araba1.hizlan( 50);
        araba1.durdur();

        araba2.calistir();
        araba2.hizlan( 90);
        araba2.durdur();


        }
    }
