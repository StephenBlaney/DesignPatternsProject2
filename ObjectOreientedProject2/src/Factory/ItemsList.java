package Factory;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;

public abstract class ItemsList {
	protected String jerseyList[];
	protected String equipmentList[];
	protected String supplementList[];
	protected String womensList[];
	
	public ItemsList(){
		jerseyList = null;
		equipmentList = null;
		supplementList = null;
		womensList = null;
	}
	
	public String[] getJerseyList(){
		return jerseyList;
	}
	
	public String[] getEquipmentList(){
		return equipmentList;
	}
	
	public String[] getSupplementList(){
		return supplementList;
	}
	
	public String[] getWomenList(){
		return womensList;
	}
	
	public JList<String> display(){
		return new JList<String>(new DefaultListModel<String>());
	}

}
