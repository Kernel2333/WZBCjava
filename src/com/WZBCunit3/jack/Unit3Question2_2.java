package com.WZBCunit3.jack;

import java.util.Scanner;

public class Unit3Question2_2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三个数：");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double[] mySide = new double[]{num1,num2,num3};
        BubbleSort(mySide, mySide.length);
//        System.out.println("排序后的三边为"+mySide[0]+","+mySide[1]+","+mySide[2]);
        boolean isTri = isTriagle(mySide[0],mySide[1],mySide[2]);
        if(isTri){
            double area = TArea(mySide[0],mySide[1],mySide[2]);
            System.out.print("您输入的三个数可以构成三角形！它的面积为：");
            System.out.printf("%.2f",area);
        }else{
            System.out.println("您输入的三个数不能构成三角形！");
        }
    }

    public static void BubbleSort(double[] arr,int n){
        for (int i = 0; i < n; ++i) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    public static boolean isTriagle(double num1, double num2, double num3){
        boolean flag = true;
        if(!(num1+num2>num3 && num2-num1<num3))
            flag = false;

        return flag;
    }

    public static double TArea(double num1,double num2,double num3){
        double area = 0;
        double round = (num1+num2+num3)/2;
        area = Math.sqrt(round*(round-num1)*(round-num2)*(round-num3));
        return area;
    }
}
