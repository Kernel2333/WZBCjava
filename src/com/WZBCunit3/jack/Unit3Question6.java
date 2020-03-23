package com.WZBCunit3.jack;

import java.util.Scanner;
public class Unit3Question6 {
    public static void main(String[] args) {
        int rows = 5;
        for (int row = 1;row<=rows;row++) {
            for (int col = 1; col <=rows-row; col++) {      //行数的空格是：行数-行号
                System.out.print(" ");
            }

            for (int col = 1; col <= row*2-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");

        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.printf(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }

    }
}
