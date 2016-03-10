package wind;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WIndows
{
    public WIndows()
    {
        JFrame WIndows = new JFrame(" Лабораторная работа №1");
        JPanel wind1=new JPanel(new FlowLayout());
        JPanel wind2=new JPanel(new FlowLayout());
        JPanel wind3=new JPanel(new FlowLayout());
        JPanel wind4=new JPanel(new FlowLayout());
        JPanel wind5=new JPanel(new FlowLayout());
        JTabbedPane tb =new JTabbedPane();
        tb.add("Задание №1",wind1);
        tb.add("Задание №2",wind2);
        tb.add("Задание №3",wind3);
        tb.add("Задание №4",wind4);
        tb.add("Задание №5",wind5);
        JButton addInComboBox = new JButton("1");
        addInComboBox.setLocation(20,20);
        wind1.add(addInComboBox);
        JTextField textField = new JTextField("",20);
        textField.setSize(20,40);
        wind1.add(textField);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        JComboBox<String> textList = new JComboBox<String>(model);
        wind1.add(textList);
        addInComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (!text.isEmpty()) {
                    if (model.getIndexOf(text)==-1){
                        model.addElement(text);
                    }
                    else JOptionPane.showMessageDialog(WIndows,"Повторяющийся текст");
                }
                else JOptionPane.showMessageDialog(WIndows,"Введите текст");
            }
        });
        JTextField textField2 = new JTextField("",20);
        textField.setSize(20,40);
        wind2.add(textField2);
        JButton copyText=new JButton("copy");
        JButton removeText = new JButton("remove(");
        copyText.setLocation(20,20);
        copyText.setSize(20,20);
        removeText.setLocation(40,40);
        wind2.add(copyText);
        wind2.add(removeText);
        copyText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1=textField2.getText();
                copyText.setText(text1);

            }
        });
        removeText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             String text1=copyText.getText();
             copyText.setText(removeText.getName());
                removeText.setText(text1);
            }
        });
        WIndows.add(tb);
        WIndows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WIndows.setSize(400,400);
        WIndows.setVisible(true);
    }
    public static void main(String[] args)
    {WIndows lab = new WIndows();}
}
