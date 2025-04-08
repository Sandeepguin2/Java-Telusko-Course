package telusko;
class Hunter{
	public void show() {
		System.out.println("Light weight");
	}
	public Hunter() {
		System.out.println("object created");
	}
}
public class AnonymousObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hunter().show();   //Anonymous Object

	}

}