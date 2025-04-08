package BuilderDesignPattern;
//Builder Phone
public class Phone {
	
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	public void setOs(String os) {
		this.os = os;
	}
	public Phone setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public Phone setProcessor(String processor) {
		this.processor = processor;
		return this;
		
	}
	public Phone setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public Phone setBattery(double battery) {
		this.battery = battery;
		return this;
	}
	public String getOs() {
		return os;
	}
	public int getRam() {
		return ram;
	}
	public String getProcessor() {
		return processor;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public double getBattery() {
		return battery;
	}
	private double battery;
	public Phone(String os, int ram, String processor, double screenSize, double battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}

	

}
