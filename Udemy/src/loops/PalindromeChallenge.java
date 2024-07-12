/**
 *  * reverse a number
 *  * check a number is palindrome or not
 *  */
package loops;

import java.util.Scanner;
public class PalindromeChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Reverse a number
        /*
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            int rem = num%10;
             rev = rev*10+rem;
             num = num/10;
        }
        System.out.println("Reverse of a number is : "+rev);*/

        //Check a number is palindrome or not
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int num2=num;
        int rev=0;
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num=num/10;
        }
        if(rev==num2){
            System.out.println("Its a palindrome");
        }
        else{
            System.out.println("It's not a palindrome");
        }
    }
}
