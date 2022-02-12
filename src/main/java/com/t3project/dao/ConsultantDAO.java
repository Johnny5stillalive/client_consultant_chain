package com.t3project.dao;

import java.util.List;

import com.t3project.bean.Client;
import com.t3project.bean.Consultant;

public interface ConsultantDAO {

	void saveOrUpdateConsultant(Consultant client);
	List<Consultant> listAllConsultant();
	void deleteConsultant(int id);
	Client editConsultant(int id);
}
