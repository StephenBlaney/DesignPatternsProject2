package Factory;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;

public class JerseyList extends ItemsList{
	private int size;
	
	public JerseyList(String list){
		size =0;
		
		StringTokenizer st = new StringTokenizer(list);
		size = st.countTokens();
		jerseyList = new String[size];
		for(int i =0;i<jerseyList.length;i++){
			jerseyList[i] = st.nextToken();
		}
	}
	
	public JList display(){
		DefaultListModel<String> def = new DefaultListModel<String>();
		JList list = new JList(def);
		String name = "";
		for(int i=0;i<jerseyList.length;i++){
			def.add(i, jerseyList[i]);
		}
		//area.setText(name);
		return list;
	}
}
