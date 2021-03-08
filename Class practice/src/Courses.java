public class Courses {
    private String subjectName;
    private String grade;

    public Courses(String subjectName,String grade) {
        this.subjectName = subjectName;
        this.grade = grade;
    }
    public String getSubjectName(){
        return subjectName;
    }
    public String toString(){
        return "Subject Name: " + this.subjectName + "\n Grade: " + this.grade;
    }
}
