public class Main {
    public static void main(String[] args) {
        Employee newEmployee = new Employee(657771, "Jimmy", "Jam", 120000);
        System.out.println("Id: " + newEmployee.getId());
        System.out.println("First name: " + newEmployee.getFirstName() + "\nLast name: " + newEmployee.getLastName() + "\nFull name: " + newEmployee.getName());
        System.out.println("Salary: $" + newEmployee.getSalary());
        newEmployee.setSalary(120000);
        System.out.println("Annual Salary: $" + newEmployee.annualSalary());
        System.out.println("Raise: $" + newEmployee.raiseSalary(10));
        System.out.println(newEmployee);
    }
}
