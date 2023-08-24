class Employee{
    private int salary;
    private String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setSalary(int num){ salary=num; }
    public void setName(String newName){
        name = newName;
    }

    public Employee(){
        name = "David";
        salary = 13000;
    }
}

public class oops {
    public static void main(String[] args) {
        Employee harry = new Employee();
        Employee munna = new Employee();
//        harry.setSalary(14000);
        System.out.println(harry.getSalary());
//        harry.setName("Dustin Henderson");
        System.out.println(harry.getName());
        System.out.println(munna.getName());
        System.out.println(munna.getSalary());

    }
}
