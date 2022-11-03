package ch.bbw;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner1 = new Scanner(System.in);
        Decode decode = new Decode();
        Hashmapper hm = new Hashmapper();
        System.out.println("Barcode eingeben" );
        String barcode = scanner1.nextLine();
        decode.getday1(barcode.substring(0,1));
        decode.getmonth1(barcode.substring(1,2));
        decode.getyear1(barcode.substring(2,3));
        hm.getprodukt(barcode.substring(3,4));
        decode.getday2(barcode.substring(4,5));
        decode.getmonth2(barcode.substring(5,6));
        decode.getyear2(barcode.substring(6,7));
        decode.getid(barcode.substring(7));



    }


}
