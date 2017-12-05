package volunteerMgt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Task {
	@Id @GeneratedValue
	private int Taskid;
	@Temporal(TemporalType.DATE)
	private Date tStartDate;
	@Temporal(TemporalType.DATE)
	private Date tEndDate;
	@OneToOne
	@JoinColumn(name="typeOfResourceId")
	private TypeOfResource typeOfResource;
	private int NoOfResNeeded;
	Task()
	{
		
	}
	public int getTaskid() {
		return Taskid;
	}
	public void setTaskid(int taskid) {
		Taskid = taskid;
	}
	public Date gettStartDate() {
		return tStartDate;
	}
	public void settStartDate(Date tStartDate) {
		this.tStartDate = tStartDate;
	}
	public Date gettEndDate() {
		return tEndDate;
	}
	public void settEndDate(Date tEndDate) {
		this.tEndDate = tEndDate;
	}
	public TypeOfResource getTypeOfResource() {
		return typeOfResource;
	}
	public void setTypeOfResource(TypeOfResource typeOfResource) {
		this.typeOfResource = typeOfResource;
	}
	public int getNoOfResNeeded() {
		return NoOfResNeeded;
	}
	public void setNoOfResNeeded(int noOfResNeeded) {
		NoOfResNeeded = noOfResNeeded;
	}
	
	
}
