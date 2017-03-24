package Factory;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class WomenList extends ItemsList{
	
	private int size;
	
	public WomenList(String list){
		size =0;
		
		StringTokenizer st = new StringTokenizer(list);
		size = st.countTokens();
		womensList = new String[size];
		for(int i =0;i<womensList.length;i++){
			womensList[i] = st.nextToken();
		}
	}
	
	public JList display(){
		DefaultListModel<String> def = new DefaultListModel<String>();
		JList<String> list = new JList<String>(def);
		for(int i=0;i<womensList.length;i++){
			def.add(i, womensList[i]);
		}
		//area.setText(name);
		return list;
	}

}
