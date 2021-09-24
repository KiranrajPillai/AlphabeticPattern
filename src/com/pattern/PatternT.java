package com.pattern;

public class PatternT {
    public static void main(String[] args)
    {
        PatternT t=new PatternT();
        t.tPattern();
    }
    public void tPattern()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j==3||i==1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }


}
