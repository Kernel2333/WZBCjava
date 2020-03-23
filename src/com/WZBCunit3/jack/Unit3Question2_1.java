package com.WZBCunit3.jack;

import java.util.Scanner;

public class Unit3Question2_1 {
    public static void main(String args[]){
        double area = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("请输入三个数，以回车结束：");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();
        System.out.println("您输入的三条边分别是"+edge1+"\t"+edge2+"\t\t"+edge3);

        if(edge1*edge1+edge2*edge2 == edge3*edge3 || edge2*edge2+edge3*edge3 == edge1*edge1 || edge1*edge1+edge3*edge3 == edge2*edge2){
            if(edge1>edge2 && edge1>edge3){
                area = (edge2*edge3)/2;
                System.out.printf("%f",area);
            }else if(edge2>edge1 && edge2>edge3){
                area = (edge1*edge3)/2;
                System.out.printf("%f",area);
            }else if(edge3>edge1 && edge3>edge2){
                area = (edge1*edge2)/2;
                System.out.printf("%.2f",area);
            }else{
                System.out.println("Sorry, there is something wrong");
            }
        }else{
            System.out.println("您输入的不是直角三角形");
        }
    }
}
