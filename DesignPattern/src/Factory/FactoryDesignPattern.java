package Factory;
//One intertface having multiple implementation so that we can choose our own method
public class FactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		OperatingFactory osf=new OperatingFactory();
		
		OS obj= osf.getInstance("Open");
		obj.specs();
		

	}

}
