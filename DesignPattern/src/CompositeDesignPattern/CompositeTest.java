package CompositeDesignPattern;

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component hd = new Leaf(4000, "HDD");
		Component mouse = new Leaf(500, "MOUSE");
		Component monitor = new Leaf(8000, "MONITOR");
		Component ram = new Leaf(3000, "RAM");
		Component cpu = new Leaf(15000, "CPU");

		Composite ph = new Composite("peripheral");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");

		mb.addComponent(cpu);
		mb.addComponent(ram);

		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);

		computer.addComponent(cpu);
		computer.addComponent(cabinet);

		computer.showPrice();

	}

}
