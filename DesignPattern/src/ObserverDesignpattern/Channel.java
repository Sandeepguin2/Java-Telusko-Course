package ObserverDesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	private List<SubScriber> subs = new ArrayList<SubScriber>();
	private String title;

	@Override
	public void subscribe(SubScriber sub) {
		subs.add(sub);
	}

	@Override
	public void unSubscribe(Observer sub) {
		subs.remove(sub);
	}

	@Override
	public void notifySubscriber() {
		for (Observer sub : subs) {
			sub.update();
		}

	}

	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscriber();
	}

}
