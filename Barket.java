import java.util.*;
import java.util.regex.Pattern;

public class Barket {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter opening end closing braket");
        String as=in.nextLine();


    
       if(Pattern.compile("\\(\\)|\\(\\)\\{\\}\\[\\]|\\[\\{\\(\\)}\\]").matcher(as).matches())
           System.out.println("valid");
       else
           System.out.println("Invalid");


    }
}