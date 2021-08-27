//=============================================================================
// PROGRAMMER: Demir Sanal
// PANTHER ID: 6270792
//
// CLASS: COP2210
// SECTION: Your class section: U02
// SEMESTER: The current semester: Fall 2021
// CLASSTIME: Your COP2210 course meeting time : T/TH 5:00-7:40 PM
//
// Project: Put what this project is: Lab 1
// DUE: Aug 29th
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
//                                          own and that none of it is the work of any other person.
//=============================================================================

package app;

public class Controller {

    public static void main(String[] args) {

        System.out.println("COP 2210");

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("First Program Header 1");
        System.out.println("---------------------------------");
        System.out.print("School: \t\t\t\t FIU \n");
        System.out.print("Major: \t\t\t\t\t Econ \n");
        System.out.print("Number of Students: \t 1000 \n");

        //--------------------------------------------------------

        String school="FIU";
        String major ="Econ";
        int numberOfStudents = 1000;

        System.out.println("\n");
        System.out.println("---------------------------------");
        System.out.print("First Program Header 2 \n");
        System.out.println("---------------------------------");
        System.out.print("School: \t\t\t\t" + school + "\n");
        System.out.print("Major: \t\t\t\t\t" + major + "\n");
        System.out.print("Number of Students: \t" + numberOfStudents + "\n");

        System.out.println();
        System.out.println("Information --> " + school + ":" + major + ":" + numberOfStudents);

        //--------------------------------------------------------

        System.out.println("\n");
        System.out.println("---------------------------------");
        System.out.print("First Program Header 3 \n");
        System.out.println("---------------------------------");
        System.out.printf("School: \t\t\t\t %-10s \n", school);
        System.out.printf("Major: \t\t\t\t\t %-6s \n", major);
        System.out.printf("Number of Students: \t %4d \n", numberOfStudents);

        System.out.println();
        System.out.println("Information --> " + school + ":" + major + ":" + numberOfStudents);

        System.out.println("\n\n");
    }

} //End Controller