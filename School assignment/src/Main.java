public class Main {
    public static void main(String[] args) {
        School school = new School("Sunset secondary school", "Sunny", "The Scorching Suns");
        System.out.println(school.getSchoolName());
        System.out.println(school.getSchoolMascot());
        System.out.println(school.getSportsTeamName());
        school.addTeacher("John", "Lee", "French 11");
        school.addTeacher("Crystal", "Wong", "Precalculus");
        school.addTeacher("Johnny", "Jenkins", "Chemistry");
        System.out.println("**********Teacher List*********");
        school.printTeacherList();
        school.removeTeacher(2);
        System.out.println("**********New Teacher List*********");
        school.printTeacherList();
        school.addStudent("Jimmy","Smith ", 10 );
        school.addStudent("Ryan", "Yan ", 11);
        school.addStudent("Cathy", "Tong ", 9);
        school.addStudent("Jeff", "Stone ", 8);
        school.addStudent("Cyrus", "Saitou ", 12);
        school.addStudent("Bernard", "Hammond ", 9);
        school.addStudent("Tasunka", "Fekete ", 8 );
        school.addStudent("Manuel", "Hermansen ", 12);
        school.addStudent("Daniel", "yang ", 11);
        school.addStudent("Steven", "le ", 10);
        System.out.println("**********Student List*********");
        school.printStudentList();
        school.removeStudent(6);
        school.removeStudent(8);
        System.out.println("**********New Student List*********");
        school.printStudentList();





    }
}
