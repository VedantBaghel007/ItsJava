package operator_and_expressions;//area of front and back of cuboid can be calculated by length * Height
//right and left hand side height * breadth
//area of bottom and top of cuboid can be calculated by length * Height
//volume l*b*h
//perimeter = l*b*l*b(border only)

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args){
        int l,b,h,totalArea,volume;
        System.out.println("Enter length, breadth and height of cuboid :");
        Scanner sc = new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        totalArea=2*(l*b)+2*(b*h)+2*(l*h);
        volume = l*b*h;
        System.out.println("The total surface area is : " +totalArea);
        System.out.println("Volume of cuboid is : "+volume);

    }
}
