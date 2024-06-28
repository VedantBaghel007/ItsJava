/**
 * Remove special characters from a string
 * Remove extra spaces from string
 * find number of words in a string
 * */
package string;

public class RegexChallenge2 {
    public static void main(String[] args){
        String a="a!b@c#1$2%3";
        System.out.println(a.replaceAll("[^a-zA-z0-9]",""));

        String str = "    abcd  fgh    ijk      adajksd   ";
//        System.out.println(str.trim());   trim is used for removing leading and tailing spaces
        System.out.println(str.replaceAll("\\s+"," ").trim());

        String str2="    Alpha    male    ego   ";
        str2 = str2.replaceAll("\\s+", " ");
        String word[]=str2.split("\\s");
        System.out.println(word.length);
    }

}
