package Command;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Project.Jersey;

public class JerseyCommandButton extends JFrame implements Command {

	
	private JFrame frame;
	private JPanel pnl;
	
	 public JerseyCommandButton(JFrame fr, JPanel p) {
	      frame = fr;
	      pnl = p;
	   }
	public void Execute() {
		new Jersey().setVisible(true);
	}	

}
