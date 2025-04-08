   package exception;
class A{
	public void show() throws ClassNotFoundException{
		Class.forName("calc");
	}
	
}
public class ThrowsKeyWord {
	static {
		System.out.println("Class Loaded");
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		A obj=new A();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
