package com.pattern;

import java.util.Scanner;

public class PatternM {
    public static void main(String[] args) {
        double x,y,m;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the size");
        m=s1.nextDouble();
        for(y=m;y>=-m;y--){
            for(x=-m;x<=m;x++){

                if((Math.abs(Math.abs(x)-y)<m/5&&y>0)||(Math.abs(x)<=m&&Math.abs(x)>=m-(m/5))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
