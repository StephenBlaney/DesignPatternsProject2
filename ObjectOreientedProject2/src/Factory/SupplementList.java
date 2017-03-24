package Factory;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class SupplementList extends ItemsList{
	
	private int size;
	
	public SupplementList(String list){
		size =0;
		
		StringTokenizer st = new StringTokenizer(list);
		size = st.countTokens();
		supplementList = new String[size];
		for(int i =0;i<supplementList.length;i++){
			supplementList[i] = st.nextToken();
		}
	}
	
	public JList display(){
		DefaultListModel<String> def = new DefaultListModel<String>();
		JList list = new JList(def);
		for(int i=0;i<supplementList.length;i++){
			def.add(i, supplementList[i]);
		}
		//area.setText(name);
		return list;
	}

}
