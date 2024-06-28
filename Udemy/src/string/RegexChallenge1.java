/**
 * find id a number is binary or not
 * find if a number is hexa-decimal or not
 * find is the data in date format
 */
package string;

public class RegexChallenge1 {
    public static void main(String[] args){
        int b =10110001;
        String strNum = String.valueOf(b);
        System.out.println(strNum.matches("[01]*"));

        String hex="3F98";
        System.out.println(hex.matches("[0-9A-F]*"));

        String date="10/01/2003";
        System.out.println(date.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"));
    }
}
