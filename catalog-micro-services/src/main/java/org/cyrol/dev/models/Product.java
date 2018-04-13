package org.cyrol.dev.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	private String name;

	private int quantity;

	private MonetaryAmount price;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "products_subcategories", joinColumns = {
			@JoinColumn(name = "product_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "subcategory_id", referencedColumnName = "id") })
	private List<SubCategory> categories;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "products_variants", joinColumns = {
			@JoinColumn(name = "product_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "variant_id", referencedColumnName = "id") })
	private List<Variant> variants;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Product(String name, MonetaryAmount price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<SubCategory> getCategories() {
		return categories;
	}

	public void setCategories(List<SubCategory> categories) {
		this.categories = categories;
	}

}
