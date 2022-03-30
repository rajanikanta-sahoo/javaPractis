package com.company;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String s1;String s2;String s3;String s4;
        String[] s = new String[5];
        s[0]="rama";
        int[] i = new int[5];
        i[2]=5;
        int[][] j = new int[2][2];

        j[0][0]=1;


//        System.out.println(s[1]);
//        System.out.println(i[2]);
List<String> l = Arrays.asList("lulu","bulu");
        System.out.println(l);
        System.out.println(String.join(",",l));

        for (int k=2;k<3;k++){
            System.out.println(i[k]);
        }

        for(int k:i){
            System.out.print(k+", ");
        }
    int p =5;
        float o = p;
        p = (int)o;


    }
}
