import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        int[] numb = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++){
        try {
            int den = sc.nextInt();
            numb[den] = 10;
            break;
        }
        catch (ArrayIndexOutOfBoundsException e){
            if (i>=4){
                System.out.println("error");
            }else {
                System.out.println(e);
            }
        }
    }
}}
