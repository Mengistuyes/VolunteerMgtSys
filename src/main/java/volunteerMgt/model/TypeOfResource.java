package volunteerMgt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class TypeOfResource {
	@Id @GeneratedValue
	private int typeOfResourceId;
	private String ResourceName;
	TypeOfResource()
	{
		
	}
	public int getTypeOfResourceId() {
		return typeOfResourceId;
	}
	public void setTypeOfResourceId(int typeOfResourceId) {
		this.typeOfResourceId = typeOfResourceId;
	}
	public String getResourceName() {
		return ResourceName;
	}
	public void setResourceName(String resourceName) {
		ResourceName = resourceName;
	}
	
}
