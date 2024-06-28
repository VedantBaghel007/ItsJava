package string;
import java.util.*;
public class Printing1 {
    public static void main(String[] args){
        int x=10;
        float y=12.56f;
        char z='A';
        String str= "java program";
        System.out.printf("Hello %d %f %c World\n",x,y,z);
        System.out.printf("Hello %s\n", str);
        System.out.printf("%3$s %2$f %1$d",x,y,str);
    }
}
