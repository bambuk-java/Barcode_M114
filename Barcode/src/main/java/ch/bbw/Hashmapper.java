package ch.bbw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class Hashmapper {
    private HashMap <Integer, String> Produkte = new HashMap<>();

    public Hashmapper() {
        Produkte.put(1, "Maus1");
        Produkte.put(2, "Maus2");
        Produkte.put(3, "Maus3");
        Produkte.put(4, "Tablet1");
        Produkte.put(5, "Tablet2");
        Produkte.put(6, "Tablet3");
        Produkte.put(7, "PC1");
        Produkte.put(8, "PC2");
        Produkte.put(9, "PC3");
        Produkte.put(10, "Drucker1");
        Produkte.put(11, "Drucker2");
        Produkte.put(12, "Drucker3");
        Produkte.put(13, "Lampe1");
        Produkte.put(14, "Lampe2");
    }




    public void getprodukt (String i){

        String s = i.toLowerCase(Locale.ROOT);
        s = s.replace(" ", "");
        char[] c = s.toCharArray();

        

        for (Character ss : c)

            System.out.println("Das Produkt heisst:" + " " + Produkte.get(ss - 'a' + 1));


    }
    

}

