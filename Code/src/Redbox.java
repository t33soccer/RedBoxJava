import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;



/**
 * This is the auto-generated GUI from the Eclipse GUI Creator Tool
 *
 */
public class Redbox {

	private JFrame frmWelcomeToRedbox;
	private JTextField usernameTextField;
	private JPasswordField passwordField;
	private JTextField titleTextField;
	private JTextField genreTextField;
	private JTextField ratingTextField;
	private JTextField typeTextField;
	private JTextField addgameTitleTextField;
	private JTextField gameCategTextField;
	private JTextField gameRatingTextField;
	private JTextField platformTextField;
	private JTextField changeTitleTextField;
	private JTextField changeGenCatTextField;
	private JTextField changeRatingTextField;
	private JTextField changeTypPlatTextField;
	private JTextField lastNameTextField;
	private JTextField IDTextField;
	private JTextField emailTextField;
	private JTextField addressTextField;
	private JTextField cityTextField;
	private JTextField stateTextField;
	private JTextField zipTextField;
	private JTextField balanceTextField;
	private JTextField passwordTextField;
	private JTextField checkPasswordTextField;
	private JTextField rentItemIDTextField;
	private JTextField rentUserIDTextField;
	private JPanel RedBox;
	private JPanel AccountsGUI;
	private JPanel AdminHomeGUI;
	private JPanel AccountDetailsAsAdminGUI;
	private JPanel InventoryAdminGUI;
	private JPanel addTypeGUI;
	private JPanel addMovieGUI;
	private JPanel addGameGUI;
	private JPanel editItemGUI;
	private JPanel NewUserGUI;
	private JPanel ReturnGUI;
	private JPanel UserAccountInfoGUI;
	private JPanel UserHomeGUI;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField editFirstNameTextField;
	private JTextField editIDTextField;
	private JTextField editStateTextField;
	private JTextField editAddressTextField;
	private JTextField editCityTextField;
	private JTextField editEmailTextField;
	private JTextField editBalanceTextField;
	private JTextField editZipCodeTextField;
	private JTextField editNewPasswordTextField;
	private JTextField userReturnIDTextField;
	private JTextField rentableIDTextField;
	
	private static Map<String,User> userMap;
	private static Map<String,Movie> movieMap;
	private static Map<String,VideoGame> videogameMap;
	private static Map<String,RentableInterface> rentablesMap;
	private User currentUser;
	private User detailUser;
	private static GUIMethods rbMethods = new GUIMethods();
	private ArrayList<User> currentAccountList;
	private ArrayList<Movie> currentMovieList;
	private ArrayList<VideoGame> currentVideoGameList;
	private String currentRentable;
	private JTextField firstNameTextField;
	private JTextField phoneNumberTextField;
	private JTextField editConfirmNewPasswordTextField;
	private JTextField editPhoneNumberTextField;
	private JTextField editLastNameTextField;
	private JTextField idTextBox;
	private JTextField editRemvoeID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userMap = rbMethods.loadUserAccountsMap();
					movieMap = rbMethods.loadMovieMap();
					videogameMap = rbMethods.loadVideoGameMap();
					Redbox window = new Redbox();
					window.frmWelcomeToRedbox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Redbox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToRedbox = new JFrame();
		frmWelcomeToRedbox.setTitle("Welcome to RedBox!");
		frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
		//frmWelcomeToRedbox.setBounds(100, 100, 800, 800);
		frmWelcomeToRedbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToRedbox.getContentPane().setLayout(new CardLayout(0, 0));
		//frmWelcomeToRedbox.setBounds(100, 100, 500, 250);
		
		final JPanel RedBox = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(RedBox, "name_338270847398726");
		RedBox.setLayout(null);
		
		final JPanel ReturnGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(ReturnGUI, "name_338281604275554");
		ReturnGUI.setLayout(null);
		ReturnGUI.setVisible(false);
		
		final JPanel NewUserGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(NewUserGUI, "name_342250112802273");
		NewUserGUI.setLayout(null);
		NewUserGUI.setVisible(false);
		
		final JPanel AdminHomeGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(AdminHomeGUI, "name_338278585414499");
		AdminHomeGUI.setLayout(null);
		AdminHomeGUI.setVisible(false);
		
		final JPanel AccountsGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(AccountsGUI, "name_344938768005395");
		AccountsGUI.setBackground(new Color(240, 240, 240));
		AccountsGUI.setLayout(null);
		AccountsGUI.setVisible(false);
		
		final JPanel AccountDetailsAsAdminGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(AccountDetailsAsAdminGUI, "name_345995529634014");
		AccountDetailsAsAdminGUI.setLayout(null);
		AccountDetailsAsAdminGUI.setVisible(false);
		
		final JPanel InventoryAdminGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(InventoryAdminGUI, "name_347640730085255");
		InventoryAdminGUI.setLayout(null);
		InventoryAdminGUI.setVisible(false);
		
		final JPanel addTypeGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(addTypeGUI, "name_348454410411193");
		addTypeGUI.setLayout(null);
		addTypeGUI.setVisible(false);
		
		final JPanel addMovieGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(addMovieGUI, "name_419989107733817");
		addMovieGUI.setLayout(null);
		addMovieGUI.setVisible(false);
		
		final JPanel addGameGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(addGameGUI, "name_421289405843848");
		addGameGUI.setLayout(null);
		addGameGUI.setVisible(false);
		
		final JPanel editItemGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(editItemGUI, "name_422075738368059");
		editItemGUI.setLayout(null);
		editItemGUI.setVisible(false);
		
		final JPanel RentByGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(RentByGUI, "name_343961188531607");
		RentByGUI.setLayout(null);
		RentByGUI.setVisible(false);

		final JPanel ViewRentablesGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(ViewRentablesGUI, "name_344775575954663");
		ViewRentablesGUI.setLayout(null);
		ViewRentablesGUI.setVisible(false);
		
		final JPanel UserReturnGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(UserReturnGUI, "name_343797561662187");
		UserReturnGUI.setLayout(null);
		UserReturnGUI.setVisible(false);
		
		final JPanel UserHomeGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(UserHomeGUI, "name_340728658794756");
		UserHomeGUI.setLayout(null);
		UserHomeGUI.setVisible(false);
		
		final JPanel UserAccountInfoGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(UserAccountInfoGUI, "name_342879160723643");
		GridBagLayout gbl_UserAccountInfoGUI = new GridBagLayout();
		gbl_UserAccountInfoGUI.columnWidths = new int[]{34, 52, 0, 0, 11, 0, 65, 0};
		gbl_UserAccountInfoGUI.rowHeights = new int[]{35, 14, 14, 14, 14, 14, 14, 14, 14, 19, 19, 23, 0, 0, 0};
		gbl_UserAccountInfoGUI.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_UserAccountInfoGUI.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		UserAccountInfoGUI.setLayout(gbl_UserAccountInfoGUI);
		UserAccountInfoGUI.setVisible(false);
		
		final JPanel UserEditAccountInfoGUI = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(UserEditAccountInfoGUI, "name_341664864460551");
		GridBagLayout gbl_UserEditAccountInfoGUI = new GridBagLayout();
		gbl_UserEditAccountInfoGUI.columnWidths = new int[]{38, 98, 0, 182, 0, 11, 50, 118, 47, 88, 37, 189, 0};
		gbl_UserEditAccountInfoGUI.rowHeights = new int[]{45, 20, 23, 20, 12, 25, 19, 20, 20, 14, 23, 18, 12, 0, 0, 0, 0};
		gbl_UserEditAccountInfoGUI.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_UserEditAccountInfoGUI.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		UserEditAccountInfoGUI.setLayout(gbl_UserEditAccountInfoGUI);
		UserEditAccountInfoGUI.setVisible(false);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(114, 51, 140, 20);
		RedBox.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(27, 54, 77, 14);
		RedBox.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(27, 84, 77, 14);
		RedBox.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (userMap.get(usernameTextField.getText()) == null){
					JOptionPane.showMessageDialog(null, "Invalid User");
				}
				else if (userMap.get(usernameTextField.getText()) != null){
					if (String.valueOf(passwordField.getPassword()).equals(userMap.get(usernameTextField.getText()).getPassword())){
						currentUser = userMap.get(usernameTextField.getText());
						rentablesMap = currentUser.returnRentables();
						RedBox.setVisible(false);
						UserHomeGUI.setVisible(true);
					}
					else{
						JOptionPane.showMessageDialog(null, "Incorrect Password");
					}
				}
			}
		});
		btnLogin.setBounds(275, 49, 89, 23);
		RedBox.add(btnLogin);
		
		final JButton btnRentGettype = new JButton("Rent getType()");
		btnRentGettype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentRentable == "Movie"){
					if (movieMap.containsKey(rentableIDTextField.getText())){
						if (movieMap.get(rentableIDTextField.getText()).getRentedStatus()){
							JOptionPane.showMessageDialog(null, "Movie Already Rented");
							rentableIDTextField.setText("");
						}
						else{
							currentUser.rentAdd(movieMap.get(rentableIDTextField.getText()));
							rentableIDTextField.setText("");
							ViewRentablesGUI.setVisible(false);
							RentByGUI.setVisible(true);
						}
					}
				}else if (currentRentable == "VideoGame"){
					if (videogameMap.containsKey(rentableIDTextField.getText())){
						if (videogameMap.get(rentableIDTextField.getText()).getRentedStatus()){
							JOptionPane.showMessageDialog(null, "Video Game Already Rented");
							rentableIDTextField.setText("");
						}
						else{
							currentUser.rentAdd(videogameMap.get(rentableIDTextField.getText()));
							rentableIDTextField.setText("");
							ViewRentablesGUI.setVisible(false);
							RentByGUI.setVisible(true);
						}
					}
				}
			}
		});
		btnRentGettype.setBounds(152, 322, 149, 23);
		ViewRentablesGUI.add(btnRentGettype);
		
		final JLabel lblGetcategory = new JLabel("getCategory()");
		lblGetcategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblGetcategory.setBounds(56, 30, 245, 14);
		ViewRentablesGUI.add(lblGetcategory);
		
		JButton btnReturning = new JButton("Just Returning an Item??\r\n\t   Click here!");
		btnReturning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnGUI.setVisible(true);
				RedBox.setVisible(false);
				frmWelcomeToRedbox.setTitle("Return");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);

				
				
			}
		});
		btnReturning.setBounds(180, 167, 294, 23);
		RedBox.add(btnReturning);
		
		JButton btnLoginAsAdmin = new JButton("Login as Admin");
		btnLoginAsAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (userMap.get(usernameTextField.getText()) == null){
					JOptionPane.showMessageDialog(null, "Invalid Admin");
				}
				else if (userMap.get(usernameTextField.getText()) != null){
					if (String.valueOf(passwordField.getPassword()).equals(userMap.get(usernameTextField.getText()).getPassword())){
						if (userMap.get(usernameTextField.getText()).getAdminRights()){
							currentUser = userMap.get(usernameTextField.getText());
							RedBox.setVisible(false);
							AdminHomeGUI.setVisible(true);
							frmWelcomeToRedbox.setTitle("Admin Home");
							frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
						}
					}
					else{
						JOptionPane.showMessageDialog(null, "Incorrect Password");
					}
				}
			}
		});
		btnLoginAsAdmin.setBounds(27, 167, 125, 23);
		RedBox.add(btnLoginAsAdmin);
		
		JButton btnRegisterNow = new JButton("Register Now!");
		btnRegisterNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstNameTextField.setText(null);
				lastNameTextField.setText(null);
				IDTextField.setText(null);
				emailTextField.setText(null);
				addressTextField.setText(null);
				cityTextField.setText(null);
				stateTextField.setText(null);
				zipTextField.setText(null);
				balanceTextField.setText(null);
				passwordTextField.setText(null);
				checkPasswordTextField.setText(null);		
				phoneNumberTextField.setText(null);
				
				RedBox.setVisible(false);
				NewUserGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Welcome to RedBox!");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);			
			}
		});
		btnRegisterNow.setBounds(275, 80, 154, 23);
		RedBox.add(btnRegisterNow);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(114, 81, 140, 20);
		RedBox.add(passwordField);
		
		JTextArea accountsTextArea = new JTextArea();
		accountsTextArea.setBounds(39, 53, 419, 222);
		accountsTextArea.setEditable(false);
		AccountsGUI.add(accountsTextArea);
		
		JButton btnViewAccounts = new JButton("View Accounts");
		btnViewAccounts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountsGUI.setVisible(true);
				AdminHomeGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Accounts");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				currentAccountList = rbMethods.sortAccounts(userMap);
				idTextBox.setText("");
				accountsTextArea.setText("");
				accountsTextArea.append(" ID - First - Last "+System.getProperty("line.separator")+System.getProperty("line.separator"));
				for (User user1 : currentAccountList){
					accountsTextArea.append(user1.getID()+"-"+user1.getFirstName()+"-"+user1.getLastName()+System.getProperty("line.separator"));
				}
			}
		});
		btnViewAccounts.setBounds(51, 24, 124, 23);
		AdminHomeGUI.add(btnViewAccounts);
		
		JTextArea movieInventoryTextArea = new JTextArea();
		movieInventoryTextArea.setEditable(false);
		movieInventoryTextArea.setBounds(20, 55, 261, 213);
		InventoryAdminGUI.add(movieInventoryTextArea);
		
		JTextArea videogameInventroyTextArea = new JTextArea();
		videogameInventroyTextArea.setEditable(false);
		videogameInventroyTextArea.setBounds(301, 55, 261, 213);
		InventoryAdminGUI.add(videogameInventroyTextArea);
		
		JButton btnEditInventory = new JButton("Edit Inventory");
		btnEditInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movieInventoryTextArea.setText("");
				movieInventoryTextArea.append(" ID "+"-"+" Title "+"-"+" Price "+"-"+" IsRented "+System.getProperty("line.separator")+System.getProperty("line.separator"));
				videogameInventroyTextArea.setText("");
				videogameInventroyTextArea.append(" ID "+"-"+" Title "+"-"+" Price "+"-"+" IsRented "+System.getProperty("line.separator")+System.getProperty("line.separator"));
				for (Movie mov : movieMap.values()){
					movieInventoryTextArea.append(mov.getID()+"-"+mov.getTitle()+"-"+mov.getPrice()+"-"+String.valueOf(mov.getRentedStatus())+System.getProperty("line.separator"));
				}
				for (VideoGame vg : videogameMap.values()){
					videogameInventroyTextArea.append(vg.getID()+"-"+vg.getTitle()+"-"+vg.getPrice()+"-"+String.valueOf(vg.getRentedStatus())+System.getProperty("line.separator"));
				}
				InventoryAdminGUI.setVisible(true);
				AdminHomeGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Inventory");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				
				
				
			}
		});
		btnEditInventory.setBounds(51, 57, 124, 23);
		AdminHomeGUI.add(btnEditInventory);
		
		JButton btnLogOff = new JButton("Log Off");
		btnLogOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					rbMethods.returnMovieMap(movieMap);
					rbMethods.returnUserMap(userMap);
					rbMethods.returnVideoGameMap(videogameMap);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				currentUser = null;
				passwordField.setText(null);
				usernameTextField.setText(null);
				RedBox.setVisible(true);
				AdminHomeGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Welcome to RedBox!");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				
				
				
				
			}
		});
		btnLogOff.setBounds(210, 43, 101, 23);
		AdminHomeGUI.add(btnLogOff);
		
		JLabel lblCurrentAccounts = new JLabel("Current User Accounts:");
		lblCurrentAccounts.setBounds(29, 28, 169, 14);
		AccountsGUI.add(lblCurrentAccounts);
		
		idTextBox = new JTextField();
		idTextBox.setBounds(62, 284, 119, 26);
		AccountsGUI.add(idTextBox);
		idTextBox.setColumns(10);
		
		JLabel lblId_1 = new JLabel("I.D.");
		lblId_1.setBounds(29, 287, 23, 20);
		AccountsGUI.add(lblId_1);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(47, 35, 89, 14);
		AccountDetailsAsAdminGUI.add(lblName);
		
		JLabel lblUsername_1 = new JLabel("Username:");
		lblUsername_1.setBounds(47, 60, 89, 14);
		AccountDetailsAsAdminGUI.add(lblUsername_1);
		
		JLabel lblEmailAddress = new JLabel("email address:");
		lblEmailAddress.setBounds(47, 86, 110, 14);
		AccountDetailsAsAdminGUI.add(lblEmailAddress);
		
		JLabel lblAddress = new JLabel("address:");
		lblAddress.setBounds(47, 111, 80, 14);
		AccountDetailsAsAdminGUI.add(lblAddress);
		
		JLabel lblCity = new JLabel("city:");
		lblCity.setBounds(47, 136, 80, 14);
		AccountDetailsAsAdminGUI.add(lblCity);
		
		JLabel lblState = new JLabel("state:");
		lblState.setBounds(47, 161, 89, 14);
		AccountDetailsAsAdminGUI.add(lblState);
		
		JLabel lblZip = new JLabel("zip:");
		lblZip.setBounds(47, 186, 110, 14);
		AccountDetailsAsAdminGUI.add(lblZip);
		
		JLabel lblcallGetname = new JLabel("\"call getName()\"");
		lblcallGetname.setBounds(179, 35, 166, 14);
		AccountDetailsAsAdminGUI.add(lblcallGetname);
		
		JLabel lblGetusername = new JLabel("getUsername()");
		lblGetusername.setBounds(179, 60, 166, 14);
		AccountDetailsAsAdminGUI.add(lblGetusername);
		
		JLabel lblGetemailaddress = new JLabel("getEmailAddress()");
		lblGetemailaddress.setBounds(179, 86, 166, 14);
		AccountDetailsAsAdminGUI.add(lblGetemailaddress);
		
		JLabel lblGetaddress = new JLabel("getAddress()");
		lblGetaddress.setBounds(179, 111, 166, 14);
		AccountDetailsAsAdminGUI.add(lblGetaddress);
		
		JLabel lblGetcity = new JLabel("getCity()");
		lblGetcity.setBounds(179, 136, 166, 14);
		AccountDetailsAsAdminGUI.add(lblGetcity);
		
		JLabel lblGetstate = new JLabel("getState()");
		lblGetstate.setBounds(179, 161, 166, 14);
		AccountDetailsAsAdminGUI.add(lblGetstate);
		
		JLabel lblGetzip = new JLabel("getZip()");
		lblGetzip.setBounds(179, 186, 166, 14);
		AccountDetailsAsAdminGUI.add(lblGetzip);
		
		JLabel lblCurrentRentals = new JLabel("Currently Renting:");
		lblCurrentRentals.setBounds(47, 211, 142, 14);
		AccountDetailsAsAdminGUI.add(lblCurrentRentals);
		
		JTextArea currentRentablesTextArea = new JTextArea();
		currentRentablesTextArea.setBounds(47, 236, 263, 94);
		currentRentablesTextArea.setEditable(false);
		AccountDetailsAsAdminGUI.add(currentRentablesTextArea);
		
		JButton btnViewDetails = new JButton("View Details");
		btnViewDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (userMap.containsKey(idTextBox.getText())) {
					detailUser = userMap.get(idTextBox.getText());
					
					lblcallGetname.setText(detailUser.getFirstName()+" "+detailUser.getLastName()); 
					lblGetusername.setText(detailUser.getID());
					lblGetemailaddress .setText(detailUser.getEmail());
					lblGetaddress.setText(detailUser.getAddress());
					lblGetcity.setText(detailUser.getCity());
					lblGetstate.setText(detailUser.getState());
					lblGetzip.setText(detailUser.getZip());
					for (RentableInterface ri1 : detailUser.returnRentables().values()){
						currentRentablesTextArea.append(ri1.getID()+"-"+ri1.getTitle()+"-"+ri1.getPrice()+System.getProperty("line.separator"));
					}
					AccountDetailsAsAdminGUI.setVisible(true);
					AccountsGUI.setVisible(false);
					frmWelcomeToRedbox.setTitle("Accounts");
					frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				}
				else{
					JOptionPane.showMessageDialog(null, "Invalid ID");
				}
			}
		});
		btnViewDetails.setBounds(208, 286, 119, 23);
		AccountsGUI.add(btnViewDetails);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (userMap.containsKey(idTextBox.getText())){
					int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?",null, JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.YES_OPTION) {
						userMap.remove(idTextBox.getText());
						try {
							rbMethods.returnUserMap(userMap);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						idTextBox.setText("");
						AccountsGUI.setVisible(false);
						AdminHomeGUI.setVisible(true);
						frmWelcomeToRedbox.setTitle("Admin Home");
						frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
					} else
						idTextBox.setText("");
				}
				else{
					JOptionPane.showMessageDialog(null,"Invalid User");
					idTextBox.setText("");
				}
			}
		});
		btnDelete.setBounds(352, 286, 106, 23);
		AccountsGUI.add(btnDelete);
		
		JButton btnAdminHome = new JButton("Back/Admin Home");
		btnAdminHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountsGUI.setVisible(false);
				AdminHomeGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Admin Home");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
			}
		});
		btnAdminHome.setBounds(282, 349, 176, 23);
		AccountsGUI.add(btnAdminHome);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountDetailsAsAdminGUI.setVisible(false);
				AccountsGUI.setVisible(true);
				idTextBox.setText("");
				frmWelcomeToRedbox.setTitle("Acounts");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
			}
		});
		btnBack.setBounds(47, 341, 104, 23);
		AccountDetailsAsAdminGUI.add(btnBack);
		
		JButton btnAdminHome_1 = new JButton("Admin Home");
		btnAdminHome_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountDetailsAsAdminGUI.setVisible(false);
				AdminHomeGUI.setVisible(true);
				idTextBox.setText("");
				frmWelcomeToRedbox.setTitle("Admin Home");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
			}
		});
		btnAdminHome_1.setBounds(193, 341, 117, 23);
		AccountDetailsAsAdminGUI.add(btnAdminHome_1);
		
		JLabel lblCurrentInventory = new JLabel("Current Inventory:");
		lblCurrentInventory.setBounds(20, 11, 105, 14);
		InventoryAdminGUI.add(lblCurrentInventory);
		
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				addTypeGUI.setVisible(true);
//				InventoryAdminGUI.setVisible(false);
//				frmWelcomeToRedbox.setTitle("Type?");
//				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				// Not implemented
			}
		});
		btnAddItem.setBounds(403, 372, 105, 23);
		InventoryAdminGUI.add(btnAddItem);
		
		editRemvoeID = new JTextField();
		editRemvoeID.setBounds(117, 300, 105, 26);
		InventoryAdminGUI.add(editRemvoeID);
		editRemvoeID.setColumns(10);
		
		JButton btnRemoveItem = new JButton("Remove Item");
		btnRemoveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (movieMap.containsKey(editRemvoeID.getText())||videogameMap.containsKey(editRemvoeID.getText())){
					int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?",null, JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.YES_OPTION) {
						if (movieMap.containsKey(editRemvoeID.getText())){
							movieMap.remove(editRemvoeID.getText());
						}
						if (videogameMap.containsKey(editRemvoeID.getText())){
							videogameMap.remove(editRemvoeID.getText());
						}
						try {
							rbMethods.returnMovieMap(movieMap);
							rbMethods.returnVideoGameMap(videogameMap);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						editRemvoeID.setText("");
						InventoryAdminGUI.setVisible(false);
						AdminHomeGUI.setVisible(true);
						frmWelcomeToRedbox.setTitle("Admin Home");
						frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
					} else
						editRemvoeID.setText("");
				}
				else{
					JOptionPane.showMessageDialog(null,"Invalid ID");
					editRemvoeID.setText("");
				}
			}
		});
		btnRemoveItem.setBounds(385, 302, 123, 23);
		InventoryAdminGUI.add(btnRemoveItem);
		
		JButton btnBackadminHome = new JButton("Back/Admin Home");
		btnBackadminHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryAdminGUI.setVisible(false);
				AdminHomeGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Admin Home");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				
				
				
				
			}
		});
		btnBackadminHome.setBounds(41, 372, 166, 23);
		InventoryAdminGUI.add(btnBackadminHome);
		
		JButton btnEditItem = new JButton("Edit Item");
		btnEditItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				InventoryAdminGUI.setVisible(false);
//				editItemGUI.setVisible(true);
//				frmWelcomeToRedbox.setTitle("Edit + 'getItemTitle()' maybe");
//				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				//not implemented
			}
		});
		btnEditItem.setBounds(252, 302, 105, 23);
		InventoryAdminGUI.add(btnEditItem);
		
		JLabel lblDvd = new JLabel("Movies:");
		lblDvd.setBounds(20, 34, 46, 14);
		InventoryAdminGUI.add(lblDvd);
		
		JLabel lblGames = new JLabel("Games:");
		lblGames.setBounds(291, 34, 46, 14);
		InventoryAdminGUI.add(lblGames);
		
		JLabel lblId_2 = new JLabel("I.D. ");
		lblId_2.setBounds(81, 303, 69, 20);
		InventoryAdminGUI.add(lblId_2);
		
		JLabel lblChooseType = new JLabel("Choose type of item to add: ");
		lblChooseType.setBounds(32, 44, 198, 14);
		addTypeGUI.add(lblChooseType);
		
		JButton btnMovie = new JButton("Movie");
		btnMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTypeGUI.setVisible(false);
				addMovieGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Add Movie");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				
				
				
				
			}
		});
		btnMovie.setBounds(42, 69, 89, 23);
		addTypeGUI.add(btnMovie);
		
		JButton btnGame = new JButton("Game");
		btnGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTypeGUI.setVisible(false);
				addGameGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Add Game");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				
				
				
			}
		});
		btnGame.setBounds(141, 69, 89, 23);
		addTypeGUI.add(btnGame);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryAdminGUI.setVisible(true);
				addTypeGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Inventory");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				
				
				
				
			}
		});
		btnBack_1.setBounds(42, 134, 89, 23);
		addTypeGUI.add(btnBack_1);
		
		JButton btnAdminHome_2 = new JButton("Admin Home");
		btnAdminHome_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomeGUI.setVisible(true);
				addTypeGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Admin Home");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				
				
				
			}
		});
		btnAdminHome_2.setBounds(141, 134, 113, 23);
		addTypeGUI.add(btnAdminHome_2);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(42, 35, 61, 14);
		addMovieGUI.add(lblTitle);
		
		JLabel lblGenre = new JLabel("Genre:");
		lblGenre.setBounds(42, 60, 61, 14);
		addMovieGUI.add(lblGenre);
		
		JLabel lblRating = new JLabel("Rating:");
		lblRating.setBounds(42, 85, 61, 14);
		addMovieGUI.add(lblRating);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(42, 110, 61, 14);
		addMovieGUI.add(lblType);
		
		titleTextField = new JTextField();
		titleTextField.setBounds(125, 32, 200, 20);
		addMovieGUI.add(titleTextField);
		titleTextField.setColumns(10);
		
		genreTextField = new JTextField();
		genreTextField.setBounds(125, 57, 200, 20);
		addMovieGUI.add(genreTextField);
		genreTextField.setColumns(10);
		
		ratingTextField = new JTextField();
		ratingTextField.setBounds(125, 82, 200, 20);
		addMovieGUI.add(ratingTextField);
		ratingTextField.setColumns(10);
		
		typeTextField = new JTextField();
		typeTextField.setText("");
		typeTextField.setBounds(125, 107, 200, 20);
		addMovieGUI.add(typeTextField);
		typeTextField.setColumns(10);
		
		JButton btnBack_2 = new JButton("Cancel");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryAdminGUI.setVisible(true);
				addMovieGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Inventory");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				
				
				
			}
		});
		btnBack_2.setBounds(42, 229, 89, 23);
		addMovieGUI.add(btnBack_2);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryAdminGUI.setVisible(true);
				addMovieGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Inventory");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				JOptionPane.showMessageDialog(null, "Action not implemented yet!!!");
				
				
				
			}
		});
		btnAdd.setBounds(186, 229, 89, 23);
		addMovieGUI.add(btnAdd);
		
		JLabel lblPlot = new JLabel("Plot:");
		lblPlot.setBounds(42, 135, 61, 14);
		addMovieGUI.add(lblPlot);
		
		textField_7 = new JTextField();
		textField_7.setBounds(125, 132, 200, 20);
		addMovieGUI.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTitle_2 = new JLabel("Title:");
		lblTitle_2.setBounds(28, 29, 59, 14);
		addGameGUI.add(lblTitle_2);
		
		JLabel lblCategory = new JLabel("Category:");
		lblCategory.setBounds(28, 54, 82, 14);
		addGameGUI.add(lblCategory);
		
		JLabel lblRating_1 = new JLabel("Rating:");
		lblRating_1.setBounds(28, 79, 82, 14);
		addGameGUI.add(lblRating_1);
		
		JLabel lblPlatform = new JLabel("Platform:");
		lblPlatform.setBounds(28, 104, 82, 14);
		addGameGUI.add(lblPlatform);
		
		JLabel lblSummary = new JLabel("Summary:");
		lblSummary.setBounds(28, 129, 82, 14);
		addGameGUI.add(lblSummary);
		
		addgameTitleTextField = new JTextField();
		addgameTitleTextField.setBounds(120, 26, 220, 20);
		addGameGUI.add(addgameTitleTextField);
		addgameTitleTextField.setColumns(10);
		
		gameCategTextField = new JTextField();
		gameCategTextField.setBounds(120, 51, 220, 20);
		addGameGUI.add(gameCategTextField);
		gameCategTextField.setColumns(10);
		
		gameRatingTextField = new JTextField();
		gameRatingTextField.setBounds(120, 76, 220, 20);
		addGameGUI.add(gameRatingTextField);
		gameRatingTextField.setColumns(10);
		
		platformTextField = new JTextField();
		platformTextField.setBounds(120, 101, 220, 20);
		addGameGUI.add(platformTextField);
		platformTextField.setColumns(10);
		
		JButton btnBack_3 = new JButton("Cancel");
		btnBack_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryAdminGUI.setVisible(true);
				addGameGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Inventory");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				
				
				
			}
		});
		btnBack_3.setBounds(28, 229, 89, 23);
		addGameGUI.add(btnBack_3);
		
		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryAdminGUI.setVisible(true);
				addGameGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Inventory");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				JOptionPane.showMessageDialog(null, "Action not implemented yet!!!");
				
				
				
			}
		});
		btnAdd_1.setBounds(185, 229, 89, 23);
		addGameGUI.add(btnAdd_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(120, 126, 220, 20);
		addGameGUI.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblTitle_1 = new JLabel("Title:");
		lblTitle_1.setBounds(38, 44, 46, 14);
		editItemGUI.add(lblTitle_1);
		
		JLabel lblGenrecategory = new JLabel("Genre/Category:");
		lblGenrecategory.setBounds(38, 69, 101, 14);
		editItemGUI.add(lblGenrecategory);
		
		JLabel lblRating_2 = new JLabel("Rating:");
		lblRating_2.setBounds(38, 94, 70, 14);
		editItemGUI.add(lblRating_2);
		
		JLabel lblTypePlatform = new JLabel("Type/Platform:");
		lblTypePlatform.setBounds(38, 119, 94, 14);
		editItemGUI.add(lblTypePlatform);
		
		JLabel lblPlotsummary = new JLabel("Plot/Summary:");
		lblPlotsummary.setBounds(38, 144, 94, 14);
		editItemGUI.add(lblPlotsummary);
		
		JLabel lblCurrent = new JLabel("Current:");
		lblCurrent.setBounds(149, 11, 46, 14);
		editItemGUI.add(lblCurrent);
		
		JLabel lblgettitle = new JLabel("\"getTitle()\"");
		lblgettitle.setBounds(149, 44, 188, 14);
		editItemGUI.add(lblgettitle);
		
		JLabel lblgetgenreOrCategory = new JLabel("\"getGenre or Category()\"");
		lblgetgenreOrCategory.setBounds(149, 69, 188, 14);
		editItemGUI.add(lblgetgenreOrCategory);
		
		JLabel lblgetrating = new JLabel("\"getRating()\"");
		lblgetrating.setBounds(149, 94, 188, 14);
		editItemGUI.add(lblgetrating);
		
		JLabel lblgettypeOrPlatform = new JLabel("\"getType or Platform()\"");
		lblgettypeOrPlatform.setBounds(149, 119, 188, 14);
		editItemGUI.add(lblgettypeOrPlatform);
		
		JLabel lblChangeTo = new JLabel("Change To:");
		lblChangeTo.setBounds(363, 11, 70, 14);
		editItemGUI.add(lblChangeTo);
		
		changeTitleTextField = new JTextField();
		changeTitleTextField.setBounds(363, 41, 208, 20);
		editItemGUI.add(changeTitleTextField);
		changeTitleTextField.setColumns(10);
		
		changeGenCatTextField = new JTextField();
		changeGenCatTextField.setBounds(363, 66, 208, 20);
		editItemGUI.add(changeGenCatTextField);
		changeGenCatTextField.setColumns(10);
		
		changeRatingTextField = new JTextField();
		changeRatingTextField.setBounds(363, 91, 208, 20);
		editItemGUI.add(changeRatingTextField);
		changeRatingTextField.setColumns(10);
		
		changeTypPlatTextField = new JTextField();
		changeTypPlatTextField.setBounds(363, 116, 208, 20);
		editItemGUI.add(changeTypPlatTextField);
		changeTypPlatTextField.setColumns(10);
		
		JButton btnSubmitChanges = new JButton("Submit Changes");
		btnSubmitChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryAdminGUI.setVisible(true);
				editItemGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Inventory");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				JOptionPane.showMessageDialog(null, "Action not implemented yet!!!");
				
				
				
			}
		});
		btnSubmitChanges.setBounds(363, 251, 163, 23);
		editItemGUI.add(btnSubmitChanges);
		
		JButton btnBackCancel = new JButton("Back/Cancel");
		btnBackCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editRemvoeID.setText(null);
				InventoryAdminGUI.setVisible(true);
				editItemGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Inventory");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				
				
				
			}
		});
		btnBackCancel.setBounds(106, 251, 123, 23);
		editItemGUI.add(btnBackCancel);
		
		JLabel lblgetplotOrSummary = new JLabel("\"getPlot or Summary()\"");
		lblgetplotOrSummary.setBounds(149, 144, 208, 14);
		editItemGUI.add(lblgetplotOrSummary);
		
		textField_9 = new JTextField();
		textField_9.setBounds(363, 141, 208, 20);
		editItemGUI.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblCreateProfile = new JLabel("Create Profile");
		lblCreateProfile.setBounds(124, 11, 88, 14);
		NewUserGUI.add(lblCreateProfile);
		
		JLabel lblName_1 = new JLabel("Last Name:");
		lblName_1.setBounds(34, 63, 75, 14);
		NewUserGUI.add(lblName_1);
		
		JLabel lblUsername_2 = new JLabel("Username:");
		lblUsername_2.setBounds(34, 88, 75, 14);
		NewUserGUI.add(lblUsername_2);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(34, 113, 46, 14);
		NewUserGUI.add(lblEmail);
		
		JLabel lblAddress_1 = new JLabel("Address:");
		lblAddress_1.setBounds(34, 138, 75, 14);
		NewUserGUI.add(lblAddress_1);
		
		JLabel lblCity_1 = new JLabel("City:");
		lblCity_1.setBounds(34, 163, 46, 14);
		NewUserGUI.add(lblCity_1);
		
		JLabel lblState_1 = new JLabel("State:");
		lblState_1.setBounds(34, 188, 64, 14);
		NewUserGUI.add(lblState_1);
		
		JLabel lblZipcode = new JLabel("Zipcode:");
		lblZipcode.setBounds(34, 213, 93, 14);
		NewUserGUI.add(lblZipcode);
		
		JLabel lblStartingBalance = new JLabel("Starting Balance:");
		lblStartingBalance.setBounds(34, 238, 100, 14);
		NewUserGUI.add(lblStartingBalance);
		
		JLabel lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setBounds(34, 263, 93, 14);
		NewUserGUI.add(lblPassword_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password:");
		lblConfirmPassword.setBounds(34, 288, 118, 14);
		NewUserGUI.add(lblConfirmPassword);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RedBox.setVisible(true);
				NewUserGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Welcome to RedBox!");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
				
				
				
				
			}
		});
		btnCancel.setBounds(34, 353, 89, 23);
		NewUserGUI.add(btnCancel);
		
		firstNameTextField = new JTextField();
		firstNameTextField.setColumns(10);
		firstNameTextField.setBounds(153, 36, 179, 20);
		NewUserGUI.add(firstNameTextField);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setBounds(153, 60, 179, 20);
		NewUserGUI.add(lastNameTextField);
		lastNameTextField.setColumns(10);
		
		IDTextField = new JTextField();
		IDTextField.setColumns(10);
		IDTextField.setBounds(153, 85, 179, 20);
		NewUserGUI.add(IDTextField);
		
		emailTextField = new JTextField();
		emailTextField.setColumns(10);
		emailTextField.setBounds(153, 110, 179, 20);
		NewUserGUI.add(emailTextField);
		
		addressTextField = new JTextField();
		addressTextField.setColumns(10);
		addressTextField.setBounds(153, 135, 179, 20);
		NewUserGUI.add(addressTextField);
		
		cityTextField = new JTextField();
		cityTextField.setColumns(10);
		cityTextField.setBounds(153, 160, 179, 20);
		NewUserGUI.add(cityTextField);
		
		stateTextField = new JTextField();
		stateTextField.setColumns(10);
		stateTextField.setBounds(153, 185, 179, 20);
		NewUserGUI.add(stateTextField);
		
		zipTextField = new JTextField();
		zipTextField.setColumns(10);
		zipTextField.setBounds(153, 210, 179, 20);
		NewUserGUI.add(zipTextField);
		
		balanceTextField = new JTextField();
		balanceTextField.setColumns(10);
		balanceTextField.setBounds(153, 235, 179, 20);
		NewUserGUI.add(balanceTextField);
		
		passwordTextField = new JTextField();
		passwordTextField.setColumns(10);
		passwordTextField.setBounds(153, 260, 179, 20);
		NewUserGUI.add(passwordTextField);
		
		checkPasswordTextField = new JTextField();
		checkPasswordTextField.setColumns(10);
		checkPasswordTextField.setBounds(153, 285, 179, 20);
		NewUserGUI.add(checkPasswordTextField);
		
		phoneNumberTextField = new JTextField();
		phoneNumberTextField.setColumns(10);
		phoneNumberTextField.setBounds(153, 310, 179, 20);
		NewUserGUI.add(phoneNumberTextField);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (passwordTextField.getText().equals(checkPasswordTextField.getText())){
					User temp = new User(IDTextField.getText(), passwordTextField.getText());
					temp.setFirstName(firstNameTextField.getText());
					temp.setLastName(lastNameTextField.getText());
					temp.setEmail(emailTextField.getText());
					temp.setAddress(addressTextField.getText());
					temp.setCity(cityTextField.getText());
					temp.setState(stateTextField.getText());
					temp.setZip(zipTextField.getText());
					temp.setBalance(Double.valueOf(balanceTextField.getText()));
					temp.setAdminRights(false);
					temp.setPhoneNumber(phoneNumberTextField.getText());
					userMap.put(temp.getID(), temp);
					RedBox.setVisible(true);
					NewUserGUI.setVisible(false);
					try {
						rbMethods.returnUserMap(userMap);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "Passwords do not match");
				}
			}
		});
		btnSubmit.setBounds(203, 353, 89, 23);
		NewUserGUI.add(btnSubmit);
		
		JLabel label = new JLabel("$");
		label.setBounds(142, 238, 21, 14);
		NewUserGUI.add(label);		
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(34, 39, 75, 14);
		NewUserGUI.add(lblFirstName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setBounds(34, 313, 118, 14);
		NewUserGUI.add(lblPhoneNumber);
		
		JLabel lblRentedItemId = new JLabel("Rent Item I.D. ");
		lblRentedItemId.setBounds(52, 37, 128, 14);
		ReturnGUI.add(lblRentedItemId);
		
		JLabel lblUsername_3 = new JLabel("Username:");
		lblUsername_3.setBounds(52, 75, 164, 14);
		ReturnGUI.add(lblUsername_3);
		
		rentItemIDTextField = new JTextField();
		rentItemIDTextField.setBounds(195, 34, 164, 20);
		ReturnGUI.add(rentItemIDTextField);
		rentItemIDTextField.setColumns(10);
		
		rentUserIDTextField = new JTextField();
		rentUserIDTextField.setBounds(195, 72, 164, 20);
		ReturnGUI.add(rentUserIDTextField);
		rentUserIDTextField.setColumns(10);
		
		JButton btnCancel_1 = new JButton("Cancel");
		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rentItemIDTextField.setText("");
				rentUserIDTextField.setText("");
				RedBox.setVisible(true);
				ReturnGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Welcome to RedBox!");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
			}
		});
		btnCancel_1.setBounds(52, 142, 89, 23);
		ReturnGUI.add(btnCancel_1);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User tempReturnUser;
				Map<String,RentableInterface> tempReturnMap;
				if (userMap.containsKey(rentUserIDTextField.getText())){
					tempReturnUser = userMap.get(rentUserIDTextField.getText());
					tempReturnMap = tempReturnUser.returnRentables();
					if (tempReturnMap.containsKey(rentItemIDTextField.getText())){
						if (tempReturnMap.get(rentItemIDTextField.getText()).getClass().equals(Movie.class)){
							movieMap.get(rentItemIDTextField.getText()).setRentedStatus(false);
						}
						if (tempReturnMap.get(rentItemIDTextField.getText()).getClass().equals(VideoGame.class)){
							videogameMap.get(rentItemIDTextField.getText()).setRentedStatus(false);
						}
						tempReturnUser.rentRemove(tempReturnMap.get(rentItemIDTextField.getText()));
					}else{
						JOptionPane.showMessageDialog(null, "Invalid ID");
					}
				}else{
					JOptionPane.showMessageDialog(null, "Invalid User");
				}
				rentItemIDTextField.setText("");
				rentUserIDTextField.setText("");
				RedBox.setVisible(true);
				ReturnGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Welcome to RedBox!");
				frmWelcomeToRedbox.setExtendedState(Frame.MAXIMIZED_BOTH);
			}
		});
		btnReturn.setBounds(270, 142, 89, 23);
		ReturnGUI.add(btnReturn);
		
		JLabel lblFirstName_1 = new JLabel("First Name:");
		GridBagConstraints gbc_lblFirstName_1 = new GridBagConstraints();
		gbc_lblFirstName_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblFirstName_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName_1.gridx = 1;
		gbc_lblFirstName_1.gridy = 1;
		UserAccountInfoGUI.add(lblFirstName_1, gbc_lblFirstName_1);
		
		JLabel lblGetname = new JLabel("getFirstName()");
		GridBagConstraints gbc_lblGetname = new GridBagConstraints();
		gbc_lblGetname.anchor = GridBagConstraints.WEST;
		gbc_lblGetname.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetname.gridx = 4;
		gbc_lblGetname.gridy = 1;
		UserAccountInfoGUI.add(lblGetname, gbc_lblGetname);
		
		JLabel lblLastName = new JLabel("Last Name:");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.WEST;
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridx = 1;
		gbc_lblLastName.gridy = 2;
		UserAccountInfoGUI.add(lblLastName, gbc_lblLastName);
		
		JLabel lblGetlastname = new JLabel("getLastName()");
		GridBagConstraints gbc_lblGetlastname = new GridBagConstraints();
		gbc_lblGetlastname.anchor = GridBagConstraints.WEST;
		gbc_lblGetlastname.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetlastname.gridx = 4;
		gbc_lblGetlastname.gridy = 2;
		UserAccountInfoGUI.add(lblGetlastname, gbc_lblGetlastname);
		
		JLabel label_9 = new JLabel("Username:");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 1;
		gbc_label_9.gridy = 3;
		UserAccountInfoGUI.add(label_9, gbc_label_9);
		
		final JLabel lblGetusername_1 = new JLabel("getUsername()");
		GridBagConstraints gbc_lblGetusername_1 = new GridBagConstraints();
		gbc_lblGetusername_1.anchor = GridBagConstraints.WEST;
		gbc_lblGetusername_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetusername_1.gridx = 4;
		gbc_lblGetusername_1.gridy = 3;
		UserAccountInfoGUI.add(lblGetusername_1, gbc_lblGetusername_1);
		
		JLabel label_10 = new JLabel("Email:");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 1;
		gbc_label_10.gridy = 4;
		UserAccountInfoGUI.add(label_10, gbc_label_10);
		
		final JLabel lblGetemail = new JLabel("getEmail()");
		GridBagConstraints gbc_lblGetemail = new GridBagConstraints();
		gbc_lblGetemail.anchor = GridBagConstraints.WEST;
		gbc_lblGetemail.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetemail.gridx = 4;
		gbc_lblGetemail.gridy = 4;
		UserAccountInfoGUI.add(lblGetemail, gbc_lblGetemail);
		
		JLabel lblPhoneNumber_1 = new JLabel("Phone Number:");
		GridBagConstraints gbc_lblPhoneNumber_1 = new GridBagConstraints();
		gbc_lblPhoneNumber_1.anchor = GridBagConstraints.WEST;
		gbc_lblPhoneNumber_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhoneNumber_1.gridx = 1;
		gbc_lblPhoneNumber_1.gridy = 5;
		UserAccountInfoGUI.add(lblPhoneNumber_1, gbc_lblPhoneNumber_1);
		
		JLabel lblGetphonenumber = new JLabel("getPhoneNumber");
		GridBagConstraints gbc_lblGetphonenumber = new GridBagConstraints();
		gbc_lblGetphonenumber.anchor = GridBagConstraints.WEST;
		gbc_lblGetphonenumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetphonenumber.gridx = 4;
		gbc_lblGetphonenumber.gridy = 5;
		UserAccountInfoGUI.add(lblGetphonenumber, gbc_lblGetphonenumber);
		
		JLabel label_11 = new JLabel("Address:");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 1;
		gbc_label_11.gridy = 6;
		UserAccountInfoGUI.add(label_11, gbc_label_11);
		
		JLabel lblBalance = new JLabel("Balance");
		GridBagConstraints gbc_lblBalance = new GridBagConstraints();
		gbc_lblBalance.anchor = GridBagConstraints.BELOW_BASELINE;
		gbc_lblBalance.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBalance.insets = new Insets(0, 0, 5, 5);
		gbc_lblBalance.gridx = 1;
		gbc_lblBalance.gridy = 12;
		UserEditAccountInfoGUI.add(lblBalance, gbc_lblBalance);
		
		JLabel label_12 = new JLabel("$");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 2;
		gbc_label_12.gridy = 12;
		UserEditAccountInfoGUI.add(label_12, gbc_label_12);
		
		final JLabel lblGetstate_1 = new JLabel("getState()");
		GridBagConstraints gbc_lblGetstate_1 = new GridBagConstraints();
		gbc_lblGetstate_1.anchor = GridBagConstraints.WEST;
		gbc_lblGetstate_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetstate_1.gridx = 4;
		gbc_lblGetstate_1.gridy = 8;
		UserAccountInfoGUI.add(lblGetstate_1, gbc_lblGetstate_1);
		
		JLabel label_15 = new JLabel("Zipcode:");
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 1;
		gbc_label_15.gridy = 9;
		UserAccountInfoGUI.add(label_15, gbc_label_15);
		
		final JLabel lblGetzipcode = new JLabel("getZipcode()");
		GridBagConstraints gbc_lblGetzipcode = new GridBagConstraints();
		gbc_lblGetzipcode.anchor = GridBagConstraints.WEST;
		gbc_lblGetzipcode.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetzipcode.gridx = 4;
		gbc_lblGetzipcode.gridy = 9;
		UserAccountInfoGUI.add(lblGetzipcode, gbc_lblGetzipcode);
		
		final JLabel lblPassword_2 = new JLabel("Password:");
		GridBagConstraints gbc_lblPassword_2 = new GridBagConstraints();
		gbc_lblPassword_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblPassword_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword_2.gridwidth = 4;
		gbc_lblPassword_2.gridx = 1;
		gbc_lblPassword_2.gridy = 10;
		UserAccountInfoGUI.add(lblPassword_2, gbc_lblPassword_2);
		
		final JLabel lblGetpassword = new JLabel("getPassword()");
		GridBagConstraints gbc_lblGetpassword = new GridBagConstraints();
		gbc_lblGetpassword.anchor = GridBagConstraints.WEST;
		gbc_lblGetpassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetpassword.gridx = 4;
		gbc_lblGetpassword.gridy = 10;
		UserAccountInfoGUI.add(lblGetpassword, gbc_lblGetpassword);
		
		JLabel label_17 = new JLabel("Balance");
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_17.insets = new Insets(0, 0, 5, 5);
		gbc_label_17.gridx = 1;
		gbc_label_17.gridy = 11;
		UserAccountInfoGUI.add(label_17, gbc_label_17);
		
		JLabel label_18 = new JLabel("$");
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 3;
		gbc_label_18.gridy = 11;
		UserAccountInfoGUI.add(label_18, gbc_label_18);
		
		final JLabel lblGetbalance = new JLabel("getBalance()");
		GridBagConstraints gbc_lblGetbalance = new GridBagConstraints();
		gbc_lblGetbalance.anchor = GridBagConstraints.WEST;
		gbc_lblGetbalance.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetbalance.gridx = 4;
		gbc_lblGetbalance.gridy = 11;
		UserAccountInfoGUI.add(lblGetbalance, gbc_lblGetbalance);
		
		JLabel lblGetaddress_1 = new JLabel("getAddress()");
		GridBagConstraints gbc_lblGetaddress_1 = new GridBagConstraints();
		gbc_lblGetaddress_1.anchor = GridBagConstraints.WEST;
		gbc_lblGetaddress_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetaddress_1.gridx = 4;
		gbc_lblGetaddress_1.gridy = 6;
		UserAccountInfoGUI.add(lblGetaddress_1, gbc_lblGetaddress_1);
		
		JLabel label_13 = new JLabel("City:");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 1;
		gbc_label_13.gridy = 7;
		UserAccountInfoGUI.add(label_13, gbc_label_13);
		
		JLabel lblGetcity_1 = new JLabel("getCity()");
		GridBagConstraints gbc_lblGetcity_1 = new GridBagConstraints();
		gbc_lblGetcity_1.anchor = GridBagConstraints.WEST;
		gbc_lblGetcity_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetcity_1.gridx = 4;
		gbc_lblGetcity_1.gridy = 7;
		UserAccountInfoGUI.add(lblGetcity_1, gbc_lblGetcity_1);
		
		JLabel label_14 = new JLabel("State:");
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 1;
		gbc_label_14.gridy = 8;
		UserAccountInfoGUI.add(label_14, gbc_label_14);
				
		JButton btnNewButton = new JButton("Account Info");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblGetname.setText(currentUser.getFirstName());
				lblGetlastname.setText(currentUser.getLastName());
				lblGetusername_1.setText(currentUser.getID());
				lblGetemail.setText(currentUser.getEmail());
				lblGetaddress_1.setText(currentUser.getAddress());
				lblGetcity_1.setText(currentUser.getCity());
				lblGetstate_1.setText(currentUser.getState());
				lblGetzipcode.setText(currentUser.getZip());
				lblGetpassword.setText(currentUser.getPassword());
				lblGetbalance.setText(String.valueOf(currentUser.getBalance()));
				lblGetphonenumber.setText(currentUser.getPhoneNumber());
				UserAccountInfoGUI.setVisible(true);
				UserHomeGUI.setVisible(false);
			}
		});
		btnNewButton.setBounds(new Rectangle(330, 98, 160, 23));
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		UserHomeGUI.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rent Movie");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentRentable = "Movie";
				btnRentGettype.setText("Rent Movie");
				RentByGUI.setVisible(true);
				UserHomeGUI.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(330, 132, 160, 23);
		UserHomeGUI.add(btnNewButton_1);
		
		JTextArea userRenturnRentablesTextArea = new JTextArea();
		userRenturnRentablesTextArea.setBounds(41, 58, 264, 84);
		userRenturnRentablesTextArea.setEditable(false);
		UserReturnGUI.add(userRenturnRentablesTextArea);
		
		JButton userReturnButton = new JButton("Return Movie or Game");
		userReturnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userRenturnRentablesTextArea.setText("");
				for (RentableInterface ri1 : rentablesMap.values()){
					userRenturnRentablesTextArea.append(ri1.getID()+"-"+ri1.getTitle()+"-"+ri1.getPrice()+System.getProperty("line.separator"));
				}
				UserReturnGUI.setVisible(true);
				UserHomeGUI.setVisible(false);
			}
		});
		userReturnButton.setBounds(330, 200, 160, 23);
		UserHomeGUI.add(userReturnButton);
		
		JButton btnNewButton_3 = new JButton("Log Off");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					rbMethods.returnMovieMap(movieMap);
					rbMethods.returnUserMap(userMap);
					rbMethods.returnVideoGameMap(videogameMap);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				currentUser = null;
				RedBox.setVisible(true);
				UserHomeGUI.setVisible(false);
				passwordField.setText(null);
				usernameTextField.setText(null);
			}
		});
		btnNewButton_3.setBounds(330, 231, 160, 23);
		UserHomeGUI.add(btnNewButton_3);
		
		JButton btnRentGame = new JButton("Rent Video Game");
		btnRentGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentRentable = "VideoGame";
				btnRentGettype.setText("Rent Video Game");
				RentByGUI.setVisible(true);
				UserHomeGUI.setVisible(false);
			}
		});
		btnRentGame.setBounds(330, 166, 160, 23);
		UserHomeGUI.add(btnRentGame);
		
		
		
		JLabel lblFirstName_2 = new JLabel("First Name:");
		GridBagConstraints gbc_lblFirstName_2 = new GridBagConstraints();
		gbc_lblFirstName_2.anchor = GridBagConstraints.WEST;
		gbc_lblFirstName_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName_2.gridx = 1;
		gbc_lblFirstName_2.gridy = 1;
		UserEditAccountInfoGUI.add(lblFirstName_2, gbc_lblFirstName_2);
		
		editFirstNameTextField = new JTextField();
		editFirstNameTextField.setColumns(10);
		GridBagConstraints gbc_editFirstNameTextField = new GridBagConstraints();
		gbc_editFirstNameTextField.anchor = GridBagConstraints.NORTH;
		gbc_editFirstNameTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_editFirstNameTextField.insets = new Insets(0, 0, 5, 5);
		gbc_editFirstNameTextField.gridx = 3;
		gbc_editFirstNameTextField.gridy = 1;
		UserEditAccountInfoGUI.add(editFirstNameTextField, gbc_editFirstNameTextField);
		
		JLabel lblLastName_1 = new JLabel("Last Name:");
		GridBagConstraints gbc_lblLastName_1 = new GridBagConstraints();
		gbc_lblLastName_1.anchor = GridBagConstraints.WEST;
		gbc_lblLastName_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName_1.gridx = 1;
		gbc_lblLastName_1.gridy = 2;
		UserEditAccountInfoGUI.add(lblLastName_1, gbc_lblLastName_1);
		
		editLastNameTextField = new JTextField();
		GridBagConstraints gbc_editLastNameTextField = new GridBagConstraints();
		gbc_editLastNameTextField.insets = new Insets(0, 0, 5, 5);
		gbc_editLastNameTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_editLastNameTextField.gridx = 3;
		gbc_editLastNameTextField.gridy = 2;
		UserEditAccountInfoGUI.add(editLastNameTextField, gbc_editLastNameTextField);
		editLastNameTextField.setColumns(10);
		
		JLabel label_3 = new JLabel("Username:");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.WEST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 3;
		UserEditAccountInfoGUI.add(label_3, gbc_label_3);
		
		editIDTextField = new JTextField();
		editIDTextField.setColumns(10);
		GridBagConstraints gbc_editIDTextField = new GridBagConstraints();
		gbc_editIDTextField.anchor = GridBagConstraints.NORTH;
		gbc_editIDTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_editIDTextField.insets = new Insets(0, 0, 5, 5);
		gbc_editIDTextField.gridx = 3;
		gbc_editIDTextField.gridy = 3;
		UserEditAccountInfoGUI.add(editIDTextField, gbc_editIDTextField);
		
		JLabel label_4 = new JLabel("Email:");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.WEST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 4;
		UserEditAccountInfoGUI.add(label_4, gbc_label_4);
		
		editEmailTextField = new JTextField();
		editEmailTextField.setColumns(10);
		GridBagConstraints gbc_editEmailTextField = new GridBagConstraints();
		gbc_editEmailTextField.anchor = GridBagConstraints.NORTH;
		gbc_editEmailTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_editEmailTextField.insets = new Insets(0, 0, 5, 5);
		gbc_editEmailTextField.gridx = 3;
		gbc_editEmailTextField.gridy = 4;
		UserEditAccountInfoGUI.add(editEmailTextField, gbc_editEmailTextField);
		
		JLabel lblPhoneNumber_2 = new JLabel("Phone Number:");
		GridBagConstraints gbc_lblPhoneNumber_2 = new GridBagConstraints();
		gbc_lblPhoneNumber_2.anchor = GridBagConstraints.WEST;
		gbc_lblPhoneNumber_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhoneNumber_2.gridx = 1;
		gbc_lblPhoneNumber_2.gridy = 5;
		UserEditAccountInfoGUI.add(lblPhoneNumber_2, gbc_lblPhoneNumber_2);
		
		editPhoneNumberTextField = new JTextField();
		GridBagConstraints gbc_editPhoneNumberTextField = new GridBagConstraints();
		gbc_editPhoneNumberTextField.insets = new Insets(0, 0, 5, 5);
		gbc_editPhoneNumberTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_editPhoneNumberTextField.gridx = 3;
		gbc_editPhoneNumberTextField.gridy = 5;
		UserEditAccountInfoGUI.add(editPhoneNumberTextField, gbc_editPhoneNumberTextField);
		editPhoneNumberTextField.setColumns(10);
		
		JLabel label_5 = new JLabel("Address:");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.WEST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 6;
		UserEditAccountInfoGUI.add(label_5, gbc_label_5);
		
		editAddressTextField = new JTextField();
		editAddressTextField.setColumns(10);
		GridBagConstraints gbc_editAddressTextField = new GridBagConstraints();
		gbc_editAddressTextField.anchor = GridBagConstraints.SOUTH;
		gbc_editAddressTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_editAddressTextField.insets = new Insets(0, 0, 5, 5);
		gbc_editAddressTextField.gridx = 3;
		gbc_editAddressTextField.gridy = 6;
		UserEditAccountInfoGUI.add(editAddressTextField, gbc_editAddressTextField);
		
		JLabel label_6 = new JLabel("City:");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.WEST;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 7;
		UserEditAccountInfoGUI.add(label_6, gbc_label_6);
		
		editCityTextField = new JTextField();
		editCityTextField.setColumns(10);
		GridBagConstraints gbc_editCityTextField = new GridBagConstraints();
		gbc_editCityTextField.anchor = GridBagConstraints.SOUTH;
		gbc_editCityTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_editCityTextField.insets = new Insets(0, 0, 5, 5);
		gbc_editCityTextField.gridx = 3;
		gbc_editCityTextField.gridy = 7;
		UserEditAccountInfoGUI.add(editCityTextField, gbc_editCityTextField);
		
		JLabel label_7 = new JLabel("State:");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.WEST;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 8;
		UserEditAccountInfoGUI.add(label_7, gbc_label_7);
		
		editStateTextField = new JTextField();
		editStateTextField.setColumns(10);
		GridBagConstraints gbc_editStateTextField = new GridBagConstraints();
		gbc_editStateTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_editStateTextField.insets = new Insets(0, 0, 5, 5);
		gbc_editStateTextField.gridx = 3;
		gbc_editStateTextField.gridy = 8;
		UserEditAccountInfoGUI.add(editStateTextField, gbc_editStateTextField);
		
		JLabel label_8 = new JLabel("Zipcode:");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.WEST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 1;
		gbc_label_8.gridy = 9;
		UserEditAccountInfoGUI.add(label_8, gbc_label_8);
		
		editZipCodeTextField = new JTextField();
		editZipCodeTextField.setColumns(10);
		GridBagConstraints gbc_editZipCodeTextField = new GridBagConstraints();
		gbc_editZipCodeTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_editZipCodeTextField.insets = new Insets(0, 0, 5, 5);
		gbc_editZipCodeTextField.gridx = 3;
		gbc_editZipCodeTextField.gridy = 9;
		UserEditAccountInfoGUI.add(editZipCodeTextField, gbc_editZipCodeTextField);
		
		JLabel lblNewPassword = new JLabel("New Password:");
		GridBagConstraints gbc_lblNewPassword = new GridBagConstraints();
		gbc_lblNewPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewPassword.gridx = 1;
		gbc_lblNewPassword.gridy = 10;
		UserEditAccountInfoGUI.add(lblNewPassword, gbc_lblNewPassword);
		
		editNewPasswordTextField = new JTextField();
		editNewPasswordTextField.setColumns(10);
		GridBagConstraints gbc_editNewPasswordTextField = new GridBagConstraints();
		gbc_editNewPasswordTextField.anchor = GridBagConstraints.NORTH;
		gbc_editNewPasswordTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_editNewPasswordTextField.insets = new Insets(0, 0, 5, 5);
		gbc_editNewPasswordTextField.gridx = 3;
		gbc_editNewPasswordTextField.gridy = 10;
		UserEditAccountInfoGUI.add(editNewPasswordTextField, gbc_editNewPasswordTextField);
		
		JLabel lblConfirmNewPassword = new JLabel("Confirm New Password:");
		GridBagConstraints gbc_lblConfirmNewPassword = new GridBagConstraints();
		gbc_lblConfirmNewPassword.anchor = GridBagConstraints.WEST;
		gbc_lblConfirmNewPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmNewPassword.gridx = 1;
		gbc_lblConfirmNewPassword.gridy = 11;
		UserEditAccountInfoGUI.add(lblConfirmNewPassword, gbc_lblConfirmNewPassword);
		
		editConfirmNewPasswordTextField = new JTextField();
		GridBagConstraints gbc_editConfirmNewPasswordTextField = new GridBagConstraints();
		gbc_editConfirmNewPasswordTextField.insets = new Insets(0, 0, 5, 5);
		gbc_editConfirmNewPasswordTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_editConfirmNewPasswordTextField.gridx = 3;
		gbc_editConfirmNewPasswordTextField.gridy = 11;
		UserEditAccountInfoGUI.add(editConfirmNewPasswordTextField, gbc_editConfirmNewPasswordTextField);
		editConfirmNewPasswordTextField.setColumns(10);
		
		JButton editInfoSumbitButton = new JButton("Submit");
		editInfoSumbitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//check password
				currentUser.setFirstName(editFirstNameTextField.getText());
				currentUser.setLastName(editLastNameTextField.getText());
				currentUser.setID(editIDTextField.getText());
				currentUser.setEmail(editEmailTextField.getText());
				currentUser.setAddress(editAddressTextField.getText());
				currentUser.setCity(editCityTextField.getText());
				currentUser.setState(editStateTextField.getText());
				currentUser.setZip(editZipCodeTextField.getText());
				currentUser.setPassword(editNewPasswordTextField.getText());
				currentUser.setBalance(Double.valueOf(editBalanceTextField.getText()));
				currentUser.setPhoneNumber(editPhoneNumberTextField.getText());
				
				lblGetname.setText(currentUser.getFirstName());
				lblGetlastname.setText(currentUser.getLastName());
				lblGetusername_1.setText(currentUser.getID());
				lblGetemail.setText(currentUser.getEmail());
				lblGetphonenumber.setText(currentUser.getPhoneNumber());
				lblGetaddress_1.setText(currentUser.getAddress());
				lblGetcity_1.setText(currentUser.getCity());
				lblGetstate_1.setText(currentUser.getState());
				lblGetzipcode.setText(currentUser.getZip());
				lblGetpassword.setText(currentUser.getPassword());
				lblGetbalance.setText(String.valueOf(currentUser.getBalance()));
				UserAccountInfoGUI.setVisible(true);
				UserEditAccountInfoGUI.setVisible(false);
			}
		});
		
		editBalanceTextField = new JTextField();
		editBalanceTextField.setColumns(10);
		GridBagConstraints gbc_editBalanceTextField = new GridBagConstraints();
		gbc_editBalanceTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_editBalanceTextField.insets = new Insets(0, 0, 5, 5);
		gbc_editBalanceTextField.gridx = 3;
		gbc_editBalanceTextField.gridy = 12;
		UserEditAccountInfoGUI.add(editBalanceTextField, gbc_editBalanceTextField);
		GridBagConstraints gbc_editInfoSumbitButton = new GridBagConstraints();
		gbc_editInfoSumbitButton.insets = new Insets(0, 0, 5, 5);
		gbc_editInfoSumbitButton.gridwidth = 2;
		gbc_editInfoSumbitButton.gridx = 1;
		gbc_editInfoSumbitButton.gridy = 14;
		UserEditAccountInfoGUI.add(editInfoSumbitButton, gbc_editInfoSumbitButton);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserEditAccountInfoGUI.setVisible(false);
				UserAccountInfoGUI.setVisible(true);
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 3;
		gbc_button.gridy = 14;
		UserEditAccountInfoGUI.add(button, gbc_button);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserAccountInfoGUI.setVisible(false);	
				UserEditAccountInfoGUI.setVisible(true);
				editFirstNameTextField.setText(currentUser.getFirstName());
				editLastNameTextField.setText(currentUser.getLastName());
				editIDTextField.setText(currentUser.getID());
				editEmailTextField.setText(currentUser.getEmail());
				editPhoneNumberTextField.setText(currentUser.getPhoneNumber());
				editAddressTextField.setText(currentUser.getAddress());
				editCityTextField.setText(currentUser.getCity());
				editStateTextField.setText(currentUser.getState());
				editZipCodeTextField.setText(currentUser.getZip());
				editNewPasswordTextField.setText(currentUser.getPassword());
				editConfirmNewPasswordTextField.setText(currentUser.getPassword());
				editBalanceTextField.setText(String.valueOf(currentUser.getBalance()));
			}
		});
		
		GridBagConstraints gbc_btnEdit = new GridBagConstraints();
		gbc_btnEdit.anchor = GridBagConstraints.NORTH;
		gbc_btnEdit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEdit.insets = new Insets(0, 0, 0, 5);
		gbc_btnEdit.gridx = 1;
		gbc_btnEdit.gridy = 13;
		UserAccountInfoGUI.add(btnEdit, gbc_btnEdit);
		
		JButton btnBack_4 = new JButton("Back");
		btnBack_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserAccountInfoGUI.setVisible(false);
				UserHomeGUI.setVisible(true);
			}
		});
		
		GridBagConstraints gbc_btnBack_4 = new GridBagConstraints();
		gbc_btnBack_4.insets = new Insets(0, 0, 0, 5);
		gbc_btnBack_4.anchor = GridBagConstraints.NORTH;
		gbc_btnBack_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBack_4.gridx = 4;
		gbc_btnBack_4.gridy = 13;
		UserAccountInfoGUI.add(btnBack_4, gbc_btnBack_4);
				
		JLabel userReturnLabel = new JLabel("Rent Item I.D. ");
		userReturnLabel.setBounds(41, 153, 89, 14);
		UserReturnGUI.add(userReturnLabel);
		
		userReturnIDTextField = new JTextField();
		userReturnIDTextField.setColumns(10);
		userReturnIDTextField.setBounds(141, 151, 164, 20);
		UserReturnGUI.add(userReturnIDTextField);
		
		JButton button_2 = new JButton("Cancel");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userReturnIDTextField.setText("");
				UserReturnGUI.setVisible(false);
				UserHomeGUI.setVisible(true);
			}
		});
		button_2.setBounds(138, 206, 89, 23);
		UserReturnGUI.add(button_2);
		
		JButton userReturnItemButton = new JButton("Return");
		userReturnItemButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rentablesMap = currentUser.returnRentables();
				if (rentablesMap.containsKey(userReturnIDTextField.getText())){
					if (rentablesMap.get(userReturnIDTextField.getText()).getClass().equals(Movie.class)){
						movieMap.get(userReturnIDTextField.getText()).setRentedStatus(false);
					}else if (rentablesMap.get(userReturnIDTextField.getText()).getClass().equals(VideoGame.class)){
						videogameMap.get(userReturnIDTextField.getText()).setRentedStatus(false);
					}
					currentUser.rentRemove(rentablesMap.get(userReturnIDTextField.getText()));
				}else{
					JOptionPane.showMessageDialog(null, "Not a valid return item");
				}
				UserReturnGUI.setVisible(false);
				UserHomeGUI.setVisible(true);
				try {
					rbMethods.returnMovieMap(movieMap);
					rbMethods.returnVideoGameMap(videogameMap);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				userReturnIDTextField.setText("");
			}
		});
		userReturnItemButton.setBounds(36, 206, 89, 23);
		UserReturnGUI.add(userReturnItemButton);
		
		JLabel lblCurrentRentables = new JLabel("Current Rentables:");
		lblCurrentRentables.setBounds(41, 33, 264, 14);
		UserReturnGUI.add(lblCurrentRentables);

		JTextArea rentablesTextArea = new JTextArea();
		rentablesTextArea.setBounds(56, 55, 245, 231);
		rentablesTextArea.setEditable(false);
		ViewRentablesGUI.add(rentablesTextArea);
		
		JButton btnCategorizeByTitle = new JButton("Categorize by Title");
		btnCategorizeByTitle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentRentable == "Movie"){
					currentMovieList = rbMethods.sortMovieByTitle(movieMap);
					rentablesTextArea.setText("");
					rentablesTextArea.append(" ID - Title - Rating - Price "+System.getProperty("line.separator")+System.getProperty("line.separator"));
					for (Movie mov : currentMovieList){
						if (mov.getRentedStatus() == false){
							rentablesTextArea.append(mov.getID()+"-"+mov.getTitle()+"-"+mov.getMovieRating()+"-"+mov.getPrice()+System.getProperty("line.separator"));
						}
					}
				}
				if (currentRentable == "VideoGame"){
					currentVideoGameList = rbMethods.sortVideoGameByTitle(videogameMap);
					rentablesTextArea.setText("");
					rentablesTextArea.append(" ID - Title - Rating - Price "+System.getProperty("line.separator")+System.getProperty("line.separator"));
					for (VideoGame vg : currentVideoGameList){
						if (vg.getRentedStatus() == false){
						rentablesTextArea.append(vg.getID()+"-"+vg.getTitle()+"-"+vg.getVideoGameRating()+"-"+vg.getPrice()+System.getProperty("line.separator"));
						}
					}
				}
				lblGetcategory.setText("Sorted by Title");
				RentByGUI.setVisible(false);
				ViewRentablesGUI.setVisible(true);
				
			}
		});
		btnCategorizeByTitle.setVerticalAlignment(SwingConstants.TOP);
		btnCategorizeByTitle.setBounds(new Rectangle(303, 78, 160, 23));
		RentByGUI.add(btnCategorizeByTitle);
		
		JButton btnCategorizeByGenre = new JButton("Categorize by Genre");
		btnCategorizeByGenre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentRentable == "Movie"){
					currentMovieList = rbMethods.sortMovieByCategory(movieMap);
					rentablesTextArea.setText("");
					rentablesTextArea.append(" ID - Title - Category - Rating - Price "+System.getProperty("line.separator")+System.getProperty("line.separator"));
					for (Movie mov : currentMovieList){
						if (mov.getRentedStatus() == false){
						rentablesTextArea.append(mov.getID()+"-"+mov.getTitle()+"-"+mov.getMovieCategory()+"-"+mov.getMovieRating()+"-"+mov.getPrice()+System.getProperty("line.separator"));
						}
					}
				}
				if (currentRentable == "VideoGame"){
					currentVideoGameList = rbMethods.sortVideoGameByCategory(videogameMap);
					rentablesTextArea.setText("");
					rentablesTextArea.append(" ID - Title - Rating - Price "+System.getProperty("line.separator")+System.getProperty("line.separator"));
					for (VideoGame vg : currentVideoGameList){
						if (vg.getRentedStatus() == false){
						rentablesTextArea.append(vg.getID()+"-"+vg.getTitle()+"-"+vg.getVideoGameRating()+"-"+vg.getPrice()+System.getProperty("line.separator"));
						}
					}
				}
				lblGetcategory.setText("Sorted by Genre");
				RentByGUI.setVisible(false);
				ViewRentablesGUI.setVisible(true);
			}
		});
		btnCategorizeByGenre.setBounds(303, 112, 160, 23);
		RentByGUI.add(btnCategorizeByGenre);
		
		JButton btnCategorizeByRating = new JButton("Categorize by Rating");
		btnCategorizeByRating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentRentable == "Movie"){
					currentMovieList = rbMethods.sortMovieByRating(movieMap);
					rentablesTextArea.setText("");
					rentablesTextArea.append(" ID - Title - Rating - Price "+System.getProperty("line.separator")+System.getProperty("line.separator"));
					for (Movie mov : currentMovieList){
						if (mov.getRentedStatus() == false){
						rentablesTextArea.append(mov.getID()+"-"+mov.getTitle()+"-"+mov.getMovieRating()+"-"+mov.getPrice()+System.getProperty("line.separator"));
						}
					}
				}
				if (currentRentable == "VideoGame"){
					currentVideoGameList = rbMethods.sortVideoGameByRating(videogameMap);
					rentablesTextArea.setText("");
					rentablesTextArea.append(" ID - Title - Rating - Price "+System.getProperty("line.separator")+System.getProperty("line.separator"));
					for (VideoGame vg : currentVideoGameList){
						if (vg.getRentedStatus() == false){
						rentablesTextArea.append(vg.getID()+"-"+vg.getTitle()+"-"+vg.getVideoGameRating()+"-"+vg.getPrice()+System.getProperty("line.separator"));
						}
					}
				}
				lblGetcategory.setText("Sorted by Rating");
				RentByGUI.setVisible(false);
				ViewRentablesGUI.setVisible(true);
			}
		});
		btnCategorizeByRating.setBounds(303, 145, 160, 23);
		RentByGUI.add(btnCategorizeByRating);
		
		JButton btnBack_5 = new JButton("Back");
		btnBack_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RentByGUI.setVisible(false);
				UserHomeGUI.setVisible(true);
			}
		});
		btnBack_5.setBounds(303, 179, 160, 23);
		RentByGUI.add(btnBack_5);
		
		JLabel lblId = new JLabel("I.D.");
		lblId.setBounds(66, 326, 26, 14);
		ViewRentablesGUI.add(lblId);
		
		rentableIDTextField = new JTextField();
		rentableIDTextField.setBounds(91, 323, 51, 20);
		ViewRentablesGUI.add(rentableIDTextField);
		rentableIDTextField.setColumns(10);
		
		JButton btnBack_6 = new JButton("Back");
		btnBack_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRentablesGUI.setVisible(false);
				RentByGUI.setVisible(true);
			}
		});
		btnBack_6.setBounds(327, 146, 89, 23);
		ViewRentablesGUI.add(btnBack_6);
	}
}
