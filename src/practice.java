class greet extends Thread{
    @Override
    public void run(){
//        while (true){
//            try{
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Good Morning");
        }
    }

class welc extends Thread{
    @Override
    public void run(){
//        while (true){
//            try{
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
        }
    }


public class practice {
    public static void main(String[] args) {
        greet g1 = new greet();
        welc g2 = new welc();
        g1.start();
        g2.start();
        System.out.println(g2.getState());
        System.out.println(g1.getState());
        System.out.println(Thread.currentThread());
    }
}
