package LectureCode.src.lesson2.lecture.bidir.onetoone_factory.extpackage;

import LectureCode.src.lesson2.lecture.birdir.onetoone_factory.CustShopCartFactory;
import LectureCode.src.lesson2.lecture.birdir.onetoone_factory.Customer;
import LectureCode.src.lesson2.lecture.birdir.onetoone_factory.Item;
import LectureCode.src.lesson2.lecture.birdir.onetoone_factory.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		
		//Create new customer
		Customer cust = CustShopCartFactory.createCustomer("Bob");
		cust.getCart().addItem(new Item("Shirt"));
		
		
		System.out.println(cust.getCart().getItems());
		
		//Cannot create Customer or ShoppingCart directly from Main
		//Customer c = new Customer("Bob") //compiler error
		//ShoppingCart s = new ShoppingCart();  //compiler error
		

	}

}
