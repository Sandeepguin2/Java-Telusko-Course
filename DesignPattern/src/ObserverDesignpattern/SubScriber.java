package ObserverDesignpattern;

public class SubScriber implements Observer {
	private String name;
	private Subject channel = new Channel();

	public SubScriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hey" + ":" + name + ",video uploaded");
	}

	@Override
	public void subscribeChannel(Subject ch) {
		channel = ch;
	}

}
