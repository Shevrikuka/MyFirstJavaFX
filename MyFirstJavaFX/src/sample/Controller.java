package sample;

        import javafx.event.ActionEvent;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;

public class Controller {
    public Button minus;
    public Button plus;
    public Button div;
    public Button mult;
    public Label label;
    public Button sqrt;
    public Button Fact;
    public Button pow;
    public Button x;
    public TextField field1;
    public TextField field2;


    public void startMinus(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            int first = Integer.parseInt(str1);
            int second = Integer.parseInt(str2);
            label.setText(String.valueOf(first - second));

        } catch (NumberFormatException e) {
            label.setText("Неверный ввод");
        }
    }

    public void startPlus(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            int first = Integer.parseInt(str1);
            int second = Integer.parseInt(str2);
            label.setText(String.valueOf(first + second));

        } catch (NumberFormatException e) {
            label.setText("Неверный ввод");
        }
    }

    public void startDiv(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            double first = Integer.parseInt(str1);
            double second = Integer.parseInt(str2);
            double answer = first / second;
            label.setText(String.valueOf(answer));

        } catch (NumberFormatException e) {
            label.setText("Неверный ввод");
        } catch (ArithmeticException exception) {
            label.setText("Ошибка");
        }
    }

    public void startMult(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            int first = Integer.parseInt(str1);
            int second = Integer.parseInt(str2);
            label.setText(String.valueOf(first * second));

        } catch (NumberFormatException e) {
            label.setText("Неверный ввод");
        }
    }

    public void startSqrt(ActionEvent actionEvent) {
        String str1 = field1.getText();
        try {
            double first = Integer.parseInt(str1);
            label.setText(String.valueOf(Math.sqrt(first)));

        } catch (NumberFormatException e) {
            label.setText("Неверный ввод");
        }
    }

    public void startX(ActionEvent actionEvent) {
        String str1 = field1.getText();
        try {
            double first = Double.parseDouble(str1);
            double answer = 1/first;
            label.setText(String.valueOf(answer));
        } catch (NumberFormatException e) {
            label.setText("Неверный ввод");
        }

    }

    public void startPow(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            double first = Double.parseDouble(str1);
            double second = Double.parseDouble(str2);
            label.setText(String.valueOf(Math.pow(first, second)));
        } catch (NumberFormatException e) {
            label.setText("Неверный ввод");
        }
    }

    public void startFAct(ActionEvent actionEvent) {
        String str1 = field1.getText();
        try {
            int first = Integer.parseInt(str1);
            int a = first;
            for (int i = 2; i < first; i++) {
                a = (a * i);
            }
            label.setText(String.valueOf(a));
        } catch (NumberFormatException e) {
            label.setText("Неверный ввод");
        }
    }
}
