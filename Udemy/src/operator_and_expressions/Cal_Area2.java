package operator_and_expressions;

import java.util.Scanner;
import java.lang.Math;
public class Cal_Area2 {
    public static void main(String[] args){
        int a,b,c;
        float s;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sides of triangle : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2f;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is :" + area);
        sc.close();

    }    
}
