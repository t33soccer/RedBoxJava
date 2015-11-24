import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StartGUI extends JFrame {
	StartGUI(){
		myframe = new JFrame();
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
		JButton loginUser = new JButton("User Login");
		loginUser.addActionListener(new
			ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					JOptionPane.showMessageDialog(null,"user");
				}
			});
    
		JButton loginAdmin = new JButton("Admin Login");
		loginAdmin.addActionListener(new
			ActionListener()
				{
					public void actionPerformed(ActionEvent event)
						{
							JOptionPane.showMessageDialog(null,"admin");
						}
				});
    
		JButton newUser = new JButton("New User");
		newUser.addActionListener(new
			ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					JOptionPane.showMessageDialog(null,"shit");
				}
			});
        
    JPanel buttons = new JPanel();
    buttons.add(loginUser);
    buttons.add(loginAdmin);
    buttons.add(newUser);
  
    myframe.add(buttons, BorderLayout.NORTH);
	}
	private static JFrame myframe;
	public void setSceneSize(int x,int y){
		myframe.setSize(x, y);
	}
	public void setSceneVisible(boolean value){
		myframe.setVisible(value);
	}
}
