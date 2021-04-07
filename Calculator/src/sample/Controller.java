package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {
    public Label labelCalculator;
    public TextField textCalculation;
    public Label labelCalculation;
    private final ArrayList<String> numbers = new ArrayList<>();
    private final ArrayList<String> operators = new ArrayList<>();
    public String plus = "+";
    public boolean oneDecimal = true;


    public void addZero(ActionEvent actionEvent) {
        addNumber("0");
    }

    public void addOne(ActionEvent actionEvent) {
        addNumber("1");
    }

    public void addTwo(ActionEvent actionEvent) {
        addNumber("2");
    }

    public void addThree(ActionEvent actionEvent) {
        addNumber("3");
    }

    public void addFour(ActionEvent actionEvent) {
        addNumber("4");
    }

    public void addFive(ActionEvent actionEvent) {
        addNumber("5");
    }

    public void addSix(ActionEvent actionEvent) {
        addNumber("6");
    }

    public void addSeven(ActionEvent actionEvent) {
        addNumber("7");
    }

    public void addEight(ActionEvent actionEvent) {
        addNumber("8");
    }

    public void addNine(ActionEvent actionEvent) {
        addNumber("9");
    }

    public void clearAll(ActionEvent actionEvent) {
    }

    public void clearNums(ActionEvent actionEvent) {
        labelCalculation.setText("0");
    }

    public void deleteOneNum(ActionEvent actionEvent) {
    }

    public void add(ActionEvent actionEvent) {
        numbers.add(labelCalculation.getText());
        labelCalculation.setText("0");
        operators.add(plus);
    }

    public void minus(ActionEvent actionEvent) {
    }

    public void multiply(ActionEvent actionEvent) {
    }

    public void divide(ActionEvent actionEvent) {
    }
    public void addDecimal(ActionEvent actionEvent) {
        if (oneDecimal = true){
            String display = labelCalculation.getText() + ".";
            labelCalculation.setText(display);
            oneDecimal = false;
        }
    }

    public void answer(ActionEvent actionEvent) {
    }
    private void addNumber(String number){
        if (labelCalculation.getText().equals("0")){
            labelCalculation.setText(number);
        }
        else {
            String display =labelCalculation.getText() + number;
            labelCalculation.setText(display);
        }
    }
}
