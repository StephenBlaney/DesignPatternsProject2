package Facade;
import javax.swing.JRadioButton;

import Project.JsonUtil;

public class WomenComp implements Comp{

	
	public String displayYes() {
		int num =0;
		return new String(new JsonUtil().getWomenComp(num));
	}

	
	public String displayNo() {
		int num =1;
		return new String(new JsonUtil().getWomenComp(num));
	}

	public JRadioButton radioYes() {
		return new JRadioButton("Yes");
	}
	
	public JRadioButton radioNo() {
		return new JRadioButton("No");
	}

}
