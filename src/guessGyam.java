import java.util.Scanner;
import java.util.Random;

class Game{
    private int inNum; private final int ogNum; private int count;
    public Game(){
        Random rd = new Random();
        this.ogNum = rd.nextInt(1,100);
        System.out.println(ogNum);
    }

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess The Number");
        this.inNum = sc.nextInt();
    }

    public boolean isCorrectNumber(){ return inNum == ogNum; }

    public String diff(){
        if (ogNum>inNum){ return "Greater"; }
        else { return "Smaller";}
    }

    public void scoreCount(){this.count = count+1;}

    public int score(){ return count; }

}
public class guessGyam {
    public static void main(String[] args) {
        Game init = new Game();
        while (true) {
            init.takeUserInput();
            init.scoreCount();
            if (init.isCorrectNumber()) {
                System.out.println("You Guessed it in " + init.score()+ " Guesses.");
                break;
            }
            System.out.println(init.diff());
        }
}
}
