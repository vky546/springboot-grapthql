package com.demo.graphqldemo.payloads;

public class BookInput {
	
	private String title;
	private String desc;
	private double price;
	private String author;
	private int pages;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public BookInput(String title, String desc, double price, String author, int pages) {
		super();
		this.title = title;
		this.desc = desc;
		this.price = price;
		this.author = author;
		this.pages = pages;
	}
	public BookInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
