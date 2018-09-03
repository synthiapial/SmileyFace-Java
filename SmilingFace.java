import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SmilingFace extends JFrame implements ActionListener {

    int temp = 0;
    private JButton smile = new JButton("Smile");
    private JButton frown = new JButton("Frown");

    public SmilingFace() {
// set the title
        setTitle("Face Program");

        setLayout(new FlowLayout());

// add smile/frown buttons
        add(smile);
        add(frown);

// set white background
        getContentPane().setBackground(Color.white);

// enable buttons for mouse click
        smile.addActionListener(this);
        frown.addActionListener(this);

// configure the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 250);
        setLocation(400, 400);
        setVisible(true);
    }

    public void paint(Graphics g) {
// call the paint method of the superclass, Jframe
        super.paint(g);
// print face here
        g.setColor(Color.black);
        g.drawOval(85, 75, 75, 75);
        g.setColor(Color.red);
        g.fillOval(100, 95, 10, 10);
        g.fillOval(135, 95, 10, 10);
        g.drawString("Face Smile/Frown", 80, 185);
        g.drawRect(121, 150, 3, 20);
        if (temp == 1) {
// smiling face
            g.drawArc(102, 115, 40, 25, 0, -180);
        } else if (temp == 3) {
// frown face
            g.drawArc(102, 115, 40, 25, 0, 180);
        }

    }
// this is where we code the event-handling routine

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smile) {
            temp = 1;
            repaint();
        }
        if (e.getSource() == frown) {
            temp = 3;
            repaint();
        }
    }
}
