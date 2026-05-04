package Chapter2_Swing;

import javax.swing.*;
import java.awt.event.*;

public class CalculatorFrame {

    public static void main(String[] args) {

        JFrame jf = new JFrame("Calculator");

        // Step 1: Display field
        JTextField tf = new JTextField();
        tf.setBounds(30, 40, 240, 30);
        jf.getContentPane().add(tf);

        // Variables to store calculation
        final double[] num1 = new double[1];
        final String[] operator = new String[1];

        // Step 2: Create buttons
        String[] buttons = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0","C","=","+"
        };

        int x = 30, y = 100;

        for (String text : buttons) {

            JButton btn = new JButton(text);
            btn.setBounds(x, y, 50, 40);
            jf.getContentPane().add(btn);

            // Step 3: Button logic
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    String value = btn.getText();

                    if (value.matches("[0-9]")) {
                        tf.setText(tf.getText() + value);
                    }

                    else if (value.matches("[+\\-*/]")) {
                        num1[0] = Double.parseDouble(tf.getText());
                        operator[0] = value;
                        tf.setText("");
                    }

                    else if (value.equals("=")) {
                        double num2 = Double.parseDouble(tf.getText());
                        double result = 0;

                        switch (operator[0]) {
                            case "+": result = num1[0] + num2; break;
                            case "-": result = num1[0] - num2; break;
                            case "*": result = num1[0] * num2; break;
                            case "/": result = num1[0] / num2; break;
                        }

                        tf.setText(String.valueOf(result));
                    }

                    else if (value.equals("C")) {
                        tf.setText("");
                    }
                }
            });

            x += 60;

            if (x > 210) {
                x = 30;
                y += 50;
            }
        }

        // Frame settings
        jf.setSize(320, 350);
        jf.getContentPane().setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}