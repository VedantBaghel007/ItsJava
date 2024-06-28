/**
 * Find radix of a number given in  string
 * FIND A GIVEN YEAR is a leap year
 */
package conditional_statement;
import java.util.Scanner;

public class Radix_Challenge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*Find radix of a number given in  string
        System.out.print("Enter a number : ");
        String num=sc.nextLine();
        if(num.matches("[01]+")){
            System.out.print(num+" has radix 2");
        }
        else if(num.matches("[0-7]+")){
            System.out.print(num +" has radix 8");
        }
        else if(num.matches("[0-9]+")){
            System.out.println(num+" has radix 10");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println(num+" has radix 16");
        }
        else{
            System.out.println(num+ " is invalid");
        }*/

        //FIND A GIVEN YEAR is a leap year
        int year = sc.nextInt();
        if(year%4==0 && year%400==0 && year%100!=0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
