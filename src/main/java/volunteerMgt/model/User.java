package volunteerMgt.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User { // user can be volunteer or Administrator
	@Id @GeneratedValue
	private int userid;
	private String firstName;
	private String lastName;
	@OneToOne
	@JoinColumn(name="genderId")
	private Gender gender;
	private Date dateOfBirth;
	@OneToOne
	@JoinColumn(name="accountTypeId")
	private AccountType accountType;
	@OneToMany
	@JoinColumn(name="addressId")
	private List<Address> address;
	
	private static DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,
			Locale.US);
	private static DateFormat tf = DateFormat.getTimeInstance(DateFormat.SHORT,
			Locale.US);
	
	User()
	{
		
	}
	
	public User(String firstName, String lastName, Gender gender, String dateOfBirth, AccountType accountType,
			List<Address> address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		setDateOfBirth(dateOfBirth);
		this.accountType = accountType;
		this.address = address;
	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return df.format(dateOfBirth);
	}
	public void setDateOfBirth(String dateOfBirth) {
		try {
			this.dateOfBirth = df.parse(dateOfBirth);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	

}
