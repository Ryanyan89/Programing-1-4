package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField textLastName;
    public TextField textFirstName;
    public TextField textNickname;
    public Label labelLastName;
    public Label labelFirstName;
    public Label labelNickname;
    public ListView<Friend> listFriends = new ListView<>();

    public void createFriend(ActionEvent actionEvent) {
        String nickname = textNickname.getText();
        String firstName = textFirstName.getText();
        String lastName = textLastName.getText();
        Friend friend = new Friend(nickname,firstName,lastName);
        listFriends.getItems().add(friend);
        textFirstName.clear();
        textLastName.clear();
        textNickname.clear();
    }
    public void showFriend(MouseEvent mouseEvent) {
        Friend friend = listFriends.getSelectionModel().getSelectedItem();
        if (friend == null){
            return;
        }
        labelFirstName.setText("First Name: " + friend.getFirstName());
        labelLastName.setText("Last Name: " + friend.getLastName());
        labelNickname.setText("Nickname: " + friend.getNickname());
    }

    public void removeFriend(ActionEvent actionEvent) {
        Friend friend = listFriends.getSelectionModel().getSelectedItem();
        if (friend == null){
            return;
        }
        listFriends.getItems().remove(friend);
        labelFirstName.setText("First Name:");
        labelLastName.setText("Last Name:");
        labelNickname.setText("Nickname:");
    }

    
}
