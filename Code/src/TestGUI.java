import java.awt.Container;

import javax.swing.JFrame;

public class TestGUI {

	public static void main(String[] args) {
		StartGUI myStartGUI = new StartGUI();
		JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = f.getContentPane();
        container.add(myStartGUI.getContent());
        f.pack( );
        f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        f.setVisible(true);
	}

}
