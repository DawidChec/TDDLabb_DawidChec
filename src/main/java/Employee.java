public class Employee {
    private int ID;
    private static int counter;
    private String name;
    private String lastName;
    private int age;
    private double salary;


    public Employee(String name, String lastName, int age, double salary) {
        counter = counter + 1;
        ID = counter;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;

    }

    public int getUniqueID() {
        return ID;
    }

    public String getFirstName() {
        return name;
    }

}