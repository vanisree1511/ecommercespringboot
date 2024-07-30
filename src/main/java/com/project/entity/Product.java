package com.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private double price;
	private double weight;
	private String description;
	private String imageName;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="category_id",referencedColumnName="category_id")
	private Category category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Product(long id, String name, double price, double weight, String description, String imageName,
			Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.description = description;
		this.imageName = imageName;
		this.category = category;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + ", description="
				+ description + ", imageName=" + imageName + ", category=" + category + "]";
	}
	
}
