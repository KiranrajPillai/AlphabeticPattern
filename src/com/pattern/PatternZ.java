package com.pattern;

public class PatternZ {
    public static void main(String[] args)
    {
        PatternZ z=new PatternZ();
        z.zPattern();
    }
    public void zPattern()
    {

        int i,j;
        for(i=1;i<=5;i++)//rows print
        {
            for(j=1;j<=5;j++)//columns print
            {
                if(i==1 || i==5 || i+j==6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
