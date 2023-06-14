package MaxWeightDiff;

import java.util.*;

class ChefAndSon 
{
  
 public static int GetDifference(int ArrItems[], int n,int k)
 {
    
     Arrays.sort(ArrItems); // sorting the array 
   
     // initializing the instance variables 
     
     int sum = 0;   
     int sum1 = 0;
     int sum2 = 0;
   
     for (int i = 0; i < n; i++) // applying for loop to iterate sum
     {
         sum = sum + ArrItems[i];
     }
   
     for (int i = 0; i < k; i++) // applying for loop to iterate sum1
     {
         sum1 = sum1 + ArrItems[i];
     }
   
     for (int i = k; i < n; i++) // applying for loop to iterate sum2
     {
         sum2 = sum2 + ArrItems[i];
     }
   
     return Math.max(Math.abs(sum1 - (sum - sum1)),Math.abs(sum2 - (sum - sum2)));
 }
  
 public static void main(String[] args)  // main method creation
 {
     int k = 2;
     int ArrItems[] = { 8, 4, 5, 2, 10 }; // Array elements are provided
   
     int n = ArrItems.length; // to get length of the array

     System.out.print("The Maximum possible difference is :"+GetDifference(ArrItems, n, k));  // printing the calculated output 
          
 }
}

