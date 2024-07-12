/**
 * Display a number in words even with tailing 0*/
package loops;

import java.util.Scanner;
public class DisplayNumberInWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = num;
        int rev=0;
        String r="";
        while(num>0){
            int rem = num%10;
            num = num/10;
            r = r + rem;
        }
        System.out.println(r);
        char c;
        for(int i=r.length()-1;i>=0;i--){
            c=r.charAt(i);
            switch(c){
                case '0': System.out.print("Zero ");
                    break;
                case '1': System.out.print("One ");
                    break;
                case '2': System.out.print("Two ");
                    break;
                case '3': System.out.print("Three ");
                    break;
                case '4': System.out.print("Four ");
                    break;
                case '5': System.out.print("Five ");
                    break;
                case '6': System.out.print("Six ");
                    break;
                case '7': System.out.print("Seven ");
                    break;
                case '8': System.out.print("Eight ");
                    break;
                case '9': System.out.print("Nine ");
                    break;
            }
        }
    }
}
