package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Command.CommandButton;
import Command.CommandHolder;
import Command.EquipmentCommand;
import Command.ExitCommand;
import Command.JerseyCommandButton;
import Command.SupplementsCommand;
import Command.WomensClothingCommandButton;
import Command.cmdMenu;
import Proxy.ReceiptInterface;
import Proxy.ReceiptProxy;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.TextArea;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainAppilcationPage extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JerseyCommandButton nextpage;
	private EquipmentCommand nextpage2;
	private SupplementsCommand nextpage3;
	private WomensClothingCommandButton nextpage4;
	private CommandButton btnNewButton, btnNewButton_1 , btnNewButton_2,btnNewButton_3;
	private ExitCommand extc;
	private JMenu menu;
	private cmdMenu exit;
	
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		MainAppilcationPage mainpage = new MainAppilcationPage();
		mainpage.setVisible(true);
		mainpage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	/**
	 * Create the frame.
	 */

	public MainAppilcationPage() {
		super("JD Shops Shop");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 355);
		setLocationRelativeTo(null);

		// creating two border styles for buttons and panel
		Border thickBorder = new LineBorder(Color.white, 2);
		Border thickButtonBorder = new LineBorder(Color.BLACK, 2);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Information");
		menuBar.add(mnNewMenu);

		// Exit command Pattern used here
		exit = new cmdMenu("Exit", this);
		exit.setCommand(new ExitCommand());
		exit.addActionListener(this);
		mnNewMenu.add(exit);

		// Add info to menu item
		JMenuItem mntmInfo = new JMenuItem("Info");
		mnNewMenu.add(mntmInfo);

		JMenu mnNewMenu_1 = new JMenu("Location");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmFindUs = new JMenuItem("Find us");
		mnNewMenu_1.add(mntmFindUs);

		// Designing button panel
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Command Design Pattern for jersey button
		btnNewButton = new CommandButton("Jersey", this);
		nextpage = new JerseyCommandButton(this, contentPane);
		btnNewButton.setCommand(nextpage);
		btnNewButton.setBorder(thickButtonBorder);
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(298, 138, 152, 23);
		contentPane.add(btnNewButton);

		// Command pattern to be implemented here for secound button
		btnNewButton_1 = new CommandButton("Equipment",this);
		nextpage2 = new EquipmentCommand(this, contentPane);
		btnNewButton_1.setCommand(nextpage2);
		btnNewButton_1.setBounds(298, 172, 152, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBorder(thickButtonBorder);
		btnNewButton_1.addActionListener(this);

		// Command pattern to be implemented here for third button
		btnNewButton_2 = new CommandButton("Mens clothing", this);
		nextpage3 = new SupplementsCommand(this, contentPane);
		btnNewButton_2.setCommand(nextpage3);
		btnNewButton_2.setBounds(298, 240, 152, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setBorder(thickButtonBorder);
		btnNewButton_2.addActionListener(this);
		
		// Command pattern to be implemented here for forth button
		btnNewButton_3 = new CommandButton("Womens clothing",this);
		nextpage4 = new WomensClothingCommandButton(this, contentPane);
		btnNewButton_3.setCommand(nextpage4);
		btnNewButton_3.setBounds(298, 206, 152, 23);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setBorder(thickButtonBorder);
		btnNewButton_3.addActionListener(this);
		//
		JLabel lblNewLabel = new JLabel("Welcome to JD sports");
		lblNewLabel.setIcon(new ImageIcon("images\\jdsports.jpg"));
		
		lblNewLabel.setBounds(47, 21, 428, 57);
		lblNewLabel.setForeground(Color.YELLOW);
		contentPane.add(lblNewLabel);

		Color myColor = new Color(46, 37, 48); // color created for gui use
		Font fancyFont2 = new Font("Serif", Font.ITALIC, 32); // font created
																// for gui use
		lblNewLabel.setFont(fancyFont2);

		TextArea textArea = new TextArea(6, 50);
		textArea.setEditable(false);
		textArea.setBackground(Color.BLACK);
		textArea.setForeground(Color.YELLOW);
		textArea.setBounds(32, 95, 208, 181);
		textArea.setText("Welcome to JD sports please select an action");
		contentPane.add(textArea);
		lblNewLabel.setIcon(new ImageIcon("images\\jdsports.jpg"));
		JLabel lblNewLabel_1 = new JLabel("Please choose from our range ");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setBounds(292, 113, 193, 14);
		contentPane.add(lblNewLabel_1);

		JPanel panel = new JPanel();
		panel.setBackground(myColor);
		panel.setBorder(thickBorder);
		panel.setBounds(269, 95, 208, 180);
		contentPane.add(panel);
		
		
	}

	// ActionPerformed for command patterns
	public void actionPerformed(ActionEvent e) {
		CommandHolder obj = (CommandHolder) e.getSource();
		obj.getCommand().Execute();
		dispose();
	}
}
