package examples.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        HDTV tv1 = new HDTV(55, "Samsung");
        HDTV tv2 = new HDTV(60, "Sony");
        HDTV tv3 = new HDTV(42, "Panasonic");

        //Using Other Comparator Class
        ArrayList<HDTV> al = new ArrayList<HDTV>();
        al.add(tv1);
        al.add(tv2);
        al.add(tv3);
        
        //Sorting using Comparator
        Collections.sort(al, new SizeComparator());
        for (HDTV a : al) {
            System.out.println(a.getBrand());
        }
        //Using the same class implementing Comparator
        HDTV1 tv11 = new HDTV1(55, "TV55");
        HDTV1 tv12 = new HDTV1(60, "TV60");
        HDTV1 tv13 = new HDTV1(42, "TV42");

        ArrayList<HDTV1> al1 = new ArrayList<HDTV1>();
        al1.add(tv11);
        al1.add(tv12);
        al1.add(tv13);
        
        //Sorting using Comparator
        Collections.sort(al1, new HDTV1());
        for (HDTV1 a : al1) {
            System.out.println(a.getBrand());
        }
    }
}

/* Output

 Panasonic
 Samsung
 Sony
 TV42
 TV55
 TV60
 */
