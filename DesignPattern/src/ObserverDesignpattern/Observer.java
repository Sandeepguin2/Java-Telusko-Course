package ObserverDesignpattern;

public interface Observer {

	void update();

	void subscribeChannel(Subject ch);

}