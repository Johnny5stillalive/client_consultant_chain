package com.t3project.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mysql.cj.xdevapi.Client;

@Entity
@Table(name="RESUME_SUBMISSION")
public class ResumeSubmission {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RESUME_SUBMISSION_ID")
	private Integer id;
	
	@MapsId
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="RESUME_ID")
	private Resume resume;
	
	@MapsId
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CLIENT_ID")
	private Client client;
	
	@MapsId
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="VENDOR_ID")
	private Vendor vendor;
	
	@Column(name="DATE")
	private Date date;

	
	
}	