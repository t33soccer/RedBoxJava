import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StartGUI extends JFrame {
	StartGUI() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JButton loginUser = new JButton("Login");
    loginUser.addActionListener(new
       ActionListener()
       {
          public void actionPerformed(ActionEvent event)
          {
             JOptionPane.showMessageDialog(null,"shit");
          }
       });
	}
}
