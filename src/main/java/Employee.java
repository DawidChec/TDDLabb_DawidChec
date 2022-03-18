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

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String newName) {
        name = newName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }
}