package Facade;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CompMaker {
	private Comp jersey;
	private Comp supplement;
	private Comp equipment;
	private Comp women;
	public CompMaker(){
		jersey = new CompJersey();
		supplement = new SupplementComp();
		equipment = new EquipmentComp();
		women = new WomenComp();
	}
	
	public String displayJerseyYes(){

		return jersey.displayYes();
	}
	
	public String displayJerseyNo(){
		return jersey.displayNo();
	}
	
	public JRadioButton displayRadioYes(){
		return jersey.radioYes();
	}
	
	public JRadioButton displayRadioNo(){
		return jersey.radioNo();
	}
	//-----------------------------------Supplement methods ----------------------------------// 
	public String displaySupplementYes(){
		return supplement.displayYes();
	}
	
	public String displaySupplementNo(){
		return supplement.displayNo();
	}
	
	//-----------------------------------Equipment methods ----------------------------------// 
	public String displayEquipmentYes(){
		return equipment.displayYes();
	}
		
	public String displayEquipmentNo(){
		return equipment.displayNo();
	}
	
	//-----------------------------------Women methods ----------------------------------// 
	public String displayWomenYes(){
		return women.displayYes();
	}
			
	public String displayWomenNo(){
		return women.displayNo();
	}

}
