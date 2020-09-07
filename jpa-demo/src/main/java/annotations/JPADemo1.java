package annotations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JPADemo1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();

		Product p = new Product();
		List<Supplier> sList = new ArrayList<Supplier>();
		
		p.setPname("Mobile");
		p.setPrice(20000);
		
		Supplier s1 = new Supplier();
		s1.setSname("supplier1");
		sList.add(s1);
		
		Supplier s2 = new Supplier();
		s2.setSname("supplier2");
		sList.add(s2);
		
		p.setSupplierList(sList);
		
		em.persist(p);
			
		transaction.commit();
	}

}
