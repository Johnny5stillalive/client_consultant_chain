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

import com.t3project.bean.Vendor;

@Entity
@Table(name="Client")
public class Client {

	@Id
	@GeneratedValue
	@IndexColumn(name="CLIENT_ID")
	private int id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "CONTACT_INFO")
	private String contactInfo;

	//Should we include an Address class? We can keep this as a string for now.
	@Column(name = "ADDRESS")
	private String address;

	
//	//We need to resolve a many to many relationship here. 
//	// Do we keep track of which vendors reached out to which clients?
//	// Does this matter?
//	//Do I do a @JoinByColumn?
//	@LazyCollection(LazyCollectionOption.FALSE)
//	@OneToMany(mappedBy="client", cascade=CascadeType.ALL)
//	private List<Vendor> vendor;

	
	
}
