package Entities;

import java.math.BigDecimal;


public class Game implements Entity{

	private int id;
	private String name;
	private BigDecimal price;	
	//game size in MB
	private int mbSize;
	
	public Game(int id, String name, BigDecimal price, int mbSize) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.mbSize = mbSize;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getMbSize() {
		return mbSize;
	}

	public void setMbSize(int mbSize) {
		this.mbSize = mbSize;
	}


}
