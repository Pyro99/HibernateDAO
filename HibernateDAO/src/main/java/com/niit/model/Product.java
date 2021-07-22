package com.niit.model;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int prodId;
	
	@Column
	private float prodPrice;
	private String prodName;
	private String link;
	
	@Column(length = 2000000000)
	private String prodDesc;

	
	public Product() {
		super();
	}

	public Product(float prodPrice, String prodName,String prodDesc) {
		super();
		this.prodPrice = prodPrice;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public float getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	
	
	
}
