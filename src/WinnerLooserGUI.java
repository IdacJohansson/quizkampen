import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinnerLooserGUI extends JFrame {
    private JPanel panel1;
    private JLabel winnerOrLooserLabel;
    private JButton button1;


    public WinnerLooserGUI(){
        setContentPane(panel1);
        setVisible(true);
        setSize(300,300);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}