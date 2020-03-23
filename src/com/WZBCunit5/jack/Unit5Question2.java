package com.WZBCunit5.jack;

public class Unit5Question2 {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 65;
        PlusNum(num1,num2);
        float num3 =1.2f;
        float num4 =2.5f;
        PlusNum(num3,num4);
    }
    public static void PlusNum(int num1,int num2){
        int sum = num1+num2;
        System.out.println("这两个数的和是："+sum);
    }
    public static void PlusNum(float num1,float num2){
        float sum = num1+num2;
        System.out.println("这两个数的和是："+sum);
    }
}
