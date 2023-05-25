package com.atamertc;

import java.util.Collections;
import java.util.List;

public class Sirala {

    public static <T extends Comparable<T>> void siralama(List<T> liste) {
        Collections.sort(liste);
        for (T t :
                liste) {
            System.out.println(t);
        }
    }
}
