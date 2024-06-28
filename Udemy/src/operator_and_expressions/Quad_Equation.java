package operator_and_expressions;

import java.lang.Math;
import java.util.Scanner;
public class Quad_Equation {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a,b,c;
        System.out.println("Enter values of a,b and c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double r1,r2;
        r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Roots of the equation are : "+r1+ " "+r2);
    }
}
