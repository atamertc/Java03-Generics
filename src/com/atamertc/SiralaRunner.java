package com.atamertc;

import java.util.ArrayList;
import java.util.List;

public class SiralaRunner {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(30);
        sayilar.add(20);
        sayilar.add(5);

        Sirala.siralama(sayilar);

        List<String> strings = new ArrayList<>();
        strings.add("Ali");
        strings.add("Veli");
        strings.add("Beli");
        strings.add("Deli");
        Sirala.siralama(strings);
    }
}
