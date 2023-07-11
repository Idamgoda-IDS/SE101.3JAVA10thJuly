
package com.mycompany.lab_ii_10thjuly;
public class Lab_ii_10thJuly {

    public static void main(String[] args) 
    {
     int arr[]=new int[3];
     
     try
     {
      arr[3]=6;
         System.out.println("Last element: "+arr[3]);
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
         System.out.println("ERROR: Array Index error");
     }
         
    }
}
