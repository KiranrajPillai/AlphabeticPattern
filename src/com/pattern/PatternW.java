package com.pattern;

public class PatternW {
    public static void main(String[] args)
    {
        PatternW w=new PatternW();
        w.wPattern();
    }
    public void wPattern()
    {

        int i,j;
        for(i=1;i<=5;i++)//rows print
        {
            for(j=1;j<=5;j++)//columns print
            {
                if(j ==1 || j==5 ||(j==2 && i==4)||(j==3 && i==3)||(j==4 && i==4))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
