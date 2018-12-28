package pack2;

import Utility1.Util1;

public class Insertion 

{
    /* Insertion Sort function */

  
    /* Main method */

    public static void main(String[] args) 
    {
        int n,i;

        /* Accept number of elements */

        System.out.println("Enter number of integer elements");

        n = Util1.getInt();

        /* Create integer array on n elements */

        int arr[] = new int[n];

        /* Accept elements */

        System.out.println("\nEnter "+ n +" integer elements");

        for (i = 0; i < n; i++)

            arr[i] = Util1.getInt();

        /* Call method sort */

        Util1.sort(arr);

        /* Print sorted Array */

        System.out.println("\nElements after sorting ");        

        for (i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");            
        }
        System.out.println();                     

    }    

}