package telusko;
//Normal Interface
interface scooty{
	//By default the variables are final and static 
	//so you need to instantiate everytime you declare a variable
	int price=45;
	int vegeablePrice=88;
	
	//By default the methods are public abstract
	void gas();
	void market();
	
}
class activa implements scooty {

	@Override
	public void gas() {
		// TODO Auto-generated method stub
		System.out.println("HP gas");
		
	}

	@Override
	public void market() {
		// TODO Auto-generated method stub
		System.out.println("vegetables");
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can make reference object of interface and object of its implemented class
		scooty obj= new activa();
		obj.gas();
		obj.market();
		
		System.out.println(scooty.price);
		System.out.println(scooty.vegeablePrice);

	}

}
