package string;
import java.util.*;
public class StringMethods {
    public static void main(String[] args){
        String name = "   Vedant   ";
        int len = name.length();
        System.out.println(len);

        String str1 = name.toLowerCase();
        System.out.println(str1);

        String str2 = name.toUpperCase();
        System.out.println(str2);

        String str3 = name.trim();
        System.out.println(str3);

        String str4 = name.substring(5);
        System.out.println(str4);

        String str5 = name.substring(4,7);
        System.out.println(str5);

        String str6 = name.replace('V','B');
        System.out.println(str6);

        boolean str7 = name.startsWith(" ");
        System.out.println(str7);

        boolean str8 = name.endsWith("t   ");
        System.out.println(str8);

        char c=name.charAt(5);
        System.out.println(c);

        int index = name.indexOf("V");
        System.out.println(index);

        int index2 = name.indexOf("n",6);
        System.out.println(index2);

        int index3 = name.lastIndexOf("nt");
        System.out.println(index3);

        boolean str9 = name.equals("   Vedant   ");
        System.out.println(str9);

        boolean str10 = name.equalsIgnoreCase("  Vedant  ");
        System.out.println(str10);


    }
}
