package com.pattern;

public class PatternP {
    public static void main(String[] args)
    {
        PatternP p=new PatternP();
        p.pPattern();
    }
    public void pPattern()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j==1||i==1||i==3||i==2&&j==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
