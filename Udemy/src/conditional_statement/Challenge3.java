/**
 * Find a number is odd or even
 * find person is young or not
 * find grades for given marks
 */

package conditional_statement;
import java.util.Scanner;
public class Challenge3  {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         /*
         //Even or Odd
         System.out.print("Enter a number : ");
         int num=sc.nextInt();
         if(num%2==0){
             System.out.println(num + " is an even number");
         }
         else{
             System.out.println(num + " is an odd number");
         }*/

         //find person is young or not
         /*System.out.print("Enter the person's age : ");
         int age = sc.nextInt();
         if(age>=14 && age<=55){
            System.out.println("The person is young");
         }
         else {
            System.out.println("Not young");
         }*/

         //find grades for given marks
         System.out.print("Enter marks  of m1 : ");
         int m1 = sc.nextInt();

         System.out.print("Enter marks  of m2 : ");
         int m2 = sc.nextInt();

         System.out.print("Enter marks  of m3 : ");
         int m3 = sc.nextInt();

         int total = m1+m2+m3;
         int avg=total/3;
         
         if(avg>70){
             System.out.print("A");
         } else if (avg<=70 && avg>60) {
             System.out.print("B");
         } else if(avg<=60 && avg>50){
             System.out.print("C");
         } else if(avg<=50 &&avg>40){
             System.out.print("D");
         } else {
             System.out.print("Fail");
         }
     }
}
