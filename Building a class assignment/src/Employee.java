public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary ){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int annualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent){
        return (int) (salary * (double) percent/100);
    }
    public String toString(){
        return "Id: " + this.id + "\tFirst Name: " + this.firstName + "\tLast Name: " + this.lastName + "\tSalary: " + this.salary;
    }
}
