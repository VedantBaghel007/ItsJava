package string;
import java.util.*;
public class StringPractice {
    public static void main(String[] args){
        String str1="Java Program";
        String str2=new String("Java");
        System.out.println(str1);
        System.out.println(str2);

        char c[]={'H','e','l','l','o'};
        String str3=new String(c,1,4);
        System.out.println(str3);

        byte b[]={65,66,67,68};
        String str4 = new String(b,2,2);
        System.out.println(str4);

    }
}
