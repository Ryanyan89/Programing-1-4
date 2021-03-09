import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teacherList = new ArrayList<>();
    ArrayList<Student> studentList = new ArrayList<>();
    private final String schoolName;
    private final String schoolMascot;
    private final String sportsTeamName;

    public School(String schoolName, String schoolMascot, String sportsTeamName){
        this.schoolName = schoolName;
        this.schoolMascot = schoolMascot;
        this.sportsTeamName = sportsTeamName;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public String getSchoolMascot(){
        return schoolMascot;
    }

    public String getSportsTeamName(){
        return sportsTeamName;
    }

    //creating a new teacher
    public void addTeacher(String firstName, String lastName, String subject){
        Teacher newTeacher = new Teacher(firstName, lastName, subject);
        teacherList.add(newTeacher);
    }
    //printing the list of teachers
    public void printTeacherList(){
        System.out.println("**********Teacher List*********");
        for (int i = 0; i < teacherList.size(); i++){
            System.out.println(teacherList.get(i));
        }
    }
    //removing an existing teacher
    public void removeTeacher(int indexPosition){
        teacherList.remove(indexPosition);
    }
    //printing list of teachers after removing a teacher
    public void printNewTeacherList(){
        System.out.println("**********New Teacher List*********");
        for (int i = 0; i < teacherList.size(); i++){
            System.out.println(teacherList.get(i));
        }
    }
    //adding a new student
    public void addStudent(String firstName, String lastName, int grade){
        Student newStudent = new Student(firstName, lastName, grade);
        studentList.add(newStudent);
    }
    //printing list of students
    public void printStudentList(){
        System.out.println("**********Student List*********");
        for (int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }
    }
    //removing and existing student
    public void removeStudent(int indexPosition){
        studentList.remove(indexPosition);
    }
    //printing list of students after removing students
    public void printNewStudentList(){
        System.out.println("**********New Student List*********");
        for (int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }
    }
}
