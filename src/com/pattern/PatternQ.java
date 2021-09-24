package com.pattern;

public class PatternQ {
    public static void main(String[] args)
    {
        PatternQ q=new PatternQ();
        q.qPattern();
    }
    public void qPattern()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if((i==1&&j>=2&&j<=4)||i==2&&j==1||i==3&&j==1||i==4&&j==1
                        ||(i==5&&j>=2&&j<=5)||i==2&&j==5||i==3&&j==5||i==4&&j>=4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
