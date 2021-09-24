package com.pattern;

public class PatternV {
    public static void main(String[] args)
    {
        PatternV v=new PatternV();
        v.vPattern();
    }
    public void vPattern()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i<=4&&j==1||i<=4&&j==5||i==5&&j==2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
