import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter string:");
        String name=inp.nextLine();
       char[] a = name.toCharArray();
       StringBuilder n=new StringBuilder();
       boolean []check=new boolean[256];
       for(char c:a){
 if(!check[c]){
    check[c]=true;
     n.append(c);
 }

       }
        System.out.println(n);
    }
}