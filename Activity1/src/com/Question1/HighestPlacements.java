package com.Question1;
import java.util.Scanner;
public class HighestPlacements {

	public static void main(String[] args) {
		 // create an object of Scanner class
		Scanner sc = new Scanner(System.in);
		 // ask users to enter number
        System.out.println("Enter the no of students placed in CSE:");
        int CSE = sc.nextInt();
        // ask users to enter number
        System.out.println("Enter the no of students placed in IT:");
        int IT = sc.nextInt();
        // ask users to enter number
        System.out.println("Enter the no of students placed in MECH:");
        int MECH = sc.nextInt();
        
        if(CSE==IT && IT==MECH && CSE==MECH)
        {
            System.out.println("None of the department has got the highest placement");
        }
        else if(CSE>=0 && IT>=0 && MECH>=0)
        {
        
            if (MECH>IT && MECH>CSE)
            {
                System.out.println("Highest placement \nMECH");
            }
            else if(CSE>MECH && CSE>IT)
            {
                System.out.println("Highest placement \nCSE");
            }
            else if(IT>MECH && IT>CSE)
            {
                System.out.println("Highest placement \nIT");
            }
            else if(IT==MECH)
            {
                System.out.println("Highest Placement \nIT \nMECH");
            }
            else if(CSE==IT)
            {
                System.out.println("Highest Placement \nCSE \nIT");
            }
            else if(CSE==MECH)
            {
                System.out.println("Highest Placement \nCSE \nMECH");
            }
        }  
        else
        {
            System.out.println("Input is invalid");
            sc.close();
        }
    }


	}


