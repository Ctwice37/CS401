package LectureCode.src.lesson2.lecture.unidirectional.oneToZeroOneEasy_extpackage;

import LectureCode.src.lesson2.lecture.unidirectional.oneToZeroOneEasy.*;

public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		cust.addCart();
		cust.getCart().addItem(new Item("Shirt"));
		System.out.println(
			cust.getCart().getItems());
		
		
	}
	
}

		
