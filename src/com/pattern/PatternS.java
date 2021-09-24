package com.pattern;

public class PatternS {
    public static void main(String[] args)
    {
        PatternS s=new PatternS();
        s.sPattern();
    }
    public void sPattern()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j>=2&&i==1||i==2&&j==1||i==3||i==4&&j==5||j<=4&&i==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

}
