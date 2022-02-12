package com.t3project.dao;

import java.util.List;

import com.t3project.bean.Client;

public interface ClientDAO {

	void saveOrUpdateClient(Client client);
	List<Client> listAllClient();
	void deleteClient(int id);
	Client editClient(int id);
	
}
