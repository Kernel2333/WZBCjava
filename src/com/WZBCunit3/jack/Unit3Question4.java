package com.WZBCunit3.jack;

import java.util.Scanner;

public class Unit3Question4 {
    public static void main(String args[]){
        String mima = "mima";
        System.out.println("请输入密码：");
        Scanner sc= new Scanner(System.in);
        int i = 0;
        while(true){
            if(i == 3){
                System.out.println("输入密码错误次数超过三次！退出系统！");
                System.exit(0);
            }else {
                String input = sc.next();
                if (input.equals(mima)) {
                    System.out.println("密码正确登录成功！");
                    break;
                } else {
                    System.out.println("请输入正确的密码！");
                    i++;
                }
            }
        }
    }
}
