package com.adaming.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adaming.entity.Client;

/**
 * 
 * @author IN-LY-023
 *
 */

public interface IClientService {

		public Client save (Client client);
	
		public Client update(Client client);

		public void delete(Client client);

		public Client findById(Integer id);

		public List<Client> findAll();

		public List<Client> findByNomAndNom(String nom, String prenom);

}