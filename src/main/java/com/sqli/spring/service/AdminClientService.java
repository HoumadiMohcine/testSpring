package com.sqli.spring.service;

import java.util.List;

import com.sqli.spring.beans.Client;


public interface AdminClientService {
	Client addClient(Client client);
	List<Client> listClient();
	Client getClientById(String cne);
	void deleteClient(String cne);

}
