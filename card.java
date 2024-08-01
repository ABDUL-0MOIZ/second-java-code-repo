import java.util.Random;
import java.util.Scanner;

public class card {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter team 1 name:");
        String team1 = input.next();
        System.out.println("Enter team 2 name:");
        String team2 = input.next();
        System.out.println("Team 2 toss (heads/tails):");
        String tos = input.next();

        Random random = new Random();
        int toss = random.nextInt(2);
        if (toss == 0 && tos.equalsIgnoreCase("heads")) {
            System.out.println("Heads comes: " + team2 + " wins the toss");
        } else {
            System.out.println("Tails comes: " + team1 + " wins the toss");
        }

        int score = 0;
        String[] team = {"Babar", "Rizwan", "Fakhar Zaman", "Iftikhar Ahmed", "Naseem Shah", "Shaheen Afridi", "Haris Rauf"};
        String[] team2Players = {"Rohit", "KL Rahul", "Virat", "Hardik", "Jai Shah", "Suryakumar", "Bumrah"};
        int b = 0;
        int k = 0;
        int score2 = 0;
        int b1 = 0;
        int k2 = 0;
        String person = " ";
        String person2 = " ";
        String[] Data = new String[team.length];
        String[] Data2 = new String[team2Players.length];

        for (int j = 1; j <= 20; j++) {
            for (int i = 0; i < 6; i++) {
                Random rand = new Random();
                int out = rand.nextInt(90);
                if (out == 58 || out == 45) {
                    int sc = score;
                    String s = Integer.toString(sc);
                    String ba = Integer.toString(b);
                    float str = b != 0 ? (float) score / b : 0;
                    String strik = Float.toString(str);

                    person = team[k] + "\t" + s + "\t" + ba + "\t" + strik;
                    System.out.println(person);
                    Data[k] = person;

                    k++;
                }

                int temp = score;
                score = rand.nextInt(7);
                score = score + temp;
                b++;
            }
        }

        for (int j = 1; j <= 20; j++) {
            for (int i = 0; i < 6; i++) {
                Random rand = new Random();
                int out = rand.nextInt(90);
                if (out == 58 || out == 45) {
                    int sc = score2;
                    String s = Integer.toString(sc);
                    String ba = Integer.toString(b1);
                    float str = b1 != 0 ? (float) score2 / b1 : 0;
                    String strik = Float.toString(str);

                    person2 = team2Players[k2] + "\t" + s + "\t" + ba + "\t" + strik;
                    System.out.println(person2);
                    Data2[k2] = person2;

                    k2++;
                }

                int temp = score2;
                score2 = rand.nextInt(7);
                score2 = score2 + temp;
                b1++;
            }
        }

        System.out.println("Score of " + team1 + ": " + score);
        for (String datum : Data) {
            System.out.println(datum);
        }

        System.out.println("Score of " + team2 + ": " + score2);
        for (String datum : Data2) {
            System.out.println(datum);
        }
    }
}
