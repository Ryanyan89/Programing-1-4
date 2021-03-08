public class Student {
    private String firstName;
    private int id;
    private String[] courses;

    public Student(String firstName, int id) {
        this.firstName = firstName;
        this.id = id;
    }
    public String getFirstName(){
       return firstName;
    }

    public int getId() {
        return id + 1;
    }



    public String toString(){
        return "Student's first name: " + firstName + "\nStudent Id: " + id;
    }
}
