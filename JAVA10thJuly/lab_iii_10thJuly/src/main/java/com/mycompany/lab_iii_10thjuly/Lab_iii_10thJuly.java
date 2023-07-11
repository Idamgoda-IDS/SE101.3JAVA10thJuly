package com.mycompany.lab_iii_10thjuly;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lab_iii_10thJuly {

    public static void main(String[] args) 
    {
     String filepath;
     String line;
     try
     {
     filepath="C:\\Users\\Admin\\Documents\\NetBeansProjects\\tostring\\iop";
     File file=new File(filepath);
     Scanner sc=new Scanner(file);
     
     while(sc.hasNextLine())
     {
     line=sc.nextLine();
         System.out.println(line);
     }
     sc.close();
     }
     catch(FileNotFoundException e)
     {
         System.out.println("ERROR: File not found"+e);
     }
    }
}
