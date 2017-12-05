package volunteerMgt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Gender {
	@Id @GeneratedValue
	private int genderId;
	private String genderName;
	Gender()
	{
		
	}
	public Gender(String genderName)
	{
		this.genderName=genderName;
	}
	public int getGenderId() {
		return genderId;
	}
	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}
	public String getGenderName() {
		return genderName;
	}
	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
	
}
