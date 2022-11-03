package ch.bbw;

import java.util.Locale;

public class Decode {
    public void getday1(String i) {
        String s = i.toLowerCase(Locale.ROOT);

        try {
            int inti = Integer.parseInt(i);
            String finstring = String.valueOf(inti+26);
            System.out.print("Das Produkt wurde am" + " "+ finstring);

        } catch (NumberFormatException e) {


            s = s.replace(" ", "");
            char[] c = s.toCharArray();

            for (Character ss : c)
                System.out.print("Das Produkt wurde am" + " " + (ss - 'a' + 1));


        }


    }
    public void getmonth1(String i) {
        String s = i.toLowerCase(Locale.ROOT);

        try {
            int inti = Integer.parseInt(i);
            String finstring = String.valueOf(inti+26);
            System.out.print("." + finstring);

        } catch (NumberFormatException e) {


            s = s.replace(" ", "");
            char c = s.charAt(0);

            System.out.print("." + (c - 'a' + 1));


        }


    }
    public void getyear1(String i) {
        String s = i.toLowerCase(Locale.ROOT);

        try {
            int inti = Integer.parseInt(i);
            String finstring = String.valueOf(inti+26);
            System.out.println("." + finstring + "Ausgeliehen");

        } catch (NumberFormatException e) {


            s = s.replace(" ", "");
            char c = s.charAt(0);

            System.out.println("." + (c - 'a' + 1) + " Ausgeliehen");
        }


    }
    public void getday2(String i) {
        String s = i.toLowerCase(Locale.ROOT);

        try {
            int inti = Integer.parseInt(i);
            String finstring = String.valueOf(inti+26);
            System.out.print("Das Produkt muss am" + " "+ finstring);

        } catch (NumberFormatException e) {

            s = s.replace(" ", "");
            char c = s.charAt(0);

            System.out.print("Das Produkt muss am " + (c - 'a' + 1));
        }


    }
    public void getmonth2(String i) {
        String s = i.toLowerCase(Locale.ROOT);

        try {
            int inti = Integer.parseInt(i);
            String finstring = String.valueOf(inti+26);
            System.out.print("." + finstring);

        } catch (NumberFormatException e) {


            s = s.replace(" ", "");
            char c = s.charAt(0);

            System.out.print("." + (c - 'a' + 1));
        }


    }
    public void getyear2(String i) {
        String s = i.toLowerCase(Locale.ROOT);


        try {
            int inti = Integer.parseInt(i);
            if (inti == 0){
                String finstring = String.valueOf(0);
                System.out.println("." + finstring + " " + "Zurücgegeben werden");
            }
            else {
                String finstring = String.valueOf(inti + 26);
                System.out.println("." + finstring + " " + "Zurückgegeben werden");
            }

        } catch (NumberFormatException e) {

            s = s.replace(" ", "");
            char c = s.charAt(0);

            System.out.println("." + (c - 'a' + 1) + " Zurückgegeben werden");

        }


    }






    public void getid (String i){
        int counter;
        System.out.print("Id = ");
        for(counter = 0; counter < i.length(); counter++) {
            try {
                int inti = Integer.parseInt(String.valueOf(i.charAt(counter)));
                if (inti == 0){
                    System.out.print(0);
                }
                else {
                    System.out.print(inti + 26);
                }
            } catch (NumberFormatException e){
                String s = i.toLowerCase(Locale.ROOT);
                char schar = s.charAt(counter);

                s = s.replace(" ", "");

                System.out.print(schar - 'a' + 1);



            }
        }

    }



}

