/**
 * Display digits
 * Count digits of a number
 * finding a number is armstrong or not
*/
package loops;

import java.util.Scanner;
public class ArmstrongChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        /*
        System.out.println("Enter a number : ");
        int  num = sc.nextInt();
        while(num>0){
                int remainder = num % 10;
                num = num / 10;
                System.out.println(remainder);
        }*/

        //Count digits of a number
        /*
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            num = num/10;
            count++;
            //System.out.println(count);
        }
        System.out.println("There are "+count+ " digits");*/

        //finding a number is armstrong or not
        /*System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int num1 = num;
        int sum=0;
        while (num>0){
            int remainder = num % 10;
            sum = sum + remainder*remainder*remainder;
            num = num/10;
        }
        System.out.println(sum);
        if(sum == num1){
            System.out.println(sum + " is an armstrong number");
        }
        else{
            System.out.println(sum + " is not a armstrong number");
        }
        */


    }
}
