package volunteerMgt.control;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import volunteerMgt.model.AccountType;
import volunteerMgt.model.Address;
import volunteerMgt.model.Gender;
import volunteerMgt.model.User;



public class Application {

	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("volunteerMgt");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) {

	//	addProject();
		addUser();
	//	addTask();
	//  addTypeOfResource
	//  addBeneficiaryInfo
	//	printReport();
		emf.close();
	}
	private void addAccountType()
	{
				EntityManager em=emf.createEntityManager();
				EntityTransaction et=em.getTransaction();
				et.begin();
				try
				{
					AccountType accountType=new AccountType();
					accountType.setAccountTypeName("Volunteer");
					em.persist(accountType);
					et.commit();
				} catch (Throwable e) {
					if ((et != null) && (et.isActive())) et.rollback();
				} finally {
				if ((em != null) && (em.isOpen())) em.close();
			}
				
	}
	
	private static void addUser()//Add Volunteer and Administator
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		try
		{
			AccountType accountType=new AccountType("Volunteer");
			accountType.getAccountTypeId();
			Address address=new Address("USA","Iowa","FairField","add1","add2",22344,"21315456");
			List<Address> listOfAddress=new ArrayList<Address>();
			listOfAddress.add(address);
			Gender gender=new Gender("Male");
			User user=new User("Mengistu","Bogale",gender,"08/12/2000",accountType,listOfAddress);
			em.persist(user);
		et.commit();
	} catch (Throwable e) {
		if ((et != null) && (et.isActive())) et.rollback();
	} finally {
		if ((em != null) && (em.isOpen())) em.close();
	}
		
	}
	private void addTask()
	{
		
	}
	private void addTypeOfResource()
	{
		
	}
	private void addProject()
	{
		
	}
}
