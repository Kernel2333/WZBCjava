package com.WZBCunit2.jack;

import java.util.Scanner;

public class Unit2Question3 {
    public static void main(String args[]){
        System.out.println("请输入一个三位数：");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int unitDigit = num1%10;
        int hundredDigit = num1/100;
        int tensDigit = num1/10%10;
        System.out.printf("您输入的三位数是:"+num1+"\n"+"它的个位数是："+unitDigit+"\n"+"它的十位数是"+tensDigit+"\n"+"它的百位数是"+hundredDigit);
    }
}
