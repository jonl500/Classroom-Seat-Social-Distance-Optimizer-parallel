import javax.swing.*;
import java.awt.*;

public class GUI {
    public GUI(){
JFrame frame = new JFrame();

JPanel panel = new JPanel();
panel.setBorder(BorderFactory.createEmptyBorder(120,120,80,120));
panel.setLayout(new GridLayout(0,1));

frame.add(panel, BorderLayout.CENTER);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("Covid-19 Classroom Optimizer");
frame.pack();
frame.setVisible(true);

    }
}
