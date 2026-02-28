import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class RGB {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RGB");
        frame.setSize(500,500);
        frame.setLayout(null);

        JLabel red = new JLabel("Red");
        red.setBounds(100,100,50,10);
        frame.add(red);

        JLabel green = new JLabel("Green");
        green.setBounds(230,100,50,10);
        frame.add(green);

        JLabel blue = new JLabel("Blue");
        blue.setBounds(380,100,50,10);
        frame.add(blue);

        JComboBox<Integer> rc = new JComboBox<>();
        JComboBox<Integer> gc = new JComboBox<>();
        JComboBox<Integer> bc = new JComboBox<>();
        for (int i=0;i<256;i++) {
            rc.addItem(i);
            gc.addItem(i);
            bc.addItem(i);
        }
        rc.setBounds(150,100,50,20);
        frame.add(rc);
        gc.setBounds(300,100,50,20);
        frame.add(gc);
        bc.setBounds(430,100,50,20);
        frame.add(bc);

        JButton button = new JButton("Output");
        button.setBounds(290,200,100,30);
        frame.add(button);

        button.addActionListener(e-> {
            int r = (Integer) rc.getSelectedItem();
            int g = (Integer) gc.getSelectedItem();
            int b = (Integer) bc.getSelectedItem();
            Color c = new Color(r,g,b);
            frame.getContentPane().setBackground(c);
        });






        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
