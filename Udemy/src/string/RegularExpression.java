package string;

public class RegularExpression {
    public static void main(String[] args){
        String str1="$";
        System.out.println(str1.matches("\\W"));
        String str2="wefg fhwer 56465465 ADGSAU *^%^%^%%";
        System.out.println(str2.matches("[a-z \\s \\d A-Z]* "));
    }
}
