abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountainPen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changenib(){
        System.out.println("Channing nib");
    }
}

class Monkey {
    void jump(){
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("Bite");
    }
}

interface basicAnimal{
    void eat();
    void sleep();
}

class human extends Monkey implements basicAnimal{
    void speak(){
        System.out.println("Hello sir!!");
    }
    @Override
    public void eat(){
        System.out.println("eating");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
}
public class test {
    public static void main(String[] args) {
        fountainPen f = new fountainPen();

        human niran = new human();

        Monkey m1 = new human();
        m1.jump();
        m1.bite();
    }
}