package com.tnsif.dayfive.multilevelinheritance;

public class City  extends Country{
	private String cityName;
	private float area;
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getStateName()=" + getStateName()
				+ ", getLanguage()=" + getLanguage() + ", toString()=" + super.toString() + ", getCountryName()="
				+ getCountryName() + ", getCapital()=" + getCapital() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	

}
