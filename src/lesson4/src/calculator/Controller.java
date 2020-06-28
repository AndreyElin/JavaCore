package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public Label label;

    public long number1 = 0;
    public String operator = "";
    public boolean start = true;

    public void clickBtnDigit(ActionEvent actionEvent) {
        if (start) {
            label.setText("");
            start = false;
        }
        String value = ((Button)actionEvent.getSource()).getText();
        label.setText(label.getText() + value);
    }

    public void clickBtnOperator(ActionEvent actionEvent) {
        String value = ((Button)actionEvent.getSource()).getText();
        if (!"=".equals(value)) {
            if (!operator.isEmpty()) {
                return; }
            operator = value;
            number1 = Long.parseLong(label.getText());
            label.setText("");
        } else {
            if (operator.isEmpty()) {
                return; }
            label.setText(String.valueOf(answer(number1, Long.parseLong(label.getText()), operator)));
            operator = "";
            start = true;
        }
    }

    long answer(long number1, long number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0) {
                    return 0;
                }
                return number1 / number2;
        }
        return 0;
    }
}
