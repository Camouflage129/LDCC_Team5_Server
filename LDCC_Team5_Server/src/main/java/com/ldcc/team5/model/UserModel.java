package com.ldcc.team5.model;

import java.sql.Date;

public class UserModel {
	String id;
	String pw;
	String name;
	String affiliation;
	String preference;
	String region;
	Date date;
	
	public UserModel() {
		super();
	}

	public UserModel(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public UserModel(String id, String pw, String name, String affiliation, String preference, String region,
			Date date) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.affiliation = affiliation;
		this.preference = preference;
		this.region = region;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getAffiliation() {
		return affiliation;
	}
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
	public String getPreference() {
		return preference;
	}
	public void setPreference(String preference) {
		this.preference = preference;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", pw=" + pw + ", affiliation=" + affiliation + ", preference=" + preference
				+ ", region=" + region + ", date=" + date + "]";
	}
}
