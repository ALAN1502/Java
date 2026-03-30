import java.awt.*;
import java.awt.event.*;

public class SimpleCalculatorAWT extends Frame implements ActionListener {

    TextField t1, t2, result;
    Button add, sub, mul, div;

    public SimpleCalculatorAWT() {
        setLayout(new FlowLayout());

        // Input fields
        add(new Label("First Number:"));
        t1 = new TextField(10);
        add(t1);

        add(new Label("Second Number:"));
        t2 = new TextField(10);
        add(t2);

        // Buttons
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        add(add);
        add(sub);
        add(mul);
        add(div);

        // Result field
        add(new Label("Result:"));
        result = new TextField(15);
        result.setEditable(false);
        add(result);

        // Add listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Frame settings
        setSize(300, 200);
        setTitle("Simple Calculator");
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double res = 0;

            if (e.getSource() == add) {
                res = a + b;
            } else if (e.getSource() == sub) {
                res = a - b;
            } else if (e.getSource() == mul) {
                res = a * b;
            } else if (e.getSource() == div) {
                if (b == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                res = a / b;
            }

            result.setText(String.valueOf(res));

        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculatorAWT();
    }
}