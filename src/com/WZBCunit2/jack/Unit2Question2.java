package com.WZBCunit2.jack;

import java.util.Scanner;
public class Unit2Question2 {
    public static void main (String args[]){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String stName = input1.next();
        System.out.println("请输入学生平时成绩");
        int stAverageScore = input2.nextInt();
        System.out.println("请输入学生期末成绩");
        int stFinalScore = input2.nextInt();
        System.out.println("请输入学生总评");
        int stAllScore = input2.nextInt();
        System.out.println("某班的JAVA成绩单");
        System.out.println("-------------华丽丽的分隔符-----------");
        System.out.printf("姓名"+"\t\t"+"平时成绩"+"\t\t"+"期末成绩"+"\t\t"+"总评"+"\n");
        System.out.printf(stName+"\t\t"+stAverageScore+"\t\t"+stFinalScore+"\t\t\t"+stAllScore);
    }
}