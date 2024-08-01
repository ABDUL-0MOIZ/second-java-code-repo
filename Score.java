import java.util.Random;
import  java.util.Scanner;
public class Score{

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("enter team name");
String team1=input.next();
        System.out.println("enter team 2");
String team2= input.next();
        System.out.println(" team 2 toss ");
        String tos= input.next();


        Random random = new Random();
//     random.setSeed(30);
       int toss= random.nextInt(2);
       if(toss==0&& tos.equalsIgnoreCase("heads")){
           System.out.println("heads come :"+team2+ " Wins the toss ");
       }
       else{
           System.out.println("tails comes:"+team1+" Wins the toss");
       }
        int score=0;
 String[] team={"baber","rizwan","fakhar zeman","iftkhar ahmed","nassem shah","shaheen afridi","haris roaf"};
        String[] tem2={"rohit ","kl rahul","virath","hardik","jai shah","soryakumar ","buhmra"};
        int b=0;
        int k=0;
int score2=0;
int b1=0;
int k2=0;
        String person;
        String person2;
        String []Data=new String[team.length];
        int temps1 =0;
        String []Data2=new String[team.length];
for (int j=1; j<=20; j++){
        for (int i = 1; i <= 6; i++) {
            Random rand=new Random();
            int out =rand.nextInt(90);
            if(out ==58 || out==45||out==78){


                  temps1=score;

                String s=Integer.toString(temps1);
                String ba=Integer.toString(b);
             float str= (float) score /b;

              String strik=Float.toString(str);

                     person = team[k]+"\t"+ s +"\t"+ba+"\t"+strik;
             Data[k]=person;

             temps1=score-temps1;
                k++;

            }

            int temp= score;
             score=rand.nextInt(7);



            score=score+temp;

            b++;



        }
    }
        int temps=0;
        for (int j=1; j<20; j++){
            for (int i = 0; i < 6; i++) {
                Random rand=new Random();
                int out =rand.nextInt(90);
                if(out ==58 || out==45||out==78){

                                      temps=score2-temps;
                    String s=Integer.toString(temps);
                    String ba=Integer.toString(b1);
                    float str= (float) score2 /b1;

                    String strik=Float.toString(str);

                    person2 = tem2[k2]+"\t"+ s +"\t"+ba+"\t"+strik;

                    Data2[k2]=person2;

                    k2++;


                }

                int temp= score2;
                score2=rand.nextInt(7);


                score2=score2+temp;

                b1++;



            }
        }
        System.out.println("score:"+score);
        for (String datum : Data) {
            System.out.println(datum);

        }

        for (String datum : Data2) {
            System.out.println(datum);

        }
        System.out.println("score:"+score2);


    }
}