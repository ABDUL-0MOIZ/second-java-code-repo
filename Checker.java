import  java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Checker{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter student id :");
        String id=scan.next();
        Pattern check = Pattern.compile("[f,F]+\\d{10}@gmail.com");
        Matcher match=check.matcher(id);
        boolean  c=match.matches();
        Pattern check2=Pattern.compile("[a-z,A-Z]+@gmail.com");
        Matcher match2=check2.matcher(id);
        boolean ch=match2.matches();
        Pattern check3=Pattern.compile("[a-z,A-Z]+\\.[a-z,A-Z]+@gmail.com");
        Matcher match3=check3.matcher(id);
        boolean ch2=match3.matches();

        if(c||ch||ch2){
            System.out.println("Your ID is valid");
        }
        else{
            System.out.println("your ID is invalid");
        }
    }
}