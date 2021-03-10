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
        id += (int) (Math.random()*10000+10000);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public static int getId() {
        return id;
    }

    public int getIdNum() {
        return idNum;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public String toString(){
     return "Name: " + getName() + "Grade: " + grade + "\tid: " + idNum;
    }
}
