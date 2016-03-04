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
        JPanel wind=new JPanel(new FlowLayout());
        JButton addInComboBox = new JButton("1");
        addInComboBox.setLocation(20,20);
        wind.add(addInComboBox);
        WIndows.add(wind);
        JTabbedPane tb =new JTabbedPane();
        JTextField textField = new JTextField("",20);
        textField.setSize(20,40);
        wind.add(textField);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        JComboBox<String> textList = new JComboBox<String>(model);
        wind.add(textList);
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
        WIndows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WIndows.setSize(400,400);
        WIndows.setVisible(true);
    }
    public static void main(String[] args) {
        WIndows lab = new WIndows();
    }
}
