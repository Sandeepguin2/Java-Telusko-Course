  package prototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop  implements Cloneable{
	private String shopName;
	List<Book> books=new ArrayList<Book>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	public void loadData() {
		for(int i=1;i<=10;i++) {
			Book b= new Book();
			b.setBid(i);
			b.setBname("Book"+i);
			getBooks().add(b);
		}
	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop shop=new BookShop();
		for(Book b:this.getBooks()) {
			shop.getBooks().add(b);
		}
		return shop;
		
	}

}
