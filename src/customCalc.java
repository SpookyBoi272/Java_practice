import java.util.Scanner;

class maxMultiplierException extends Exception{
    @Override
    public String toString(){
        return "Max Multiplier Reached";
    }
}

class invalidInputException extends Exception{
    @Override
    public String toString(){
        return "Invalid Input Exception you cannot Enter 8 or 9 ";
    }
}

class maxInputException extends Exception{
    @Override
    public String toString(){
        return "Max Multiplier Reached (>7000)";
    }
}

class cantDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "Cannot Divide by Zero Exception";
    }
}

class calcualtor{
    float add(float n1, float n2){
        return n1+n2;
    }

    float sub(float n1, float n2){
        return n1-n2;
    }

    float product(float n1, float n2) throws maxMultiplierException{
        if (n1>7000 || n2>7000){
            throw new maxMultiplierException();
        }
        return n1*n2;
    }

    float div(float n1, float n2) throws cantDivideByZeroException{
        if (n2==0){
            throw new cantDivideByZeroException();
        }
        return n1/n2;
    }
}
public class customCalc {
    public static void main(String[] args) throws invalidInputException, maxInputException, maxMultiplierException, cantDivideByZeroException {
        Scanner sc = new Scanner(System.in);
        System.out.println("[+]Addition [-]Subtraction [*Multiplication] [/]Division");
        String op = sc.next();
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        calcualtor calc = new calcualtor();
        if (n1==8 || n1 ==9 || n2==8 || n2==9){
            throw new invalidInputException();
        }
        if (n1>10000 || n2>10000){
            throw new maxInputException();
        }
        if(op.equals("+")){
            System.out.println(calc.add(n1, n2));
        }if(op.equals("-")){
            System.out.println(calc.sub(n1, n2));
        }if(op.equals("+")){
            System.out.println(calc.product(n1, n2));
        }if(op.equals("+")){
            System.out.println(calc.div(n1, n2));
        }
    }
}
