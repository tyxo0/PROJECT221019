import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
public class OpenChallenge extends JFrame{
    class NorthPanel extends JPanel{
        public NorthPanel(){
            setBackground(Color.lightGray);
            setLayout(new FlowLayout(FlowLayout.CENTER));
            add(new JButton("Open"));
            add(new JButton("Read"));
            add(new JButton("Close"));
        }
    }
    class CenterPanel extends JPanel{
        public CenterPanel(){
            setLayout(null);
            JLabel str0 = new JLabel("Hello");
            str0.setLocation(130,50);
            str0.setSize(100,20);
            add(str0);
            

            JLabel str1 = new JLabel("Java");
            str1.setLocation(190,10);
            str1.setSize(100,20);
            add(str1);

            JLabel str2 = new JLabel("Love");
            str2.setLocation(10,80);
            str2.setSize(100,20);
            add(str2);
        }
    }
    public OpenChallenge(){
        setTitle("Open Challenge 9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new NorthPanel(),BorderLayout.NORTH);
        add(new CenterPanel(),BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new OpenChallenge();
    }
}