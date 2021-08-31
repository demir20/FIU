package app;

import static java.lang.Math.*;

public class Controller {

    public static void main(String[] args) {

        yourInfoHeader();
        secondsCalculator();
        investmentCalculator();
        circle();
        triangleRectangle();
        formula();

    }//end main


    public static void yourInfoHeader() {

        System.out.println("================================");
        System.out.println("PROGRAMMER: Demir Sanal");
        System.out.println("PANTHERID: 6270792");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210");
        System.out.println("SECTION: \t U02");
        System.out.println("SEMESTER: \t Fall 2021");
        System.out.println("CLASSTIME: \t Tuesday/Thursday 5:00-7:40");
        System.out.println();
        System.out.println("ASSIGNGMENT: Lab 2");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policie, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person");
        System.out.println("================================");
        System.out.println();
    }//end InfoHeader

    public static void printStepHeader(int stepNumber){
        System.out.println();
        System.out.println();
        System.out.println("================================");
        System.out.println("Step: " + stepNumber);
        System.out.println("================================");
    }//end printStepHeader

    public static void secondsCalculator(){
        int minutes = 35;
        int hours = 20;

        int secondsInMinute = 60;
        int secondsInHour = secondsInMinute*60;
        int totalSeconds = (hours*secondsInHour)+(minutes*secondsInMinute);

        printStepHeader(3);
        System.out.print("Number of seconds in 20 hours and 35 minutes is: " + totalSeconds);
    }

    public static void investmentCalculator() {
        double initialInvestment = 10000.00;
        double year1Return = 1.04;
        double year2Return = 1.11;
        double year3Return = .94;

        double year1InvestmentValue = initialInvestment*year1Return;
        double year2InvestmentValue = year1InvestmentValue*year2Return;
        double year3InvestmentValue = year2InvestmentValue*year3Return;

        printStepHeader(4);
        System.out.printf("%-10s %.2f \n","Initial Investment Value: ", initialInvestment);
        System.out.printf("%-10s %19.2f \n", "Year 1 Return: ", year1InvestmentValue);
        System.out.printf("%-10s %19.2f \n", "Year 2 Return: ", year2InvestmentValue);
        System.out.printf("%-10s %19.2f \n", "Year 3 Return: ", year3InvestmentValue);
    }

    public static void circle(){
        double circleDiameter = 23.203;
        double circleRadius = circleDiameter/2;
        double circleCircumference = 2*(PI)*(circleRadius);
        double circleArea = (PI)*Math.pow(circleRadius,2);

        printStepHeader(5);
        System.out.printf("%-10s %11.3f \n","Circle Diameter: ", circleDiameter);
        System.out.printf("%-10s %13.3f \n","Circle Radius: ", circleRadius);
        System.out.printf("%-10s %.3f \n","Circle Circumference: ", circleCircumference);
        System.out.printf("%-10s %16.3f \n","Circle Area: ", circleArea);
    }

    public static void triangleRectangle(){
        double rectangleHeight = 5.5;
        double rectangleWidth = 17.4;

        double triangleHeight = 25.3;
        double triangleBase = 26.7;

        double rectanglePerimeter = (2*rectangleHeight) + (2*rectangleWidth);
        double rectangleArea = rectangleHeight*rectangleWidth;

        double triangleHypotenuse = Math.sqrt(Math.pow(triangleHeight,2)+Math.pow(triangleBase,2));

        double trianglePerimeter = triangleBase+triangleHypotenuse+triangleHeight;
        double triangleArea = 0.5*(triangleBase*triangleHeight);

        double totalPerimeter = trianglePerimeter+rectanglePerimeter;
        double totalArea = triangleArea+rectangleArea;

        printStepHeader(6);
        System.out.printf("%-10s %10.4f \n","Rectangle Height: ", rectangleHeight);
        System.out.printf("%-10s %11.4f \n","Rectangle Width: ", rectangleWidth);
        System.out.printf("%-10s %.4f \n","Rectangle Perimeter: ", rectanglePerimeter);
        System.out.printf("%-10s %12.4f \n","Rectangle Area: ", rectangleArea);
        System.out.printf("%-10s %11.4f \n","Triangle Height: ", triangleHeight);
        System.out.printf("%-10s %13.4f \n","Triangle Base: ", triangleBase);
        System.out.printf("%-10s %.4f \n","Triangle Hypotenuse: ", triangleHypotenuse);
        System.out.printf("%-10s %8.4f \n","Triangle Perimeter: ", trianglePerimeter);
        System.out.printf("%-10s %13.4f \n","Triangle Area: ", triangleArea);
    }

    public static void formula(){
        double dampingForce = 0.546;
        double x = 23.43;
        double y = 0.172;
        double z = 2.453;

        double temp1 = Math.sin(dampingForce);
        double temp2 = Math.pow(E,2*x);
        double temp3 = sqrt((4*x*Math.pow(y,2.34)*z));
        double temp4 = Math.pow(dampingForce,3);
        double temp5 = 24*x*y*z;
        double temp6 = Math.pow(3,4*x*z);
        double result = temp1*((temp2+temp3)/temp4)+temp5+temp6;

        printStepHeader(7);
        System.out.printf("%-8s %.6f \n","Damping Force: ", dampingForce);
        System.out.printf("%-8s %16.6f \n","x: ", x);
        System.out.printf("%-8s %15.6f \n","y: ", y);
        System.out.printf("%-8s %15.6f \n","z: ", z);
        System.out.printf("%-8s %15.6f \n","temp1: ", temp1);
        System.out.printf("%-8s %31.6f \n","temp2: \t\t", temp2);
        System.out.printf("%-8s %15.6f \n","temp3: ", temp3);
        System.out.printf("%-8s %15.6f \n","temp4: ", temp4);
        System.out.printf("%-8s %17.6f \n","temp5: ", temp5);
        System.out.printf("%-8s %120.6f \n","temp6: \t\t", temp6);
        System.out.printf("%-8s %120.6f \n","Result: \t", result);
    }
}//end Controller
