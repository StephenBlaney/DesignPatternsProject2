package Command;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CommandButton extends JButton implements CommandHolder {

	private Command btnCommand;
	private JFrame frame;
	
	  public CommandButton(String name, JFrame fr) {
		     super(name);
		     frame = fr;
		  }
	
	public void setCommand(Command comd) {
		// TODO Auto-generated method stub
		btnCommand = comd;
			
	}


	public Command getCommand() {
		// TODO Auto-generated method stub
		return btnCommand;
	}

}
