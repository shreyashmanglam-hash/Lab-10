import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Listbox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Colours");
        frame.setSize(500,500);
        frame.setLayout(null);

        String[] colours = {"White","Orange","Red","Blue"};
        JList<String> list = new JList<>(colours);
        list.setBounds(100,200,150,250);
        JScrollPane scroll = new JScrollPane(list);
        scroll.setBounds(100,200,50,100);
        frame.add(scroll);

        JButton click = new JButton("Click");
        click.setBounds(200,200,100,20);
        frame.add(click);

        click.addActionListener (e-> {
                String selected = list.getSelectedValue();
                if (selected == null) {
                    JOptionPane.showMessageDialog(null,"Please select a color");
                    return; }
                switch(selected) {
                    case "White" :
                        frame.getContentPane().setBackground(Color.WHITE);
                        break;
                    case "Orange" :
                        frame.getContentPane().setBackground(Color.ORANGE);
                        break;
                    case "Red" :
                        frame.getContentPane().setBackground(Color.RED);
                        break;
                    case "Blue" :
                        frame.getContentPane().setBackground(Color.BLUE);
                        break;
                }

        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}
