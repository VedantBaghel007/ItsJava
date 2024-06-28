package string;

public class Printing2 {
    public static void main(String[] args){
        int a=-10;
        System.out.printf("%10d\n", a); //width including the op is 10 decimals
        System.out.printf("%05d\n", a); //flag '0' to fill empty places with 0
        System.out.printf("%(5d\n", a); //PRINT NUMBER IN BRACKET
        System.out.printf("%+d\n", a); //PRINT number with sign

        float b=23.45f;
        String str = "java";
        System.out.printf("%6.2f\n",b);//(width)after decimal 2 digits only and 6 refers to total number to be displayed before decimal the decimal and after decimal
        System.out.printf("%06.2f\n",b);//flag
        System.out.printf("%20s\n",str);//(width) left aligned
        System.out.printf("%-20s\n",str);//(width)right aligned


    }
}
