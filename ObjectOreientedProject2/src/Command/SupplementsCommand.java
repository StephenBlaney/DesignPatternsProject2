package Command;


import javax.swing.JFrame;
import javax.swing.JPanel;

import Project.Men;

public class SupplementsCommand extends JFrame implements Command {

	
	private JFrame frame;
	private JPanel pnl;
	
	 public SupplementsCommand(JFrame fr, JPanel p) {
	      frame = fr;
	      pnl = p;
	   }
	public void Execute() {
		new Men().setVisible(true);
	}	

}
