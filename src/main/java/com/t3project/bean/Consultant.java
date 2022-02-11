package com.t3project.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name = "CONSULTANT")
public class Consultant {

	@Id
	@GeneratedValue
	@Column(name = "CONSULTANT_ID")
	private int consultantId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "CONTACT_INFO")
	private String contactInfo;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="consultant", cascade=CascadeType.ALL)
	private List<Client> resumesToClients = new ArrayList<Client>();
	
}
