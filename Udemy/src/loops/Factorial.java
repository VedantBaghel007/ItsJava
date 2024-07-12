/**
 * Display multiplication table
 * Find sum of n numbers
 * Factorial of a number */
package loops;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter a number : ");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+ " = "+num * i);
        }*/

        //Find sum of n numbers
        /*System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=num;i++){
            sum = sum + i;
        }
        System.out.println("Sum of "+num+" natural number : "+sum);
        */

        //Factorial of a number
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+num +" is "+fact);
    }
}
