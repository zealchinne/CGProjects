package com.jojuskills;

public class Product{
	private int prodid;
	private String prodName;
	private double price;
	public Product() {
		super();
	}
	
	public Product(int prodid, String prodName, double price) {
		super();
		this.prodid = prodid;
		this.prodName = prodName;
		this.price = price;
	}

	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodName=" + prodName + ", price=" + price + "]";
	}

	public Product stream() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object filter(Product object) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product filter(Object object) {
		// TODO Auto-generated method stub
		return null;
	} 
	
}