package Factory;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class EquipmentList extends ItemsList{
	private int size;
	
	public EquipmentList(String list){
		size =0;
		
		StringTokenizer st = new StringTokenizer(list);
		size = st.countTokens();
		equipmentList = new String[size];
		for(int i =0;i<equipmentList.length;i++){
			equipmentList[i] = st.nextToken();
		}
	}
	
	public JList display(){
		DefaultListModel<String> def = new DefaultListModel<String>();
		JList list = new JList(def);
		String name = "";
		for(int i=0;i<equipmentList.length;i++){
			def.add(i, equipmentList[i]);
		}
		//area.setText(name);
		return list;
	}
}
