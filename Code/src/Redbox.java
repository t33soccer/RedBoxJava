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
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

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
	private JTextField nameTextField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField zipcodeTextField_5;
	private JTextField startBalTextField_6;
	private JTextField pwordTextField_7;
	private JTextField confirmpwordTextField_8;
	private JTextField textField_5;
	private JTextField textField_6;
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
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
		frmWelcomeToRedbox.setBounds(100, 100, 636, 426);
		frmWelcomeToRedbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToRedbox.getContentPane().setLayout(new CardLayout(0, 0));
		//frmWelcomeToRedbox.setBounds(100, 100, 500, 250);
		
		final JPanel RedBox = new JPanel();
		frmWelcomeToRedbox.getContentPane().add(RedBox, "name_338270847398726");
		RedBox.setLayout(null);
		RedBox.setVisible(true);
		
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
				JOptionPane.showMessageDialog(null, "UserGUI not made!!!");
			}
		});
		btnLogin.setBounds(275, 49, 89, 23);
		RedBox.add(btnLogin);
		
		JButton btnReturning = new JButton("Just Returning an Item??\r\n\t   Click here!");
		btnReturning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnGUI.setVisible(true);
				RedBox.setVisible(false);
				frmWelcomeToRedbox.setTitle("Return");
				frmWelcomeToRedbox.setBounds(100, 100, 415, 240);

				
				
			}
		});
		btnReturning.setBounds(180, 167, 294, 23);
		RedBox.add(btnReturning);
		
		JButton btnLoginAsAdmin = new JButton("Login as Admin");
		btnLoginAsAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RedBox.setVisible(false);
				AdminHomeGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Admin Home");
				frmWelcomeToRedbox.setBounds(100, 100, 375, 145);
				
				
				
			}
		});
		btnLoginAsAdmin.setBounds(27, 167, 125, 23);
		RedBox.add(btnLoginAsAdmin);
		
		JButton btnRegisterNow = new JButton("Register Now!");
		btnRegisterNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RedBox.setVisible(false);
				NewUserGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Welcome to RedBox!");
				frmWelcomeToRedbox.setBounds(100, 100, 380, 440);
				
				
				
			}
		});
		btnRegisterNow.setBounds(275, 80, 154, 23);
		RedBox.add(btnRegisterNow);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(114, 81, 140, 20);
		RedBox.add(passwordField);
		
		JButton btnViewAccounts = new JButton("View Accounts");
		btnViewAccounts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountsGUI.setVisible(true);
				AdminHomeGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Accounts");
				frmWelcomeToRedbox.setBounds(100, 100, 340, 400);
				
				
				
				
			}
		});
		btnViewAccounts.setBounds(51, 24, 124, 23);
		AdminHomeGUI.add(btnViewAccounts);
		
		JButton btnEditInventory = new JButton("Edit Inventory");
		btnEditInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryAdminGUI.setVisible(true);
				AdminHomeGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Inventory");
				frmWelcomeToRedbox.setBounds(100, 100, 600, 465);
				
				
				
			}
		});
		btnEditInventory.setBounds(51, 57, 124, 23);
		AdminHomeGUI.add(btnEditInventory);
		
		JButton btnLogOff = new JButton("Log Off");
		btnLogOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RedBox.setVisible(true);
				AdminHomeGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Welcome to RedBox!");
				frmWelcomeToRedbox.setBounds(100, 100, 500, 250);
				
				
				
				
			}
		});
		btnLogOff.setBounds(210, 43, 101, 23);
		AdminHomeGUI.add(btnLogOff);
		
		JLabel lblCurrentAccounts = new JLabel("Current User Accounts:");
		lblCurrentAccounts.setBounds(29, 28, 169, 14);
		AccountsGUI.add(lblCurrentAccounts);
		
		JList list = new JList();
		list.setBounds(29, 49, 169, 215);
		AccountsGUI.add(list);
		
		JButton btnViewDetails = new JButton("View Details");
		btnViewDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountDetailsAsAdminGUI.setVisible(true);
				AccountsGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Accounts");
				frmWelcomeToRedbox.setBounds(100, 100, 370, 425);
				
				
				
				
			}
		});
		btnViewDetails.setBounds(208, 113, 106, 23);
		AccountsGUI.add(btnViewDetails);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Action not implemented yet!!!");
				
				
			}
		});
		btnDelete.setBounds(208, 162, 106, 23);
		AccountsGUI.add(btnDelete);
		
		JButton btnAdminHome = new JButton("Back/Admin Home");
		btnAdminHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountsGUI.setVisible(false);
				AdminHomeGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Admin Home");
				frmWelcomeToRedbox.setBounds(100, 100, 375, 145);
				
				
				
			}
		});
		btnAdminHome.setBounds(71, 311, 176, 23);
		AccountsGUI.add(btnAdminHome);
		
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
		
		JList list_1 = new JList();
		list_1.setBounds(47, 232, 238, 78);
		AccountDetailsAsAdminGUI.add(list_1);
		
		JLabel lblCurrentRentals = new JLabel("Currently Renting:");
		lblCurrentRentals.setBounds(47, 211, 142, 14);
		AccountDetailsAsAdminGUI.add(lblCurrentRentals);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountDetailsAsAdminGUI.setVisible(false);
				AccountsGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Acounts");
				frmWelcomeToRedbox.setBounds(100, 100, 340, 400);
				
				
				
			}
		});
		btnBack.setBounds(47, 341, 104, 23);
		AccountDetailsAsAdminGUI.add(btnBack);
		
		JButton btnAdminHome_1 = new JButton("Admin Home");
		btnAdminHome_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountDetailsAsAdminGUI.setVisible(false);
				AdminHomeGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Admin Home");
				frmWelcomeToRedbox.setBounds(100, 100, 375, 145);
				
				
				
				
			}
		});
		btnAdminHome_1.setBounds(193, 341, 117, 23);
		AccountDetailsAsAdminGUI.add(btnAdminHome_1);
		
		JLabel lblCurrentInventory = new JLabel("Current Inventory:");
		lblCurrentInventory.setBounds(20, 11, 105, 14);
		InventoryAdminGUI.add(lblCurrentInventory);
		
		JList DVDlist = new JList();
		DVDlist.setBounds(20, 59, 148, 174);
		InventoryAdminGUI.add(DVDlist);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setBounds(41, 266, 46, 14);
		InventoryAdminGUI.add(lblStatus);
		
		JLabel lblgetstatus = new JLabel("\"getStatus()\"");
		lblgetstatus.setBounds(97, 266, 148, 14);
		InventoryAdminGUI.add(lblgetstatus);
		
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTypeGUI.setVisible(true);
				InventoryAdminGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Type?");
				frmWelcomeToRedbox.setBounds(100, 100, 285, 230);
				
				
				
			}
		});
		btnAddItem.setBounds(102, 317, 105, 23);
		InventoryAdminGUI.add(btnAddItem);
		
		JButton btnRemoveItem = new JButton("Remove Item");
		btnRemoveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Action not implemented yet!!!");
				
				
				
			}
		});
		btnRemoveItem.setBounds(242, 317, 123, 23);
		InventoryAdminGUI.add(btnRemoveItem);
		
		JButton btnBackadminHome = new JButton("Back/Admin Home");
		btnBackadminHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editItemGUI.setVisible(false);
				AdminHomeGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Admin Home");
				frmWelcomeToRedbox.setBounds(100, 100, 375, 145);
				
				
				
				
			}
		});
		btnBackadminHome.setBounds(41, 372, 166, 23);
		InventoryAdminGUI.add(btnBackadminHome);
		
		JButton btnEditItem = new JButton("Edit Item");
		btnEditItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryAdminGUI.setVisible(false);
				editItemGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Edit + 'getItemTitle()' maybe");
				frmWelcomeToRedbox.setBounds(100, 100, 610, 325);
			}
		});
		btnEditItem.setBounds(403, 317, 105, 23);
		InventoryAdminGUI.add(btnEditItem);
		
		JLabel lblDvd = new JLabel("DVDs:");
		lblDvd.setBounds(20, 34, 46, 14);
		InventoryAdminGUI.add(lblDvd);
		
		JLabel lblBluerays = new JLabel("Blurays:");
		lblBluerays.setBounds(212, 34, 46, 14);
		InventoryAdminGUI.add(lblBluerays);
		
		JList BlurayList = new JList();
		BlurayList.setBounds(212, 59, 148, 174);
		InventoryAdminGUI.add(BlurayList);
		
		JList GamesList = new JList();
		GamesList.setBounds(403, 59, 148, 174);
		InventoryAdminGUI.add(GamesList);
		
		JLabel lblGames = new JLabel("Games:");
		lblGames.setBounds(403, 34, 46, 14);
		InventoryAdminGUI.add(lblGames);
		
		JLabel lblChooseType = new JLabel("Choose type of item to add: ");
		lblChooseType.setBounds(32, 44, 198, 14);
		addTypeGUI.add(lblChooseType);
		
		JButton btnMovie = new JButton("Movie");
		btnMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTypeGUI.setVisible(false);
				addMovieGUI.setVisible(true);
				frmWelcomeToRedbox.setTitle("Add Movie");
				frmWelcomeToRedbox.setBounds(100, 100, 360, 335);
				
				
				
				
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
				frmWelcomeToRedbox.setBounds(100, 100, 360, 335);
				
				
				
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
				frmWelcomeToRedbox.setBounds(100, 100, 600, 465);
				
				
				
				
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
				frmWelcomeToRedbox.setBounds(100, 100, 375, 145);
				
				
				
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
				frmWelcomeToRedbox.setBounds(100, 100, 600, 465);
				
				
				
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
				frmWelcomeToRedbox.setBounds(100, 100, 600, 465);
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
				frmWelcomeToRedbox.setBounds(100, 100, 600, 465);
				
				
				
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
				frmWelcomeToRedbox.setBounds(100, 100, 600, 465);
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
				frmWelcomeToRedbox.setBounds(100, 100, 600, 465);
				JOptionPane.showMessageDialog(null, "Action not implemented yet!!!");
				
				
				
			}
		});
		btnSubmitChanges.setBounds(363, 251, 163, 23);
		editItemGUI.add(btnSubmitChanges);
		
		JButton btnBackCancel = new JButton("Back/Cancel");
		btnBackCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryAdminGUI.setVisible(true);
				editItemGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Inventory");
				frmWelcomeToRedbox.setBounds(100, 100, 600, 465);
				
				
				
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
		lblCreateProfile.setBounds(124, 28, 88, 14);
		NewUserGUI.add(lblCreateProfile);
		
		JLabel lblName_1 = new JLabel("Name:");
		lblName_1.setBounds(34, 63, 46, 14);
		NewUserGUI.add(lblName_1);
		
		JLabel lblUsername_2 = new JLabel("Username:");
		lblUsername_2.setBounds(34, 88, 75, 14);
		NewUserGUI.add(lblUsername_2);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(34, 113, 46, 14);
		NewUserGUI.add(lblEmail);
		
		JLabel lblAddress_1 = new JLabel("Address:");
		lblAddress_1.setBounds(34, 138, 46, 14);
		NewUserGUI.add(lblAddress_1);
		
		JLabel lblCity_1 = new JLabel("City:");
		lblCity_1.setBounds(34, 163, 46, 14);
		NewUserGUI.add(lblCity_1);
		
		JLabel lblState_1 = new JLabel("State:");
		lblState_1.setBounds(34, 188, 46, 14);
		NewUserGUI.add(lblState_1);
		
		JLabel lblZipcode = new JLabel("Zipcode:");
		lblZipcode.setBounds(34, 213, 46, 14);
		NewUserGUI.add(lblZipcode);
		
		JLabel lblStartingBalance = new JLabel("Starting Balance:");
		lblStartingBalance.setBounds(34, 238, 93, 14);
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
				frmWelcomeToRedbox.setBounds(100, 100, 500, 250);
				
				
				
				
			}
		});
		btnCancel.setBounds(34, 339, 89, 23);
		NewUserGUI.add(btnCancel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(153, 60, 179, 20);
		NewUserGUI.add(nameTextField);
		nameTextField.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(153, 85, 179, 20);
		NewUserGUI.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(153, 110, 179, 20);
		NewUserGUI.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 135, 179, 20);
		NewUserGUI.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(153, 160, 179, 20);
		NewUserGUI.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(153, 185, 179, 20);
		NewUserGUI.add(textField_4);
		
		zipcodeTextField_5 = new JTextField();
		zipcodeTextField_5.setColumns(10);
		zipcodeTextField_5.setBounds(153, 210, 179, 20);
		NewUserGUI.add(zipcodeTextField_5);
		
		startBalTextField_6 = new JTextField();
		startBalTextField_6.setColumns(10);
		startBalTextField_6.setBounds(153, 235, 179, 20);
		NewUserGUI.add(startBalTextField_6);
		
		pwordTextField_7 = new JTextField();
		pwordTextField_7.setColumns(10);
		pwordTextField_7.setBounds(153, 260, 179, 20);
		NewUserGUI.add(pwordTextField_7);
		
		confirmpwordTextField_8 = new JTextField();
		confirmpwordTextField_8.setColumns(10);
		confirmpwordTextField_8.setBounds(153, 285, 179, 20);
		NewUserGUI.add(confirmpwordTextField_8);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "UserGUI not made!!!");
				
				
				
				
				
			}
		});
		btnSubmit.setBounds(201, 339, 89, 23);
		NewUserGUI.add(btnSubmit);
		
		JLabel label = new JLabel("$");
		label.setBounds(142, 238, 21, 14);
		NewUserGUI.add(label);		
		
		JLabel lblRentedItemId = new JLabel("Rented Item I.D. number:");
		lblRentedItemId.setBounds(52, 37, 203, 14);
		ReturnGUI.add(lblRentedItemId);
		
		JLabel lblUsername_3 = new JLabel("Username:");
		lblUsername_3.setBounds(52, 75, 164, 14);
		ReturnGUI.add(lblUsername_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(195, 34, 164, 20);
		ReturnGUI.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(195, 72, 164, 20);
		ReturnGUI.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnCancel_1 = new JButton("Cancel");
		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RedBox.setVisible(true);
				ReturnGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Welcome to RedBox!");
				frmWelcomeToRedbox.setBounds(100, 100, 500, 250);
				
				
				
				
			}
		});
		btnCancel_1.setBounds(52, 142, 89, 23);
		ReturnGUI.add(btnCancel_1);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RedBox.setVisible(true);
				ReturnGUI.setVisible(false);
				frmWelcomeToRedbox.setTitle("Welcome to RedBox!");
				frmWelcomeToRedbox.setBounds(100, 100, 500, 250);
				
				
				
				
			}
		});
		btnReturn.setBounds(270, 142, 89, 23);
		ReturnGUI.add(btnReturn);
	}
}
