import javax.swing.*;
import java.awt.*;

public class Q2 extends JFrame{
    public Q2(){
        setTitle("BorderLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();

        container.setLayout((new BorderLayout(5, 7)));
        container.add(new JButton("North"), BorderLayout.NORTH);
        container.add(new JButton("South"), BorderLayout.SOUTH);
        container.add(new JButton("West"), BorderLayout.WEST);
        container.add(new JButton("East"), BorderLayout.EAST);
        container.add(new JButton("Center"), BorderLayout.CENTER);
        
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Q2();
    }
}