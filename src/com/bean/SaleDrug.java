package com.bean;

public class SaleDrug {

	/**
	 * id			int		主键
		customer_id	varchar	顾客号
		drug_id		varchar	药品编码
		sale_number	int		销售量
		date		varchar	销售日期
		price		double	零售价
	 */
	private Integer id;
	private String customer_id;
	private String drug_id;
	private Integer sale_number;
	private String date;
	private Double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getDrug_id() {
		return drug_id;
	}
	public void setDrug_id(String drug_id) {
		this.drug_id = drug_id;
	}
	public Integer getSale_number() {
		return sale_number;
	}
	public void setSale_number(Integer sale_number) {
		this.sale_number = sale_number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
