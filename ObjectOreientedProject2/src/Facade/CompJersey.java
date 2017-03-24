package Facade;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Project.JsonUtil;

public class CompJersey implements Comp{

	@Override
	public String displayYes() {
		int num = 0;
		return new String(new JsonUtil().getJerseyComp(num));
	}

	@Override
	public String displayNo() {
		int num = 1;
		return new String(new JsonUtil().getJerseyComp(num));
	}

	@Override
	public JRadioButton radioYes() {
		return new JRadioButton("Yes");
	}

	@Override
	public JRadioButton radioNo() {
		return new JRadioButton("No");
	}

}
