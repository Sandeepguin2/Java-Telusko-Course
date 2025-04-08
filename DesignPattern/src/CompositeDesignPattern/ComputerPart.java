 package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface Component{
	 void showPrice();
}
class Leaf implements Component{
	int price;
	String name;
	
	
//Add Constructor to print the value
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}



	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name+":"+price);
	}
	
}
class Composite implements Component{
	String name;
	
	public Composite(String name) {
		super();
		this.name = name;
	}


	List<Component> components=new ArrayList<Component>();
	public void addComponent(Component com) {
		components.add(com);
	}
	

	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for(Component c:components) {
			c.showPrice();
		}
	}
	
}

