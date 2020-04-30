package com.springsamples.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="order_DB")
public class Vendor {
	public Vendor() {

	}

	@Id
	private int vendornumber;
	private String name;
	private String country;
	private String city;
	private String district ;
	private String region;

	private List<CompanyData> compdata;




	public int getVendornumber() {
		return vendornumber;
	}

	public void setVendornumber(int vendornumber) {
		this.vendornumber = vendornumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}





	public List<CompanyData> getCompdata() {
		return compdata;
	}

	public void setCompdata(List<CompanyData> compdata) {
		this.compdata = compdata;
	}


}
