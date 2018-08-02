package com.ldcc.team5.model;

import java.sql.Date;

public class ProductInfoModel {
	int num;
	String code;
	String region;
	String id;
	String volume;
	int weight;
	String address;
	String recipient;
	String phone;
	Date date;
	String delivery_complete;
	int sort_num;
	
	public ProductInfoModel() {
		super();
	}

	public ProductInfoModel(String id, Date date) {
		super();
		this.id = id;
		this.date = date;
	}

	public ProductInfoModel(String code, String delivery_complete) {
		super();
		this.code = code;
		this.delivery_complete = delivery_complete;
	}
	
	public ProductInfoModel(String id, Date date, String delivery_complete) {
		super();
		this.id = id;
		this.date = date;
		this.delivery_complete = delivery_complete;
	}

	public ProductInfoModel(int num, String code, String region, String id, String volume, int weight, String address,
			String recipient, String phone, Date date, String delivery_complete, int sort_num) {
		super();
		this.num = num;
		this.code = code;
		this.region = region;
		this.id = id;
		this.volume = volume;
		this.weight = weight;
		this.address = address;
		this.recipient = recipient;
		this.phone = phone;
		this.date = date;
		this.delivery_complete = delivery_complete;
		this.sort_num = sort_num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDelivery_complete() {
		return delivery_complete;
	}

	public void setDelivery_complete(String delivery_complete) {
		this.delivery_complete = delivery_complete;
	}

	public int getSort_num() {
		return sort_num;
	}

	public void setSort_num(int sort_num) {
		this.sort_num = sort_num;
	}

	@Override
	public String toString() {
		return "ProductInfoModel [num=" + num + ", code=" + code + ", region=" + region + ", id=" + id + ", volume="
				+ volume + ", weight=" + weight + ", address=" + address + ", recipient=" + recipient + ", phone="
				+ phone + ", date=" + date + ", delivery_complete=" + delivery_complete + ", sort_num=" + sort_num
				+ "]";
	}
}
