import java.util.*;
public class javastaments{
    public static void main(String[] args)
    {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Input a credit score to find credit status");
        int credtscore = myscan.nextInt();
        // if statement example 
        if (credtscore>760) {
            System.out.println("Excellent!!!");}
        else if ( credtscore >= 700 && credtscore <760) {
            System.out.println("Very Good!!"); }
        else if (credtscore >= 600  && credtscore <= 699  ) {
            System.out.println("Good Credit Score"); }
        else { System.out.println("Poor Credit Score");}
        // for loop example 
        for ( int i=0; i<=10 ; ++i) { System.out.println("Counter" + i);}
        
        // while looping statement 
        /* find greatest of n numbers */
        System.out.println("How many numbers you want to compare");
        int numberstoCompare = myscan.nextInt();
        
        int[] arraynum = new int[numberstoCompare];
          for (int j=0; j<numberstoCompare ; ++j) { System.out.println("Enter the "+ j+ "th Number");
                                      int numtocompare = myscan.nextInt();
                                      arraynum[j]=numtocompare;
                                     
                                    }
        int k =0;
        int greatest = arraynum[k] ;
        k++;
        do {
            System.out.println("Index value " + k);
            if ( arraynum[k] > greatest ){
                greatest =  arraynum[k];     
            }
           
            k++;
            
        } while (k<numberstoCompare);
        System.out.println("The greatest of the entered number is  " + greatest + " Ta da " );
        
        // NOw you learnt the do while .. lets learn while loop 
        //find if the given number is palindrome or not  
        System.out.println("Enter the number to check if it is palindrome");
        int nPalin = myscan.nextInt();
        String sPalin = Integer.toString(nPalin);
        int lenthofPalin =sPalin.length();
        System.out.println("length of the enter number is " + lenthofPalin );
        int nLengthRev =0;
        int j = lenthofPalin;    
        if (lenthofPalin%2 == 1 ) {  nLengthRev = lenthofPalin/2;     }  else { nLengthRev = lenthofPalin/2 ;   } 
        
        String sRevString = "";
        k=1;
        while ( k <= nLengthRev )
          {
            sRevString = sRevString + sPalin.substring(j-1,j);
            System.out.println("Revers string " + sRevString );
            j--;
            k++;    
            }
         String sFirstHalf = sPalin.substring(0,lenthofPalin/2);
         System.out.println(" First half of string " + sFirstHalf );
         if (sFirstHalf.equals(sRevString) ) { System.out.println("This a palindrome " + sPalin );}
        
        //Next learn about switch statement 
        
        
    }
}