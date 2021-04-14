package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

// You can only add,minus,multiply,or divide 2 sets of numbers
public class Controller {
    public Label labelCalculator;
    public TextField textCalculation;
    public Label labelCalculation;
    public String plus = "+";
    public String minus = "-";
    public String multiply = "x";
    public String divide = "/";
    public String numberToString;
    public String operatorsToString;
    public String number2ToString;
    public int array2 = 0;
    public int decimal = 0;
    private final ArrayList<String> numbers = new ArrayList<>();
    private final ArrayList<String> numbers2 = new ArrayList<>();
    private final ArrayList<String> operators = new ArrayList<>();
    private final ArrayList<Integer> delete = new ArrayList<>();

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
        labelCalculation.setText("0");
        textCalculation.setText("");
        operators.clear();
        numbers.clear();
        numbers2.clear();
        decimal = 0;
        array2 = 0;
    }

    public void clearNums(ActionEvent actionEvent) {
        labelCalculation.setText("0");
        if (array2 == 0){
            numbers.clear();
        }
        else if (array2 >= 2){
            labelCalculation.setText("0");
            textCalculation.setText("");
            operators.clear();
            numbers.clear();
            numbers2.clear();
        }
        else{
            numbers2.clear();
        }
        decimal = 0;
        array2 = 0;
    }

    public void deleteOneNum(ActionEvent actionEvent) {
        delete.add(Integer.parseInt(labelCalculation.getText()));
        if (delete.size() == 1){
            labelCalculation.setText(String.valueOf(delete.get(0)));
        }
        else{
            labelCalculation.setText(String.valueOf(delete.get(delete.size()-1) /10));
        }
    }

    public void add(ActionEvent actionEvent) {
        operations(plus);
    }

    public void minus(ActionEvent actionEvent) {
        operations(minus);
    }

    public void multiply(ActionEvent actionEvent) {
        operations(multiply);
    }

    public void divide(ActionEvent actionEvent) {
        operations(divide);
    }
    public void addDecimal(ActionEvent actionEvent) {
        if (decimal == 0){
            if (labelCalculation.getText().equals("0")){
                labelCalculation.setText("0" + ".");
            }
            else {
                String display =labelCalculation.getText() + ".";
                labelCalculation.setText(display);
            }
            decimal++;
        }
    }

    public void answer(ActionEvent actionEvent) {
        if (array2 == 1){
            numbers2.add(labelCalculation.getText());
            number2ToString = String.join("", numbers2);
            textCalculation.setText(numberToString + " " + operatorsToString + " " + number2ToString + " =");
            array2++;
            int numbers3 = 0;
            int numbers4 = 0;
            double decimalNumber3 = 0;
            double decimalNumber4 = 0;
            double divideNumber3 = 0;
            double divideNumber4 = 0;
            double answer2;
            int answer;


            if (operators.get(0).equals(divide)){
                if (numbers.get(0).contains("0") ||numbers2.get(0).contains("0")){
                    labelCalculation.setText("Can't divide");
                }
                else {
                    for (String number : numbers) {
                        divideNumber3= Double.parseDouble(number);
                    }
                    for (String number2 : numbers2){
                        divideNumber4= Double.parseDouble(number2);
                    }
                    answer2 = divideNumber3 / divideNumber4;
                    labelCalculation.setText(String.valueOf(answer2));
                }
            }
            else{
                if (numbers.get(0).contains(".") || numbers2.get(0).contains(".")){
                    for (String number : numbers) {
                        decimalNumber3 = Double.parseDouble(number);
                    }
                    for (String number2 : numbers2){
                        decimalNumber4 = Double.parseDouble(number2);
                    }
                    if (operators.get(0).equals(plus)){
                        answer2 = decimalNumber3 + decimalNumber4;
                        labelCalculation.setText(String.valueOf(answer2));
                    }
                    else if (operators.get(0).equals(minus)){
                        answer2 = decimalNumber3 - decimalNumber4;
                        labelCalculation.setText(String.valueOf(answer2));
                    }
                    else if (operators.get(0).equals(multiply)){
                        answer2 = decimalNumber3 * decimalNumber4;
                        labelCalculation.setText(String.valueOf(answer2));
                    }
                }
                else {
                    for (String number : numbers) {
                        numbers3 = Integer.parseInt(number);
                    }
                    for (String number2 : numbers2){
                        numbers4 = Integer.parseInt(number2);
                    }
                    if (operators.get(0).equals(plus)){
                        answer = numbers3 + numbers4;
                        labelCalculation.setText(String.valueOf(answer));
                    }
                    else if (operators.get(0).equals(minus)){
                        answer = numbers3 - numbers4;
                        labelCalculation.setText(String.valueOf(answer));
                    }
                    else if (operators.get(0).equals(multiply)){
                        answer = numbers3 * numbers4;
                        labelCalculation.setText(String.valueOf(answer));
                    }
                }
            }
        }
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
    private void operations(String operator){
        if (operators.size() == 0){
            numbers.add(labelCalculation.getText());
            numberToString = String.join("", numbers);
            labelCalculation.setText("0");
            operators.add(operator);
            operatorsToString = String.join("", operators);
            textCalculation.setText(numberToString + " " + operatorsToString);
            array2++;
            decimal = 0;
        }
    }
}