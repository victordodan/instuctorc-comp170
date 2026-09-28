

/*--------------------------------------------
Program 3: MPLS care attendant Daily Log
The MPLS care attendant Daily Dog Log is a program that allows the care attendant manager to  enter daily logs for each Dog in MPLS Dog boarding School.  
Listed below is a chart with the name of each care attendant and the name of each dog in their care.  The program allows the care attendant to continuously 
enter their id# and enter the total amount of time spent with the dog and a general note about the dog's day. Once the care attendant id # is entered, the care attendant
will be prompted to select the dogs who fall under their care.  For each dog entered, The program provides a summary of all entered information for a dog. The program should enforce that only care attendants with the id numbers listed in the chart below can be entered.    

Once the manager is done entering all logs, the program will display a count of total dogs entered, a count of the total number of dogs entered from each 
color group, along with the total time the care attendant spent with the various dogs. The program also provides you with a summary of the dog with the most care minutes.

**ARRAYS CANNOT BE USED FOR THIS PROGRAM**

| ID # | Care Attendant Name | Assigned Color Group|
|------|---------------------|---------------------|
| 11   | Noah Charles        |  BLUE, RED          |
| 22   | Silas Alexander     |  GREEN, YELLOW      |
| 33   | Chris Isaac         |  BLUE, YELLOW       |                               
| 44   | Mya Lynn            |  RED, GREEN         |


**** List of dogs currently in care
| ID # | Dog Name | Dogs in Care                                         |
|-------|------------|----------|
| 348   | Badger    | RED      |
| 301   | Hoosier   | RED      |
| 325   | Spartan   | GREEN    |
| 388   | Hawk      | YELLOW   |
| 333   | Gopher    | YELLOW   |
| 388   | Husker    | RED      |
| 391   | Bucky     | RED      |
| 362   | Nittany   | BLUE     |
| 311   | Wolvey    | BLUE     |
	
    [REPLACE MY INFORMATION WITH YOURS]
    Course: COMP 170, Spring 1 2025
    System: Visual Studio Code, Windows 10
    Author: C. F
*/

import java.util.Scanner;
public class DailyLog {
    public static void main(String[] args) throws Exception {
        
        //DECLARATIONS *Make sure to also consider all variables that will keep tally and initialize to zero
        Scanner input = new Scanner(System.in);

        //WELCOME MESSAGE
        System.out.println("Welcome to the MPLS care attendant daily log program.  This program will allow you to enter a care attendant id and produce a log for the dogs under the attendant's care.");

        //Create Space
        System.out.println("");

        //OUTPUT OF CARE ATTENDANT INFO.
        System.out.println("Enter 11 for Noah Charles");
        System.out.println("Enter 22 for Silas Alexander");
        System.out.println("Enter 33 for Chris Isaac");
        System.out.println("Enter 44 for Mya Lynn");

        //PRIMER
        final int CharlesId = 11;
        final int AlexanderId = 22;
        final int IsaacId = 33;
        final int LynnId = 44;
    

        System.out.println("To get started, please enter the care attendant ID from the list above");
        System.out.print("Enter ID #: ");
        int attendantId = input.nextInt();

        //Looping structure that allow for continous iteration and checks against sentinel value
        while(attendantId != 11 && attendantId != 22 && attendantId != 33 && attendantId != 44) {
            System.out.println("Invalid ID number. Please enter a valid care attendant ID from the list above.");
            System.out.print("Enter ID #: ");
            attendantId = input.nextInt();
        }


        //Determine which dogs to display based on attendant id number 
        System.out.println("Dogs available for this attendant:");

        boolean showBlue;
        boolean showRed;
        boolean showGreen;
        boolean showYellow;

        //showBlue
        if(attendantId == CharlesId || attendantId == IsaacId){
            showBlue = true;
        }
        else showBlue = false;

        //showRed
        if(attendantId == CharlesId || attendantId == LynnId){
            showRed = true;
        }
        else showRed = false;

        //showGreen
        if(attendantId == AlexanderId || attendantId == LynnId){
            showGreen = true;
        }
        else showGreen = false;

        //showYellow
        if(attendantId == AlexanderId || attendantId == IsaacId){
            showYellow = true;
        }
        else showYellow = false;
        
        //Determine which dogs to display based on attendant id number 
        if (showRed == true) {
            System.out.println("348 - Badger (RED)");
            System.out.println("301 - Hoosier (RED)");
            System.out.println("388 - Husker (RED)");
            System.out.println("391 - Bucky (RED)");
        }
        if (showGreen == true) {
            System.out.println("325 - Spartan (GREEN)");
        }
        if (showYellow == true) {
            System.out.println("388 - Hawk (YELLOW)");
            System.out.println("333 - Gopher (YELLOW)");
        }
        if (showBlue == true) {
            System.out.println("362 - Nittany (BLUE)");
            System.out.println("311 - Wolvey (BLUE)");
        }
                //Enforce that dog ID is an applicable number according to the chart


                //Gather rest of information such as total numbers of min. spent with dog and dog note


                //Determine color count and total time spent by color


                //Increment count for total entries



                //OUTPUT OF CARE ATTENDANT INFO.


                //Reprompt user to enter another user and enforce that only care attendant ID #'s are entered' 


        
                //Enfore that only 11, 22, 33 and 44 can be entered, including sentinel value




        //Output total time and count by color 



    }
}
