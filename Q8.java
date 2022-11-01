import javax.swing.*;
import java.awt.*;

public class Q8 extends JFrame{
    class NorthPanel extends JPanel{
        public NorthPanel(){
            setBackground(Color.lightGray);
            setLayout(new FlowLayout(FlowLayout.CENTER));
            add(new JButton("열기"));
            add(new JButton("닫기"));
            add(new JButton("나가기"));

        }
    }
    class CenterPanel extends JPanel{
        public CenterPanel(){
            setLayout(null);
            setBackground(Color.white);
            setSize(300,200);
            for(int i=0; i<10; i++){
                
                JLabel temp = new JLabel("*");
                
                temp.setLocation((int)(Math.random()*301),(int)(Math.random()*201));    
                temp.setForeground(Color.red);
                temp.setSize(10,10);
                add(temp);
            }
        }
    }
    class SouthPanel extends JPanel{
        public SouthPanel(){
            setLayout(new FlowLayout(FlowLayout.LEFT));
            setBackground(Color.yellow);
            add(new JButton("Word input"));
            JTextField temp = new JTextField(15);
            add(temp);
        }
    }
    public Q8(){
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new NorthPanel(),BorderLayout.NORTH);
        add(new CenterPanel(),BorderLayout.CENTER);
        add(new SouthPanel(),BorderLayout.SOUTH);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Q8();
    }
}