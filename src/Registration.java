import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;


public class Registration {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration");
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Name");
        label1.setBounds(30,50,100,10);
        frame.add(label1);
        JLabel label2 = new JLabel("Email");
        label2.setBounds(30,100,100,10);
        frame.add(label2);
        JLabel label3 = new JLabel("Address");
        label3.setBounds(30,150,100,10);
        frame.add(label3);
        JLabel label4 = new JLabel("Gender");
        label4.setBounds(30,300,100,10);
        frame.add(label4);
        JLabel label5 = new JLabel("Register");
        label5.setBounds(30,350,100,15);
        frame.add(label5);

        JTextField textField1 = new JTextField(30);
        textField1.setBounds(90,40,200,30);
        frame.add(textField1);

        JTextField textField2 = new JTextField(30);
        textField2.setBounds(90,90,200,30);
        frame.add(textField2);

        JTextArea textArea = new JTextArea(5,30);
        textArea.setBounds(90,140,200,100);
        frame.add(textArea);

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(100,300,100,10);
        frame.add(r1);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(200,300,100,10);
        frame.add(r2);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JButton sub = new JButton("Submit");
        sub.setBounds(100,350,100,20);
        frame.add(sub);
        sub.addActionListener(e -> {
            String name = textField1.getText();
            String email = textField2.getText();
            String address = textArea.getText();
            JOptionPane.showMessageDialog(frame,"Name: "+name + "\nEmail: "+email + "\nAddress: "+address +"\nYou have registered successfully");
        });

        ImageIcon img = new ImageIcon("C:\\Users\\KIIT\\Pictures\\Screenshots\\Screenshot 2026-02-26 214148.png");
        Image icon = img.getImage();
        Image resizedImg = icon.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        ImageIcon re = new ImageIcon(resizedImg);
        JLabel pic = new JLabel(re);
        pic.setBounds(50,400,200,200);
        frame.add(pic);

frame.setVisible(true);






    }
}
