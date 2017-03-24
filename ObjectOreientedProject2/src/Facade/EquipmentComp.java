package Facade;
import javax.swing.JRadioButton;

import Project.JsonUtil;

public class EquipmentComp implements Comp{

	@Override
	public String displayYes() {
		int num =0;
		return new String(new JsonUtil().getEquipmentComp(num));
	}

	@Override
	public String displayNo() {
		int num =1;
		return new String(new JsonUtil().getEquipmentComp(num));
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
