package volunteerMgt.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Project {
	@Id @GeneratedValue
	private int projectId;
	
	@OneToMany
	@JoinColumn(name="volunteerId")
	private List<User> volunteer;
	private String status;
	@Temporal(TemporalType.DATE)
	private Date pStartDate;
	@Temporal(TemporalType.DATE)
	private Date pEndDate;
	@OneToMany
	@JoinColumn(name="Taskid")
	private List<Task> Task; 
	private String description;
	private String location;//not sure this is address or just string which contains info about the location
	@OneToMany
	@JoinColumn(name="beneficiaryId")
	private List<BeneficiaryInfo> beneficiaryInfo;
	
	Project()
	{
		
	}
	public int getProjectId() {
		return projectId;
	}
	public List<User> getVolunteer() {
		return volunteer;
	}
	public void setVolunteer(List<User> volunteer) {
		this.volunteer = volunteer;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getpStartDate() {
		return pStartDate;
	}
	public void setpStartDate(Date pStartDate) {
		this.pStartDate = pStartDate;
	}
	public Date getpEndDate() {
		return pEndDate;
	}
	public void setpEndDate(Date pEndDate) {
		this.pEndDate = pEndDate;
	}
	public List<volunteerMgt.model.Task> getTask() {
		return Task;
	}
	public void setTask(List<volunteerMgt.model.Task> task) {
		Task = task;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<BeneficiaryInfo> getBeneficiaryInfo() {
		return beneficiaryInfo;
	}
	public void setBeneficiaryInfo(List<BeneficiaryInfo> beneficiaryInfo) {
		this.beneficiaryInfo = beneficiaryInfo;
	}
	
	
}
