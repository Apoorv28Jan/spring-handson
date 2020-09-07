package annotations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pno")
	private int pno;
	
	@Column(name="pname")
	private String pname;
	
	@Column(name="price")
	private int price;

	@JoinColumn(name="pno")
	@OneToMany(targetEntity=Supplier.class, cascade=CascadeType.ALL)  
	private List<Supplier> supplierList = new ArrayList<Supplier>();	//PERSIST -  auto saved supplier if product is saved
																		// REMOVE - auto delete supplier if product is deleted
																		// MERGE - auto updated supplier if product is updated
																		// ALL

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Supplier> getSupplierList() {
		return supplierList;
	}

	public void setSupplierList(List<Supplier> supplierList) {
		this.supplierList = supplierList;
	}
	
	
	
	
}
