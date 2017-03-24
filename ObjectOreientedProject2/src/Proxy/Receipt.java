package Proxy;

import Project.Jersey;

import javax.swing.JOptionPane;

public class Receipt implements ReceiptInterface {
	
	public Receipt() {

	}

	public void makeRecipt() {
		JOptionPane.showMessageDialog(null, "We have emailed you your receipt");
	}

}
