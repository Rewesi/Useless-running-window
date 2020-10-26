package redhat.runningokno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindow extends JFrame {

    class StopClick implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(but.getText() == "Stop") {
                but.setText("Start");
            }else {
                but.setText("Stop");
            }
        }
    }

    JButton but;

    public MyWindow(String title) {
        super(title);
        this.setMinimumSize(new Dimension(300, 200));
        this.setLayout(new GridLayout(1,1));

        but = new JButton("Start");
        but.addActionListener(new StopClick());
        this.add(but);

        this.pack();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLocationRelativeTo(null);

    }
}