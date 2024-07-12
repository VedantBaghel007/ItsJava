/**
 * Display AP series
 * Display GP series
 * Display fibonacci series*/
package loops;
import java.util.Scanner;
public class Fibonaaci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Display AP series
        /*System.out.println("Enter the Starting number of AP series : ");
        int a = sc.nextInt();
        System.out.println("Difference btw th series : ");
        int d = sc.nextInt();
        System.out.println("How many terms you want : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(a+", ");
            a = a + d;
        }*/

        //Display GP series
        /*System.out.println("Enter the Starting number of GP series : ");
        int a = sc.nextInt();
        System.out.println("Ratio of the series : ");
        int r = sc.nextInt();
        System.out.println("How many terms you want : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(a+", ");
            a = a * r;
        }*/

        //Display fibonacci series
        System.out.println("How many terms you want : ");
        int num = sc.nextInt();
        int a=0, b=1, c;
        System.out.print(a+","+b+",");
        for(int i=0;i<num-2;i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}
