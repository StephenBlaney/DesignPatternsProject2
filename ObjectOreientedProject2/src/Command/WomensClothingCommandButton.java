package Command;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Project.Women;

public class WomensClothingCommandButton extends JFrame implements Command {
	

	private JFrame frame;
	private JPanel pnl;
	
	 public WomensClothingCommandButton(JFrame fr, JPanel p) {
	      frame = fr;
	      pnl = p;
	   }
	public void Execute() {
		new Women().setVisible(true);
	}

}
