package com.pattern;

public class PatternR {
    public static void main(String[] args)
    {
        PatternR r=new PatternR();
        r.rPattern();
    }
    public void rPattern()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j==1||i==1||i==3||i==2&&j==5||i==4&&j==4||i==5&&j==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
