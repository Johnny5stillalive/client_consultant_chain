package com.t3project.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Entity
@Table(name = "CLIENT")
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CLIENT_ID")
	private int id;
	
	@MapsId
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "CONSULTANT_ID")
	private Consultant consultant;
	
}
