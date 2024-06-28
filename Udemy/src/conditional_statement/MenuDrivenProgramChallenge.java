/**
 * Make a Menu Driven program for arithmetic operators
 */
package conditional_statement;

import java.util.Scanner;
public class MenuDrivenProgramChallenge {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Menu : \n1. ADD\n2. SUB\n3. MUL\n4. DIV");
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();   //to move cursor to next line after numbers input, try and run without this line
        System.out.print("Enter option in words : ");
        String option = sc.nextLine();
        option=option.toUpperCase();
        switch(option){
            case "ADD": System.out.println(num1 + num2);
                break;
            case "SUB": System.out.println(num1 - num2);
                break;
            case "MUL": System.out.println(num1 * num2);
                break;
            case "DIV": System.out.println(num1 / num2);
                break;
            default: System.out.println("Invalid operation performed");
                break;
        }
    }
}
