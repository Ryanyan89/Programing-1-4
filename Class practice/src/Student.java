import java.util.ArrayList;

public class Student {
    private final String firstName;
    private static int id = 0;
    private final int idNum;
    private ArrayList<Courses> courseList = new ArrayList<>();

    public Student(String firstName) {
        this.firstName = firstName;
        this.idNum = id;
        id++;
    }
    public void addCourse(String subject, int grade){
        Courses course = new Courses(subject, grade);
        if (courseList.size() < 8){
            courseList.add(course);
        }
    }
    public int averageGrade(){
        int average = 0;
        for (int i = 0; i < courseList.size(); i++){
            average += courseList.get(i).getGrade();
        }
        return average / courseList.size();
    }
public void print(){
    for (int i = 0; i < courseList.size(); i++){
        System.out.println(courseList.get(i));
    }

}
    public String toString(){
        return "Student's first name: " + firstName + "\nStudent Id: " + id;
    }
}
