package com.sqli.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sqli.spring.beans.Client;
import org.springframework.stereotype.Service;


@Service
public class AdminClientServiceImpl implements AdminClientService {
	Map<String, Client> clients=new HashMap<String, Client>();

	@Override
	public Client addClient(Client client) {
		// TODO Auto-generated method stub
		clients.put(client.getClientName(), client);
		return client;
	}

	@Override
	public List<Client> listClient() {
		// TODO Auto-generated method stub
		List<Client> listeClient=new ArrayList<Client>(clients.values());
		return listeClient;
	}

	@Override
	public void deleteClient(String name) {
		clients.remove(name);
		
	}

	@Override
	public Client getClientById(String name) {
		// TODO Auto-generated method stub
		return clients.get(name);
	}

}
