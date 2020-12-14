import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MatchResults extends JFrame
{
    int a = 0, b = 0;
    String s = "N/A";
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel lab1 = new JLabel("Result: "+a+" X "+b);
    JLabel lab2 = new JLabel("Last score: "+s);
    JLabel lab3 = new JLabel("Winner: DRAW");

    public MatchResults()
    {
        super("Match results");
        setLayout(null);
        setSize(400,400);

        setLocation(750,200);
        but1.setBounds(40,230,100,100);
        but2.setBounds(250,230,100,100);
        add(but1);
        add(but2);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a++;
                lab1.setText("Result: "+a+" X "+b);
                s = "AC Milan";
                lab2.setText("Last score: "+s);

                if(a>b)
                    lab3.setText("Winner: AC Milan");
                else
                if (a<b)
                    lab3.setText("Winner: Real Madrid");
                else
                    lab3.setText("Winner: DRAW");
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b++;
                lab1.setText("Result: "+a+" X "+b);
                s = "Real Madrid";
                lab2.setText("Last score: "+s);

                if(a>b)
                    lab3.setText("Winner: AC Milan");
                else
                if (a<b)
                    lab3.setText("Winner: Real Madrid");
                else
                    lab3.setText("Winner: DRAW");
            }
        });

        setLayout(new BorderLayout());
        add(lab1, BorderLayout.NORTH);
        add(lab2, BorderLayout.CENTER);
        add(lab3, BorderLayout.SOUTH);
    }

    public static void main(String[]args)
    {
        new MatchResults().setVisible(true);
    }
}