package assignment9;

public class Array_p1 {
	
    
     public static void main ( String[] args )
     {
        int[] arrA   = { 10, 20, 30, 40, 50}; 
        int[] arrB   = {5, 6, 7, 8, 9};
        int[] sum    = {0, 0, 0, 0, 0};

       for(int i = 0; i < arrA.length ; i++)
       {
         for(int j = 0; i < arrB.length ; i++)
         {
            sum[i] = arrA[i] + arrB[i];
         }
       }

       System.out.println("sum: " + sum[0]+"," + sum[1] + ","  + sum[2] + ","  + sum[3] + ","+sum[4]);
   } 
}
