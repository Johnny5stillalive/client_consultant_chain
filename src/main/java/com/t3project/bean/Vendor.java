package com.t3project.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name="Vendor")
public class Vendor 
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "VENDOR_ID")
	private int id;

	//First name, last name? Let's keep it simple for now as whatever they want..
	@Column(name = "NAME")
	private String name;

	//Should we include an Address class? We can keep this as a string for now.
	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "SALARY")
	private double salary;

	//How should we set these up? Can I do two?
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="vendor", cascade=CascadeType.ALL)
	@JoinColumn(name="CONSULTANT_ID")
	private List<Consultant> consultant; // Our vendor receives many resumes from many consultants.
										 // Will Jacob provide a Resume class? Should we just use an id?
										 // Can I just store a list of Ids instead of consultant objects?
	
	//I don't believe I need this relationship. What does matter is the client-consultant relationship, right?
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="vendor", cascade=CascadeType.ALL)
	@JoinColumn(name="CLIENT_ID")
	private List<Client> client; // Our vendor(s) may send resumes to many clients We have a possible MtM
								 // relationship here. How do we resolve it?
								 // A vendor may send many different resumes to many different clients.
								 // We should have to check the client's relationship to the consultant?
								 // Would I do this statement in order to check the client's relationships?
								 // This would simply check which clients our vendor has gotten involved with, if anything.
	


}
