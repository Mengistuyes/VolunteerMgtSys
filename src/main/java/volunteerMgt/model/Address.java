package volunteerMgt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Address {
	@Id @GeneratedValue
	private int addressId;
	private String country;
	private String state;
	private String city;
	private String address1;
	private String address2;
	private int zipCode;
	private String phoneNo;
	Address()
	{
		
	}
	
	public Address(String country, String state, String city, String address1, String address2, int zipCode,
			String phoneNo) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.address1 = address1;
		this.address2 = address2;
		this.zipCode = zipCode;
		this.phoneNo = phoneNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
