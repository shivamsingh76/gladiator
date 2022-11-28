package com.lti.gladiator.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
//	@Column(name = "ORDER_ID")
	private int orderId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	User user;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productId")
	Product product;
	
	private int productOrderQty;
	
	private double productOrderPrice;
	
	@Column(length = 30)
	String timeStamp;
	


	public Order() {
		super();
	}



	public Order(int orderId, User user, Product product, int productOrderQty, double productOrderPrice,
			String timeStamp) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.product = product;
		this.productOrderQty = productOrderQty;
		this.productOrderPrice = productOrderPrice;
		this.timeStamp = timeStamp;
	}



	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public int getProductOrderQty() {
		return productOrderQty;
	}



	public void setProductOrderQty(int productOrderQty) {
		this.productOrderQty = productOrderQty;
	}



	public double getProductOrderPrice() {
		return productOrderPrice;
	}



	public void setProductOrderPrice(double productOrderPrice) {
		this.productOrderPrice = productOrderPrice;
	}



	public String getTimeStamp() {
		return timeStamp;
	}



	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", user=" + user + ", product=" + product + ", productOrderQty="
				+ productOrderQty + ", productOrderPrice=" + productOrderPrice + ", timeStamp=" + timeStamp + "]";
	}

	

}
