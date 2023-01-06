public class THINKER {
    public int age;
    public String name;
    public double salary;

    public void show(double s, String name) {
        System.out.println("My Salary = " + salary);
        System.out.println("My Name is " + name);
    }

    public void thinker(double s) {
        salary = (double) (s + s);
    }

    public static void main(String[] args) {
        THINKER myThink = new THINKER();
        myThink.name = "coluxuz";
        myThink.salary = (int) 10000.0;
        myThink.age = 20;
        myThink.thinker(myThink.salary);
        myThink.show(myThink.salary, myThink.name);

    }
}
