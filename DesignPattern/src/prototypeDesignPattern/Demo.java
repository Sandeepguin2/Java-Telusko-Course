package prototypeDesignPattern;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bs = new BookShop();
		bs.setShopName("Sandeep");
		bs.loadData();

		


		BookShop bs1 = bs.clone();
		bs.getBooks().remove(2);
		bs1.setShopName("A1");
		
		
		
		System.out.println(bs);
		System.out.println(bs1);

	}

}
