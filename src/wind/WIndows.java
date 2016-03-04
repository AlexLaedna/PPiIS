package wind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aantonbasalai on 26.02.2016.
 */
public class WIndows
{

    public WIndows()
    {
       // super ("Лабораторная №1");
        JFrame WIndows = new JFrame(" Лабораторная работа №1");
        JPanel wind=new JPanel(new FlowLayout());
        JButton addInComboBox = new JButton("1");
       // button1.setLocation(20,20);
        wind.add(addInComboBox);
        WIndows.add(wind);
        JTextField textField = new JTextField();
        wind.add(textField);
        JComboBox<String> comboBox = new JComboBox<String>();
        wind.add(comboBox);
        addInComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                comboBox.addItem(text);
            }
        });
        WIndows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WIndows.setSize(400,400);
        WIndows.setVisible(true);
    }
    public static void main(String[] args) {
        WIndows lab = new WIndows();
    }
}
