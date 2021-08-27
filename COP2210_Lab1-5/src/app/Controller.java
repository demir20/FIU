//=============================================================================
// PROGRAMMER: Demir Sanal
// PANTHER ID: 6270792
//
// CLASS: COP2210
// SECTION: Your class section: U02
// SEMESTER: The current semester: Fall 2021
// CLASSTIME: Your COP2210 course meeting time : T/TH 5:00-7:40 PM
//
// Project: Put what this project is: Lab 1.5
// DUE: Aug 29th
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
//                                          own and that none of it is the work of any other person.
//=============================================================================

package app;

//----------------------------------------------------------------------------
//imports
//----------------------------------------------------------------------------

import java.util.Scanner;

public class Controller {
    //-------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = myScanner.nextLine();

        System.out.print("Enter Address: ");
        String address = myScanner.nextLine();

        System.out.print("Enter age: ");
        int age = myScanner.nextInt();

        System.out.println("=====================");
        System.out.println("Inputs");
        System.out.println("=====================");

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);

        printInfo(name, address, age);
    }//end main

    //--------------------------------------------------------------
    public static void printInfo(String name, String address, int age){
        System.out.println();
        System.out.println("================================");
        System.out.println("Inputs for " + name);
        System.out.println("================================");
        System.out.printf("Name:\t\t %-20s \n", name);
        System.out.printf("Address:\t %-30s \n", address);
        System.out.printf("Age:\t\t %-5d \n", age);
    }//end printInfo
    //----------------------------------------------------------------

}//end Controller
