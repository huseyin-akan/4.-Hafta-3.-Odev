package Entities;
import java.util.Date;

public class Campaign {
	private int id;	
	private double discountRate;
	private String name;
	private Date expirationDate;
	
	public Campaign(int id, double discountRate, String name, Date expirationDate) {
		super();
		this.id = id;
		this.discountRate = discountRate;
		this.name = name;
		this.expirationDate = expirationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
}
