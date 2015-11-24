import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StartGUI {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JButton loginUser = new JButton("Login");
    loginUser.addActionListener(new
       ActionListener()
       {
          public void actionPerformed(ActionEvent event)
          {
             JOptionPane.showMessageDialog(null,"shit")
          }
       });
}
