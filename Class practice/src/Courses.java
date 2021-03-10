public class Courses {
    private final String subjectName;
    private final int grade;

    public Courses(String subjectName, int grade) {
        this.subjectName = subjectName;
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Subject: " + subjectName + "\tGrade: " + grade + "%";
    }
}
