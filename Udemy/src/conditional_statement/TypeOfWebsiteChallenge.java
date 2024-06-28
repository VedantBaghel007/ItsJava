/**
 * display name of a day based on a number
 * Find type of website and the protocol used
 */
package conditional_statement;

import java.util.Scanner;
public class TypeOfWebsiteChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter a Day number : ");
        int day = sc.nextInt();
        if(day == 1){
            System.out.println("Monday");
        }else if(day == 2){
            System.out.println("Tuesday");
        }else if(day == 3){
            System.out.println("Wednesday");
        }else if(day == 4){
            System.out.println("Thursday");
        }else if(day == 5){
            System.out.println("Friday");
        }else if(day == 6){
            System.out.println("Saturday");
        }else if(day == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid Input");
        }*/


        //Find type of website and the protocol used
        //http(protocol) com(type of website)
        System.out.println("Enter Website Link : ");
        String str = sc.nextLine();
        String index2 = str.substring(0,str.indexOf(':'));
        if(index2.equals("http")){
            System.out.println("Hyper txt transfer protocol");
        } else if (index2.equals("ftp")) {
            System.out.println("File transfer Protocol");
        }

        String lastindex2 = str.substring(str.lastIndexOf('.')+1);
        if(lastindex2.equals("com")){
            System.out.println("Commercial");
        }else if(lastindex2.equals("gov")){
            System.out.println("Government website");
        }
       
//https://www.usa.gov/
    }
}
