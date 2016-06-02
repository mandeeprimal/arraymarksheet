/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.array;
import java.util.Scanner;
/**
 *
 * @author itcomputer
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("Student Records - 2016\n");  
           System.out.print("Name: ");  
           String name = in.nextLine();  
           System.out.print("Roll Number: ");  
           String roll  = in.nextLine();  
           System.out.println("Marks in 5 subjects: ");  
           int a[]=new int[5];  
           int tot=0;  
          
           boolean found=false;  
            
           for(int i=0;i<5;i++)  
           {  
           System.out.print("Subject["+(i+1)+"]: ");  
                a[i] = in.nextInt();   
                {  
                     found=true;  
                }  
                tot+=a[i];  
                
           }  
            float percentage = tot/5;
             if (a[0] >= 32 && a[1] >= 32 && a[2] >= 32 && a[3] >= 32 && a[4] >= 32) {
             
                  System.out.println("Total: "+tot);  
           System.out.println("Percentage: "+percentage+"%");  
            
                {                    
                if (percentage >= 75) {
                System.out.println("Division: Distinction");
            }  else if (percentage >= 60 && percentage < 75) {
                System.out.println("Division: First Division");
            }  else if (percentage >= 45 && percentage < 60) {
                System.out.println("Division: Second Division");
            }  else if (percentage >=32 && percentage < 45){
                System.out.println("Division: Third Division");          
            }  else 
                System.out.println("\nFail");
                }
            }
                }
             }
    


         
           
           
        
        
       
    
    

