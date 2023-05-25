package com.atamertc;

import java.util.Arrays;

public class DiziYazdirV3 {
    public <T> void yazdirV3(T[] dizi) {
        Arrays.stream(dizi).forEach(System.out::println);

    }
}
