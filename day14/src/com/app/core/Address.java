package com.app.core;

import java.io.Serializable;

public class Address implements Serializable{
	private String cityName;
	private String stateName;
	private String countryName;
	public Address(String cityName, String stateName, String countryName) {
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", stateName=" + stateName + ", countryName=" + countryName + "]";
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
}
