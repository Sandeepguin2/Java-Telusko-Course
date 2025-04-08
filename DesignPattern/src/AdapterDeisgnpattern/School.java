package AdapterDeisgnpattern;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PilotPen pp=new PilotPen();
		Pen p=new PenAdapter();
		AssgnmentWork aw=new AssgnmentWork();
		aw.setP(p);
		aw.writeAssignment("tried");

	}

}
