//Name : Phạm Minh Hoàng 
//Mssv : PS47440
//Date : 
//Slide:
package com.mycompany.lab8;

public final class Bai123 {

    public static double sum(double... x) {
        double s = 0;
        for (double num : x) {
            s += num;
        }
        return s;
    }

    public static double min(double... x) {
        double min = x[0];
        for (double num : x) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double max(double... x) {
        double max = x[0];
        for (double num : x) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static String toUpperFirstChar(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            char upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);
            words[i] = upperFirstChar + words[i].substring(1);
        }
        String ss = String.join(" ", words);
        return ss;
    }

}
