package com.WZBCunit4.jack;

public class Unit4Question4 {
    public static void main(String[] args){
        double[] fibonacci = new double[1000];
        for(int i=0;i<fibonacci.length;i++){
            if(i<=1){
                fibonacci[i] = 1;
            }else{
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }

        for(int j=0;j<fibonacci.length;j++){
            System.out.print(fibonacci[j]+" ");
            if(j%10 == 9){
                System.out.printf("\n");
            }

        }
        double goldenSection = fibonacci[48]/fibonacci[49];
        System.out.printf("%.10f",goldenSection);
    }
}
