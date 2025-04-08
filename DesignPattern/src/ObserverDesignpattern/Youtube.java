package ObserverDesignpattern;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sandeep = new Channel();
		SubScriber s1 = new SubScriber("lipsa");
		SubScriber s2 = new SubScriber("mamuni");
		SubScriber s3 = new SubScriber("kiran");
		SubScriber s4 = new SubScriber("Aditi");
		SubScriber s5 = new SubScriber("dipti");

		sandeep.subscribe(s1);
		sandeep.subscribe(s2);
		sandeep.subscribe(s3);
		sandeep.subscribe(s4);
		sandeep.subscribe(s5);
		
		sandeep.unSubscribe(s3);

		s1.subscribeChannel(sandeep);
		s2.subscribeChannel(sandeep);
		s3.subscribeChannel(sandeep);
		s4.subscribeChannel(sandeep);
		s5.subscribeChannel(sandeep);

		sandeep.upload("How to learn programming");

	}

}
