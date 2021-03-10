public class Teacher {
    private final String firstName;
    private final String lastName;
    private final String subject;

    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }
    public String toString(){
        return "Name: " + getName() + "\nSubject: " + subject;
    }
}
