import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
 
public class StartGUI {
	
	
	
    JTabbedPane getContent() {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("User Login", getGridTab());
        tabbedPane.addTab("Admin Login", getGridBagTab1());
        tabbedPane.addTab("Return DVD", getGridBagTab2());
        return tabbedPane;
    }
    
   
    private JPanel getGridTab() {
        JPanel panel = new JPanel(new GridLayout(0,1));
        
        JPanel usernameP = new JPanel();
        usernameP.add(getUsernameLabel());
        usernameP.add(getUsernameField());
        
        JPanel passwordP = new JPanel();
        passwordP.add(getPasswordLabel());
        passwordP.add(getPasswordField());
        
        panel.add(usernameP);
        panel.add(passwordP);
        
        JPanel button = new JPanel();
        button.add(getButton());
        panel.add(button);
        return addToParent(panel);
    }
 
    private JPanel getGridBagTab1() {
    	JPanel panel = new JPanel(new GridLayout(0,1));
        
        JPanel usernameP = new JPanel();
        usernameP.add(getUsernameLabel());
        usernameP.add(getUsernameField());
        
        JPanel passwordP = new JPanel();
        passwordP.add(getPasswordLabel());
        passwordP.add(getPasswordField());
        
        panel.add(usernameP);
        panel.add(passwordP);
        
        JPanel button = new JPanel();
        button.add(getButton());
        panel.add(button);
        return addToParent(panel);
    }
 
    private JPanel getGridBagTab2() {
    	JPanel panel = new JPanel(new GridLayout(0,1));
        
        JPanel usernameP = new JPanel();
        usernameP.add(getUsernameLabel());
        usernameP.add(getUsernameField());
        
        JPanel DVDIDP = new JPanel();
        DVDIDP.add(new JLabel("DVD ID:"));
        JTextField DVDIDField = new JTextField(8);
        DVDIDP.add(DVDIDField);
        
        panel.add(usernameP);
        panel.add(DVDIDP);
        
        JPanel button = new JPanel();
        button.add(getButton1());
        panel.add(button);
        return addToParent(panel);
    }
 
    private JPanel addToParent(JPanel north) {
        JTextArea displayArea = new JTextArea(10,25);
        displayArea.setEnabled(false);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(north, "North");
        panel.add(new JScrollPane( displayArea ));
        return panel;
    }
 
    private JLabel getUsernameLabel() {
        return new JLabel("Username:");
    }
    
    private JLabel getPasswordLabel() {
        return new JLabel("Password:");
    }
 
    private JTextField getUsernameField() {
        JTextField usernameField = new JTextField(8);
        usernameField.setEnabled(true);
        return usernameField;
    }
    
    private JTextField getPasswordField() {
        JTextField passwordField = new JTextField(8);
        passwordField.setEnabled(true);
        return passwordField;
    }
 
    private JButton getButton() {
    	JButton submitButton = new JButton("Submit");
    	submitButton.addActionListener(new
    			ActionListener()
    			{
    				public void actionPerformed(ActionEvent event)
    				{
    					JOptionPane.showMessageDialog(null,"User or Adminr");
    				}
    			});
        return submitButton;        
    }
    
    private JButton getButton1() {
    	JButton submitButton = new JButton("Submit");
    	submitButton.addActionListener(new
    			ActionListener()
    			{
    				public void actionPerformed(ActionEvent event)
    				{
    					JOptionPane.showMessageDialog(null,"DVD");
    				}
    			});
        return submitButton;
    }
 
}

