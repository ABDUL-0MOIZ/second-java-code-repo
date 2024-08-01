import java.util.*;
public class Roman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter nuber and this code convert into roman:");
        int a = scan.nextInt();


        String I = "I";
        String V = "V";
        String X = "X";
        String L= "L";
        String D = "D";
        String M = "M";
        String C = "C";
        String value="";

        if(a>=1000){
        int check= a /1000;

            for (int j = 1; j <= check; j++) {
                String temp="M";

                value = M ;
                M=M.concat(temp);
            }
            System.out.print(value);
            a = a % 1000;
        }
        if(a>=500 ) {
            int check = a / 500;



            for (int j = 1; j <=check; j++) {
                String temp="D";
                value = D;
                D = D.concat(temp);

            }
            System.out.print(value);
            a = a % 500;
            }
            if(a>=100){
                int check = a /100;

                for (int j = 1; j <=check; j++) {
                    String temp="C";
                    value = C;
                    C = C.concat(temp);

                }
                System.out.print(value);
                a=a%100;

            }
        if(a>=50){
            int check = a /50;

            for (int j = 1; j <= check; j++) {
              String temp="L";
                value = L;
                L = L.concat(temp);

            }
            System.out.print(value);
            a=a%50;

        }
        if(a>=10){
            int check = a /10;

            for (int j = 1; j <= check; j++) {
                String temp="X";
                value = X;
                X= X.concat(temp);

            }
            System.out.print(value);
            a=a%10;

        }
        if(a>=5){
            int check = a /5;

            for (int j = 1; j <= check; j++) {
                String temp="V";
                value = V;
                V= V.concat(temp);

            }
            System.out.print(value);
        a=a%5;
        }


            for (int j = 1; j <= a; j++) {
                String temp="I";
                value = I;
                I= I.concat(temp);

            }
            System.out.print(value);
        }


    }

