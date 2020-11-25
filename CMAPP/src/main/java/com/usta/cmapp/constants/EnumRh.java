package com.usta.cmapp.constants;

public enum EnumRh {
	
	ABPOS("AB+", "AB POS"),
	ABNEG("AB-","AB NEGA"),
	APOS("A+","A POS"),
	ANEG("A-","A NEGA"),
	BPOS("B+","B POS"),
	BNEGA("B-","B NEGA"),
	OPOS("O+","O POS"),
	ONGE("O-","O NEGA");
	
	private String id;
	private String desc;
	private EnumRh(String id, String desc) {
		this.id = id;
		this.desc = desc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	
	
	


}
