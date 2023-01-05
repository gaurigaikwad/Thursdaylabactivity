package com.question1;

import java.util.ArrayList;
import java.util.Collections;


public class ProductMain {

	public static void main(String[] args) {
		Product p1=new Product(1123,"Apple iPhone 14 plus",82999);
		Product p2=new Product(1124,"One plus 10T",44999);
		Product p3=new Product(1122,"Google Pixel 7 Pro",84999);
		ArrayList<Product> al=new ArrayList<>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		System.out.println("sorting by price");
		Collections.sort(al, new ProductPrice());
		for(Product p:al)
		{
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
		System.out.println("-----------------------------");
		
		System.out.println("sorting by name");
		Collections.sort(al, new ProductName());
		for(Product p:al)
		{
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
	}
}
