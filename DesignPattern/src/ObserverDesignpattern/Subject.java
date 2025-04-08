package ObserverDesignpattern;

public interface Subject {

	void subscribe(SubScriber sub);

	void unSubscribe(Observer sub);

	void notifySubscriber();

	void upload(String title);

}