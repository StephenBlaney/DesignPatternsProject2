package Facade;

import javax.swing.JRadioButton;

import Project.JsonUtil;


public class SupplementComp implements Comp{

	@Override
	public String displayYes() {
		int num = 0;
		return new String(new JsonUtil().getSupplementComp(num));
	}
	
	public String displayNo() {
		int num = 1;
		return new String(new JsonUtil().getSupplementComp(num));
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
