package com.jojuskills;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ProductUsageWithStream {
	public static ArrayList<Product> productList=new ArrayList<Product>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// adding products
		productList.add(new Product(1, "HP Laptop", 45000.45));
		productList.add(new Product(2, "DELL Laptop", 47000.45));
		productList.add(new Product(3, "ACER Laptop", 35000.45));
		productList.add(new Product(4, "APPLE Laptop", 85000.45));
		productList.forEach(System.out::println);
		filtering();
		}
	private static void filtering() {
	List<Double> productPriceList =productList.stream().filter((product) -> product.getPrice() <= 49000.45)
				.map((product) -> product.getPrice()).collect(Collectors.toList());
		// display
		productPriceList.forEach((price) -> System.out.println(price)); 
	}
}
