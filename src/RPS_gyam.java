import java.util.Random;
import java.util.Scanner;
public class RPS_gyam {
    public static void main(String[] args) {
        System.out.print("Enter rock(0) paper(1) or Scissors(2)");
        Scanner sc = new Scanner(System.in);
        byte user = sc.nextByte();
        Random rd = new Random();
        int pc = rd.nextInt(3);
        switch (pc){
            case 0 -> {
                System.out.println("Rock");
                if (user == 0){
                    System.out.println("Draw");
                } else if (user == 1) {
                    System.out.println("You Win");
                } else if (user == 2) {
                    System.out.println("You Loose");
                }
            }
            case 1 -> {
                System.out.println("Paper");
                if (user == 0){
                    System.out.println("You Loose");
                } else if (user == 1) {
                    System.out.println("Draw");
                } else if (user == 2) {
                    System.out.println("You Win");
                }
            }
            case 2 ->{
                System.out.println("Scissors");
                if (user == 0){
                    System.out.println("You Win");
                } else if (user == 1) {
                    System.out.println("You Loose");
                } else if (user == 2) {
                    System.out.println("Draw");
                }
            }
        }
    }
}
