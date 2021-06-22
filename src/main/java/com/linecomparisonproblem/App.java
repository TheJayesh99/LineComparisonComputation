package com.linecomparisonproblem;

class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Line Comparison Computation" );
        int line1x1=0;
        int line1y1=0;
        
        int line1x2=0;
        int line1y2=8;
        
        Double LengthOfLine1  = Math.sqrt(Math.pow((line1x2-line1x1),2) + Math.pow((line1y2-line1y1),2));
        System.out.println("The lenght of line is :"+ LengthOfLine1 );

        int line2x1=0;
        int line2y1=0;
        
        int line2x2=0;
        int line2y2=8;
        
        Double LengthOfLine2  = Math.sqrt(Math.pow((line2x2-line2x1),2) + Math.pow((line2y2-line2y1),2));
        
        System.out.println("The lenght of line is :"+ LengthOfLine2 );
        
        if ( LengthOfLine1.equals(LengthOfLine2)  ) {
        	System.out.println("The Two Line are equal");
        }
        else
        {
        	System.out.println("The Two Lines Are Not Equal");
        }
    }
}
