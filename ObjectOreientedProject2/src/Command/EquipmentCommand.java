package Command;


import javax.swing.JFrame;
import javax.swing.JPanel;

import Project.Equipment;

public class EquipmentCommand extends JFrame implements Command {

	private JFrame frame;
	private JPanel pnl;

	public EquipmentCommand(JFrame fr, JPanel p) {
		frame = fr;
		pnl = p;
	}

	public void Execute() {

		new Equipment().setVisible(true);

	}
}
