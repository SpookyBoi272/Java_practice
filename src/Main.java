import java.util.Scanner;

public class Main {
    static int goal () {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans;
        ans = 44+a;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(goal());
    }
}