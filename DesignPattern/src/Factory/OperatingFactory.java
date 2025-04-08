package Factory;

public class OperatingFactory {
	public OS getInstance(String str) {
		if(str.equals("Open")) {
			return new Android();	
		}else if(str.equals("closed")) {
			return new IOs(); 
		}else {
			return new Windows();
		}
		
		
	}

}
