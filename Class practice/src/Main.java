public class Main {
    public static void main(String[] args) {
        Student newStudent = new Student("Ronald");
        System.out.println(newStudent);
        newStudent.addCourse("Math", (int) (Math.random()*100)+1);
        newStudent.addCourse("English", (int) (Math.random()*100)+1);
        newStudent.addCourse("P.E", (int) (Math.random()*100)+1);
        newStudent.addCourse("Social studies", (int) (Math.random()*100)+1);
        newStudent.addCourse("French", (int) (Math.random()*100)+1);
        newStudent.addCourse("Chemistry", (int) (Math.random()*100)+1);
        newStudent.addCourse("Biology", (int) (Math.random()*100)+1);
        newStudent.addCourse("Physics", (int) (Math.random()*100)+1);
        newStudent.addCourse("gay", (int) (Math.random()*100)+1);
        System.out.println("Average: " + newStudent.averageGrade());
        newStudent.print();
    }
}
