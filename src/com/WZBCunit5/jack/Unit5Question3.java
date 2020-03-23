package com.WZBCunit5.jack;

public class Unit5Question3 {
    public static void main(String args[]){
        int grade1 = 91;
        int grade2 = 86;
        int grade3 = 56;
        int grade4 = 86;
        int grade5 = 84;
        AverageGrade(grade1,grade2,grade3,grade4,grade5);
    }

    public static void AverageGrade(int...grade){
        int sum = 0 ;
        for(int i = 0; i<grade.length; i++){
            sum += grade[i];
        }
        int average = sum/grade.length;
        System.out.println("该学生的平均成绩为："+average);
    }
}
