public class Student {
    private final String firstName;
    private final String lastName;
    private final int grade;
    private static int id = (int) (Math.random()*1000000+100000);
    private final int idNum;

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.idNum = id;
        id++;
    }
    public String getName(){
        return firstName + " " + lastName;
    }

    public String toString(){
     return "Name: " + getName() + "Grade: " + grade + "\tid: " + idNum;
    }
}
