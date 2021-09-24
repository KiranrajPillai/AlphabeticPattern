package com.pattern;

public class PatternU {
    public static void main(String[] args)
    {
        PatternU u=new PatternU();
        u.uPattern();
    }
    public void uPattern()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i<=4&&j==1||i<=4&&j==5||i==5&&j==2||i==5&&j==3)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
