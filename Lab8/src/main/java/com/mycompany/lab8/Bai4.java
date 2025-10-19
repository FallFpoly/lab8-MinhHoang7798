//Name : Phạm Minh Hoàng 
//Mssv : PS47440
//Date : 
//Slide:
package com.mycompany.lab8;

public class Bai4 {

    public static void main(String[] args) {
        double tong = Bai123.sum(1.5, 2.5, 3.5);
        System.out.println("Tong = " + tong);

        double min = Bai123.min(4.0, 2.0, 6.0, 1.0);
        System.out.println("Min = " + min);

        double max = Bai123.max(4.0, 2.0, 6.0, 1.0);
        System.out.println("Max = " + max);

        String name = Bai123.toUpperFirstChar("nguyen van teo");
        System.out.println("Name = " + name);
    }
}
