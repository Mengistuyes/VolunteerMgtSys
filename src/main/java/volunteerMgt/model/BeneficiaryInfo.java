package volunteerMgt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class BeneficiaryInfo {
	@Id @GeneratedValue
	private int beneficiaryId;
	private String beneficiaryName;
	private String beneficiaryEmail;	
	//other information can be included here like Amount
	BeneficiaryInfo()
	{
		
	}
	public int getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getBeneficiaryEmail() {
		return beneficiaryEmail;
	}
	public void setBeneficiaryEmail(String beneficiaryEmail) {
		this.beneficiaryEmail = beneficiaryEmail;
	}
	
}
