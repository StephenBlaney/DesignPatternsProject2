package Project;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Facade.CompMaker;
import Factory.ItemsFactory;
import Proxy.ReceiptInterface;
import Proxy.ReceiptProxy;

public class Women extends JFrame implements ListSelectionListener,ActionListener{
	
	private JPanel panelC,panelS,panelE;
	private JList<String> jlist;
	private JLabel labelImage,labelComp,labelDisplay;
	private JButton buy,comp,back;
	private JRadioButton yes,no;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Jersey jersey = new Jersey ();
		jersey.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	/**
	 * Create the frame.
	 */
	
	public Women() {
		super("Women Page ");
		getContentPane().add(buildCenterPanel(),BorderLayout.CENTER);
		getContentPane().add(buildSouthPanel(), BorderLayout.SOUTH);
		getContentPane().add(buildEastPanel(), BorderLayout.EAST);
		setVisible(true);
		setSize(500,500);
		setLocationRelativeTo(null);
	}//end Jersey
	
	public JPanel buildCenterPanel(){
		panelC = new JPanel(new GridLayout(2,2));
		panelC.setBackground(Color.BLACK);
		Border Border2 = new LineBorder(Color.WHITE, 1);
		
		/*
		 * Create the jersey list by using the simple factory pattern
		 * Get the values from a json file that will be used in the
		 * factory pattern
		 */
		String list = new String (Json().getWomen());
		ItemsFactory factory = new ItemsFactory();
		
		factory.getItemsList(list);
		jlist = factory.getItemsList(list).display();
		jlist.addListSelectionListener(this);
		

		jlist.setForeground(Color.yellow);
		jlist.setBackground(Color.BLACK);
		jlist.setBorder(Border2);
		
		labelDisplay = new JLabel();
		labelImage = new JLabel();
		labelComp = new JLabel();
		
		labelDisplay.setForeground(Color.yellow);
		labelComp.setForeground(Color.yellow);
		labelImage.setBorder(Border2);
		labelDisplay.setBorder(Border2);
		labelComp.setBorder(Border2);
		
		//add components to panel
		panelC.add(jlist);
		panelC.add(labelDisplay);
		panelC.add(labelImage);
		panelC.add(labelComp);
		
		return panelC;
	}//end buildCenterPanel
	
	public JPanel buildSouthPanel(){
		panelS = new JPanel(new GridLayout(1,3));
		/*
		 * Create the buttons for the GUI
		 */
		buy = new JButton("Buy");
		comp = new JButton("Enter Competition");
		back = new JButton("Back");
		/*
		 * Add the ActionListener to the buttons.
		 * And set the buttons to hide on the GUI
		 */
		buy.addActionListener(this);
		comp.addActionListener(this);
		back.addActionListener(this);
		buy.setVisible(false);
		comp.setVisible(false);
		back.setVisible(false);
		/*
		 * Add the components to the panel
		 */
		panelS.add(buy);
		panelS.add(comp);
		panelS.add(back);
		return panelS;
	}//end buildSouthPanel
	
	public JPanel buildEastPanel(){
		panelE = new JPanel(new GridLayout(2,1));
		Border Border2 = new LineBorder(Color.WHITE, 1);
		panelE.setBackground(Color.black);
		panelE.setBorder(Border2);
		/*
		 * Create the radio buttons by using the
		 * facade pattern. And add the action listener
		 * to the radio buttons. And set the radio buttons to hide
		 */
		yes = getComp().displayRadioYes();
		no = getComp().displayRadioNo();
		yes.addActionListener(this);
		no.addActionListener(this);
		yes.setVisible(false);
		no.setVisible(false);
		/*
		 * Add the components to the panel
		 */
		panelE.add(yes);
		panelE.add(no);
		return panelE;
	}//end buildEastPanel
	
	/*
	 * Method used for to respond to the actions of the JList from the user
	 * (non-Javadoc)
	 * @see javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.ListSelectionEvent)
	 */
	public void valueChanged(ListSelectionEvent e) {
		if(e.getValueIsAdjusting()){
			if(jlist.getSelectedValue().equals("Footballboots")){
				/*
				 * Get the index of the item chosen. Passed to the json file
				 * which uses it to display the data of the item selected in the list
				 */
				int index = jlist.getSelectedIndex();
				labelDisplay.setText("<html>"+Json().getWomenDescription(index)+"<br></html>");
				labelImage.setIcon(new ImageIcon(Json().getWomenImage(index)));
				getBuyComp(); // set the buttons visible 
			}
			if(jlist.getSelectedValue().equals("RunningLeggings")){
				/*
				 * Get the index of the item chosen. Passed to the json file
				 * which uses it to display the data of the item selected in the list
				 */
				int index = jlist.getSelectedIndex();
				labelDisplay.setText("<html>" + Json().getWomenDescription(index)+"<br></html>");
				labelImage.setIcon(new ImageIcon(Json().getWomenImage(index)));
				getBuyComp();// set the buttons visible 
			}
			
			if(jlist.getSelectedValue().equals("RunningJacket")){
				/*
				 * Get the index of the item chosen. Passed to the json file
				 * which uses it to display the data of the item selected in the list
				 */
				int index = jlist.getSelectedIndex();
				labelDisplay.setText("<html>" + Json().getWomenDescription(index)+"<br></html>");
				labelImage.setIcon(new ImageIcon(Json().getWomenImage(index)));
				getBuyComp();// set the buttons visible 
			}
			
			
			if(jlist.getSelectedValue().equals("WinterJacket")){
				/*
				 * Get the index of the item chosen. Passed to the json file
				 * which uses it to display the data of the item selected in the list
				 */
				int index = jlist.getSelectedIndex();
				labelDisplay.setText("<html>" + Json().getWomenDescription(index)+"<br></html>");
				labelImage.setIcon(new ImageIcon(Json().getWomenImage(index)));
				getBuyComp();// set the buttons visible 
			}
			
			if(jlist.getSelectedValue().equals("WomanShorts")){
				/*
				 * Get the index of the item chosen. Passed to the json file
				 * which uses it to display the data of the item selected in the list
				 */
				int index = jlist.getSelectedIndex();
				labelDisplay.setText("<html>" + Json().getWomenDescription(index)+"<br></html>");
				labelImage.setIcon(new ImageIcon(Json().getWomenImage(index)));
				getBuyComp();// set the buttons visible 
			}
			
		}//end outter if
		
	}//end list
	
	@SuppressWarnings("deprecation")
	/*
	 * Method to respond to the users input from the buttons and radio buttons
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == yes){
			/*
			 * Set the data from the label by using the facade pattern
			 */
			labelComp.setText("<html>"+getComp().displayWomenYes()+"<br></html>");
			getRadioBuy();
		}
		if(e.getSource() == no){
			/*
			 * Set the data from the label by using the facade pattern
			 */
			labelComp.setText("<html>"+getComp().displayWomenNo()+"<br></html>");
			getRadioBuy();
		}
		if(e.getSource() == buy){
			/*
			 * Set the test of the label to empty and show a dialog when the user
			 * clicks the buy button. Set the competition button visible
			 */
			labelComp.setText("");
			ReceiptInterface MakeRecipt= new ReceiptProxy();
			JOptionPane.showMessageDialog(null,"Item purchased");
			comp.setVisible(true);
			MakeRecipt.makeRecipt();
			
		}
		if(e.getSource() == comp){
			/*
			 * Set the radio buttons to show. Sets the radio buttons to hide if 
			 * they are already been checked
			 */
			yes.setVisible(true);
			no.setVisible(true);
			
			no.setForeground(Color.yellow);
			yes.setForeground(Color.yellow);
			no.setBackground(Color.BLACK);
			yes.setBackground(Color.BLACK);
			
			
			if(yes.isSelected() || no.isSelected()){
				yes.setSelected(false);
				no.setSelected(false);
			}
		}//end if 
		if(e.getSource() == back){
			/*
			 * Creates a new MainApplicationPage when the user
			 * clicks the button. And disposes the current page 
			 */
			MainAppilcationPage frame = new MainAppilcationPage();
			frame.show();
			dispose();
		}
		
	}//end actionPerformed
	
	/*
	 * Method to show the buttons buy and back
	 */
	public void getBuyComp(){
		
		Border Border2 = new LineBorder(Color.BLACK, 2);
		buy.setBorder(Border2);
		buy.setVisible(true);
		back.setBorder(Border2);
		back.setVisible(true);
		
		
	}
	
	/*
	 * Method to hide the button for competition and radio buttons
	 * Allow the user to then use the list 
	 */
	public void getRadioBuy(){
		yes.setVisible(false);
		no.setVisible(false);
		comp.setVisible(false);
		jlist.setEnabled(true);
	}
	
	/*
	 * Method to create an object of the JsonUtil class
	 */
	public JsonUtil Json(){
		return new JsonUtil();
	}
	
	/*
	 * Method to create and object of the CompMaker class
	 */
	public CompMaker getComp(){
		return new CompMaker();
	}
}
