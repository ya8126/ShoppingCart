package jp.itacademy.samples.web;

public class Goods {
	
	private int no;
	private String name;
	private int price;
	private int stock;
	
	public Goods(int no, String name, int price, int stock) {
		this.no = no;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

}
