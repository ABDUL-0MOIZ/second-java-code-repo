
import  java.util.*;

public class Main {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("Enter String value");
        String value=input.next();
        String revers=new StringBuilder(value).reverse().toString();
        if (value.equalsIgnoreCase(revers))
        {
            System.out.println("it is  palindrome");
        }
        else{
            System.out.println("It is not  palindrome");
        }
        }
    }
