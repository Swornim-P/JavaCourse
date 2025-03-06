package com.Week7;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> library = new HashSet<String>();
        library.add("Book1");
        library.add("Book2");
        library.add("Book3");
        library.add("Book4");
        library.add("Book5");
        System.out.println(library);

        /*library.clear();
        System.out.println(library);*/
        Iterator it = library.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
