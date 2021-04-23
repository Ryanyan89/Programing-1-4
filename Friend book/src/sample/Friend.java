package sample;

public class Friend {
    private String nickname;
    private String firstName;
    private String lastName;

    public Friend(String nickname, String firstName, String lastName) {
        this.nickname = nickname;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString(){
        return nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
