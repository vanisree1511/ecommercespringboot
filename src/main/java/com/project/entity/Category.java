package com.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Category {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="category_id")
private int id;
private String name;
public Category(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Category [id=" + id + ", name=" + name + "]";
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
public Category() {
	super();
}



}
