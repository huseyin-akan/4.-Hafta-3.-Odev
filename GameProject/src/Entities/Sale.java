package Entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Sale implements Entity{
	private int id;
	private int gameId;
	private int MemberId;
	private LocalDate saleDate;
	private BigDecimal salePrice;
	
	public Sale(int gameId, int memberId, LocalDate saleDate, BigDecimal salePrice) {
		this.gameId = gameId;
		MemberId = memberId;
		this.saleDate = saleDate;
		this.salePrice = salePrice;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getMemberId() {
		return MemberId;
	}
	public void setMemberId(int memberId) {
		MemberId = memberId;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public BigDecimal getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}
}
