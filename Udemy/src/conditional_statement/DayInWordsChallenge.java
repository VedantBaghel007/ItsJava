/**
 * Display name of a day based on number
 * Display name of a month based on number
 * Display type of website
 */
package conditional_statement;

import java.util.Scanner;
public class DayInWordsChallenge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*
        //Display name of a day based on number
        System.out.println("Enter number of day in week : ");
        int Day = sc.nextInt();
        switch (Day){
            case 1: System.out.println("Mon");
                break;
            case 2: System.out.println("Tue");
                break;
            case 3: System.out.println("Wed");
                break;
            case 4: System.out.println("Thur");
                break;
            case 5: System.out.println("Fri");
                break;
            case 6: System.out.println("Sat");
                break;
            case 7: System.out.println("Sun");
                break;
            default: System.out.println("Invalid input");
        }*/

        //Display name of a month based on number
        /*System.out.println("Enter the number of a month : ");
        int month = sc.nextInt();
        switch(month){
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("June");
                break;
            case 7: System.out.println("July");
                break;
            case 8: System.out.println("August");
                break;
            case 9: System.out.println("September");
                break;
            case 10: System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            case 12: System.out.println("December");
                break;
            default: System.out.println("Invalid Input");
        }*/

        //Display type of website
        System.out.println("Enter URL : ");
        String URl=sc.nextLine();
        String domain = URl.substring(URl.lastIndexOf(".")+1);
        switch(domain){
            case "com" : System.out.println("Its a commercial website");
                break;
            case "gov" : System.out.println("Its a government website");
                break;
            case "in" : System.out.println("Its a indian website");
                break;
            case "org" : System.out.println("Its a organization website");
                break;
            default: System.out.println("Invalid input");
        }
    }
}
