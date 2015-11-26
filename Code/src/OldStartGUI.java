import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class OldStartGUI extends JFrame {
	OldStartGUI(){
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
					JOptionPane.showMessageDialog(null,"New User");
				}
			});
		JButton returnDVD = new JButton("Return DVD");
		returnDVD.addActionListener(new
			ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					JOptionPane.showMessageDialog(null,"DVD");
				}
			});
	
	
    
    JPanel buttons = new JPanel();
    buttons.setLayout(layout);
    layout.setAlignment(FlowLayout.CENTER);
    buttons.add(loginUser);
    buttons.add(loginAdmin);
    buttons.add(newUser);
    buttons.add(returnDVD);
    buttons.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    myframe.add(buttons, BorderLayout.NORTH);
    
    JPanel usernamefield = new JPanel();
    TextField usernameField = new TextField("");
    JPanel passwordfield = new JPanel();
    TextField passwordField = new TextField("");
    usernamefield.add(usernameField);
    passwordfield.add(passwordField);
    myframe.add(usernamefield, BorderLayout.CENTER);
    myframe.add(passwordfield, BorderLayout.SOUTH);
	}
	
	FlowLayout layout = new FlowLayout();
	private static TextField usernameField;
	private static JFrame myframe;
	public void setSceneSize(int x,int y){
		myframe.setSize(x, y);
	}
	public void setSceneVisible(boolean value){
		myframe.setVisible(value);
	}
}
