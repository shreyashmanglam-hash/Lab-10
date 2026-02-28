import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Calculator");
        frame.setSize(800,800);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Enter first number");
        label1.setBounds(100,100,150,10);
        frame.add(label1);

        JTextField textField1 = new JTextField(10);
        textField1.setBounds(250,100,100,20);
        frame.add(textField1);

        JLabel label2 = new JLabel("Enter second number");
        label2.setBounds(100,150,150,10);
        frame.add(label2);

        JTextField textField2 = new JTextField(10);
        textField2.setBounds(250,150,100,20);
        frame.add(textField2);

        JLabel label3 = new JLabel("Result");
        label3.setBounds(100,200,150,20);
        frame.add(label3);

        JTextField textField3 = new JTextField(30);
        textField3.setBounds(250,200,150,20);
        frame.add(textField3);
        textField3.setEditable(false);

        JButton b1 = new JButton("Add");
        b1.setBounds(200,250,100,30);
        frame.add(b1);

        JButton b2 = new JButton("Subtract");
        b2.setBounds(350,250,100,30);
        frame.add(b2);

        JButton b3 = new JButton("Multiply");
        b3.setBounds(200,350,100,30);
        frame.add(b3);

        JButton b4 = new JButton("Reset");
        b4.setBounds(350,350,100,30);
        frame.add(b4);

        b1.addActionListener(e-> {
            try  {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int sum = num1+num2;
            textField3.setText(String.valueOf(sum)); }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Please enter valid numbers");
            }
        });
        b2.addActionListener(e-> {
            try {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int subtract = num1 - num2;
            textField3.setText(String.valueOf(subtract)); }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Please enter valid numbers");
            }
        });
        b3.addActionListener(e-> {
            try {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int product = num1*num2;
            textField3.setText(String.valueOf(product)); }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Please enter valid numbers");
            }
        });
        b4.addActionListener(e-> {
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
        });



        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
