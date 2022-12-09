import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel
{
    JLabel l1,l2,l3;
    JTextField f1,f2,f3;
    JButton button;
    MyPanel()
    {
        l1 = new JLabel("Input name");
        add(l1);
        f1 = new JTextField();
        f1.setColumns(10);
        add(f1);
        l2 = new JLabel("Input population");
        add(l2);
        f2 = new JTextField();
        f2.setColumns(10);
        add(f2);
        l3 = new JLabel("Input square");
        add(l3);
        f3 = new JTextField();
        f3.setColumns(10);
        add(f3);
        button = new JButton("Confirm");
        MyListener m = new MyListener();
        button.addActionListener(m);
        add(button);
    }
    class MyListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String s1 = f1.getText();
            int s2 = Integer.parseInt(f2.getText());
            int s3 = Integer.parseInt(f3.getText());
            City c = new City(s1,s2,s3);
            System.out.println(c);
            Main.cities.add(c);
            f1.setText("");
            f2.setText("");
            f3.setText("");
        }
    }
}
