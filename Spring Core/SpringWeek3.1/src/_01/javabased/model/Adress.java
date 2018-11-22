package _01.javabased.model;

import org.springframework.stereotype.Component;

@Component
public class Adress {
	
	private String city;
	private String country;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Adress [city=" + city + ", country=" + country + "]";
	}
	
	

}
