package wind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WIndows {
    public WIndows() {
        JFrame WIndows = new JFrame(" Лабораторная работа №1");
        JPanel wind1 = new JPanel(new FlowLayout());
        JPanel wind2 = new JPanel(new FlowLayout());
        JPanel wind3 = new JPanel(new FlowLayout());
        JPanel wind4 = new JPanel(new FlowLayout());
        JPanel wind5 = new JPanel(new FlowLayout());
        JTabbedPane tb = new JTabbedPane();
        tb.add("Задание №1", wind1);
        tb.add("Задание №2", wind2);
        tb.add("Задание №3", wind3);
        tb.add("Задание №4", wind4);
        tb.add("Задание №5", wind5);
        JButton addInComboBox = new JButton("1");
        addInComboBox.setLocation(20, 20);
        wind1.add(addInComboBox);
        JTextField textField = new JTextField("", 20);
        textField.setSize(20, 40);
        wind1.add(textField);
        DefaultComboBoxModel<String> mod = new DefaultComboBoxModel<String>();
        JComboBox<String> textList = new JComboBox<String>(mod);
        wind1.add(textList);
        addInComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (!text.isEmpty()) {
                    if (mod.getIndexOf(text) == -1) {
                        mod.addElement(text);
                        textField.setText(null);
                    } else JOptionPane.showMessageDialog(WIndows, "Повторяющийся текст");
                } else JOptionPane.showMessageDialog(WIndows, "Введите текст");
            }
        });
        JTextField textField2 = new JTextField("", 20);
        textField.setSize(20, 40);
        wind2.add(textField2);
        JButton copyText = new JButton("copy");
        JButton removeText = new JButton("remove(");
        copyText.setLocation(20, 20);
        copyText.setSize(20, 20);
        removeText.setLocation(40, 40);
        wind2.add(copyText);
        wind2.add(removeText);
        copyText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField2.getText();
                if (text1.isEmpty()) {
                    JOptionPane.showMessageDialog(WIndows, "Введите текст");
                } else {
                    copyText.setText(text1);
                    textField2.setText(null);
                }
            }
        });
        removeText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = copyText.getText();
                String text2 = removeText.getText();
                removeText.setText(text1);
                copyText.setText(text2);
            }
        });
        JButton checkRbatton = new JButton("Select");
        JRadioButton rbatton1 = new JRadioButton("1");
        JRadioButton rbatton2 = new JRadioButton("2");
        JRadioButton rbatton3 = new JRadioButton("3");
        JTextField textField3 = new JTextField(25);
        ButtonGroup grup = new ButtonGroup();
        grup.add(rbatton1);
        grup.add(rbatton2);
        grup.add(rbatton3);
        wind3.add(checkRbatton);
        wind3.add(rbatton1);
        wind3.add(rbatton2);
        wind3.add(rbatton3);
        wind3.add(textField3);
        checkRbatton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField3.getText();
                if (text.equals(rbatton1.getText())) {
                    rbatton1.setSelected(true);
                    textField3.setText(null);
                } else {
                    if (text.equals(rbatton2.getText())) {
                        rbatton2.setSelected(true);
                        textField3.setText(null);
                    } else {
                        if (text.equals(rbatton3.getText())) {
                            rbatton3.setSelected(true);
                            textField3.setText(null);
                        } else {
                            JOptionPane.showMessageDialog(WIndows, "Проверте текст");
                        }
                    }
                }
            }

        });
        JTextField textField4 = new JTextField(25);
        JButton checkCheckBox = new JButton("Select");
        JCheckBox box1 = new JCheckBox("1");
        JCheckBox box2 = new JCheckBox("2");
        JCheckBox box3 = new JCheckBox("3");
        wind4.add(checkCheckBox);
        wind4.add(textField4);
        wind4.add(box1);
        wind4.add(box2);
        wind4.add(box3);
        checkCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField4.getText();
                if (text.equals(box1.getText())) {
                    box1.setSelected(!box1.isSelected());
                } else {
                    if (text.equals(box2.getText())) {
                        box2.setSelected(!box2.isSelected());
                    } else {
                        if (text.equals(box3.getText())) {
                            box3.setSelected(!box3.isSelected());
                        } else {
                            JOptionPane.showMessageDialog(WIndows, "Проверте текст");
                        }
                    }
                }
            }

        });
        String[] colonsName={"First",
                           "Second"};
        JTable table;
        table = new JTable(colonsName);

        WIndows.add(tb);
        WIndows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WIndows.setSize(400, 400);
        WIndows.setVisible(true);
    }

    public static void main(String[] args) {
        WIndows lab = new WIndows();
    }
}
