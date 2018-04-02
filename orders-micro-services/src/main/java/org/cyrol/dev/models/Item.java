package org.cyrol.dev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

	@Column(name = "produit")
	private Long productId;
	
	private int quantity;
	
	private MonetaryAmount price;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	protected Item() {

	}

	public Item(Long id, MonetaryAmount price) {
		this.productId = id;
		this.price = price;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(long id) {
		this.productId = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public MonetaryAmount getPrice() {
		return price;
	}

	public void setPrice(MonetaryAmount price) {
		this.price = price;
	}

}