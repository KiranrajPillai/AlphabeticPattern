package com.pattern;

public class PatternN {
    public static void main(String[] args)
    {
        PatternN n=new PatternN();
        n.nPattern();
    }
    public void nPattern()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j==1 || j==5 ||i-j==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
