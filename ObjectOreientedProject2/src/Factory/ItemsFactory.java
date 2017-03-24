package Factory;

public class ItemsFactory {
	
	public ItemsList getItemsList(String list){
		int index = list.indexOf("J");
		
		if(index != -1){
			return new JerseyList(list);
		}
		else if (index <0 ){
			return new SupplementList(list);
		}
		else if(index > 1){
			return new WomenList(list);
		}else{
			return new EquipmentList(list);
		}
	
	}

}
