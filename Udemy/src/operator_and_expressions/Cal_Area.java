package operator_and_expressions;

import java.util.Scanner;
class Cal_Area{
    public static void main(String[] args){
        float b,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base of tirangle : ");
        b = sc.nextFloat();
        System.out.println("Enter Height of triangle : ");
        h = sc.nextFloat();
        float area;
        area = 1f/2f*b*h;
        System.out.println("Area of triangle is : " + area);
        sc.close();
    }
}