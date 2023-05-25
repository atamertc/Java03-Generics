package com.atamertc;

import java.util.ArrayList;
import java.util.List;

public class GenericOrnek {
    public static void main(String[] args) {
        //<> Diamond icine tipi vermezsen herseyi doldurabilirsin bu listeye
        //doldurdugun veriler Object olarak depolanir ve cagirdinizdada tipsiz
        //olarak doner

        List list = new ArrayList<>();
        list.add("Hello");
        list.add(123);

        //Cast edilebilir ama guzel bir kullanim degil
        System.out.println(list);
        var ilkEleman = list.get(0);
        String s = (String) ilkEleman;
        String s1 = s.toUpperCase();
        System.out.println(s1);
    }
}
