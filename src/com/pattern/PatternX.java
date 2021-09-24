package com.pattern;

public class PatternX {
    public static void main(String[] args)
    {
        PatternX x=new PatternX();
        x.xPattern();
    }
    public void xPattern()
    {

        int i,j;
        for(i=1;i<=5;i++)//rows print
        {
            for(j=1;j<=5;j++)//columns print
            {
                if(i==1&&j==1||i==2&&j==2||i==3&&j==3||i==4&&j==4||i==5&&j==5
                        ||j==5&&i==1||j==4&&i==2||j==3&&i==3||j==2&&i==4||j==1&&i==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
