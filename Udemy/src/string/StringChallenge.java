package string;

public class StringChallenge {
    public static void main(String[] args){
        String str="programmer@gmail.com";
        int index = str.indexOf("@");
        String username = str.substring(0,index);
        System.out.println("Username : "+username);

        String domain_name = str.substring(index+1, str.length());
        System.out.println("Domain name : "+domain_name);

        int index2 = str.indexOf(".");
        String email = str.substring(index+1,index2);
        System.out.println(email.equals("gmail"));

    }
}
