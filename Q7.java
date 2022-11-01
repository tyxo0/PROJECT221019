import javax.swing.*;
import java.awt.*;

public class Q7 extends JFrame{
    class NorthPanel extends JPanel{
        public NorthPanel(){
            setLayout(new FlowLayout(FlowLayout.LEFT));
            setBackground(Color.lightGray);
            add(new JLabel("수식입력"));
            JTextField temp = new JTextField("");
            temp.setPreferredSize(new Dimension(200,20));
            add(temp);

        }
    }
    class CenterPanel extends JPanel{
        public CenterPanel(){

            setLayout(new GridLayout(4,4,1,1));
            for(int i=0; i<10; i++){
                add(new JButton("" + i));
            }
            add(new JButton("CE"));
            add(new JButton("계산"));
            
            String op[] ={"+", "-", "x", "/"};
            for(int i=0; i<4; i++){
                JButton tempbut = new JButton(op[i]);
                tempbut.setBackground(Color.cyan);
                add(tempbut);
            }
        }
    }
    class SouthPanel extends JPanel{
        public SouthPanel(){
            setLayout(new FlowLayout(FlowLayout.LEFT));
            setBackground(Color.yellow);
            add(new JLabel("계산결과"));
            JTextField temp = new JTextField("");
            temp.setPreferredSize(new Dimension(200,20));
            add(temp);

        }
    }
    public Q7(){
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new NorthPanel(),BorderLayout.NORTH);
        add(new CenterPanel(),BorderLayout.CENTER);
        add(new SouthPanel(),BorderLayout.SOUTH);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Q7();
    }
}