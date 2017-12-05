package volunteerMgt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AccountType {
	@Id @GeneratedValue
	private int accountTypeId;
	private String accountTypeName;
	public AccountType()
	{
		
	}
	public AccountType(String accountTypeName)
	{
		this.accountTypeName=accountTypeName;
	}
	public int getAccountTypeId() {
		return accountTypeId;
	}
	public void setAccountTypeId(int accountTypeId) {
		this.accountTypeId = accountTypeId;
	}
	public String getAccountTypeName() {
		return accountTypeName;
	}
	public void setAccountTypeName(String accountTypeName) {
		this.accountTypeName = accountTypeName;
	}
	
}
