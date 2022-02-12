package com.t3project.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="Client")
public class Client {

	@Id
	@GeneratedValue
	@IndexColumn(name="CLIENT_ID")
	private Integer id;
	
	
	//This will depend on Jacob's provided class.
	// This probably needs to be a list?
	// I provided an attempt at a list below.	
	@MapsId
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="CONSULTANT_ID")
	private Consultant consultant;
	

	//Should we include an Address class? We can keep this as a string for now.
	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "NAME")
	private String name;
	
	//We need to resolve a many to many relationship here. 
	// Do we keep track of which vendors reached out to which clients?
	// Does this matter?
	//Do I do a @JoinByColumn?
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="vendor", cascade=CascadeType.ALL)
	private List<Vendor> vendor;

	
	// Getters and Setters:
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public void setEmployee(Employee employee) {
		this.consultant = consultant;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String company) {
		this.name = company;
	}

	public Consultant getConsultant() {
		return consultant;
	}

	public void setConsultant(Consultant consultant) {
		this.consultant = consultant;
	}

	public List<Vendor> getVendor() {
		return vendor;
	}

	public void setVendor(List<Vendor> vendor) {
		this.vendor = vendor;
	}
	
	
}
