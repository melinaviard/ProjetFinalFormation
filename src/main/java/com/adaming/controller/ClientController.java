package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.service.ClientServiceImpl;
import com.adaming.service.IClientService;
import com.adaming.entity.Client;
import com.adaming.entity.Vehicule;

/**
 * 
 * @author IN-LY-023
 *
 */

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	IClientService clientService;
	
	public ClientController(ClientServiceImpl clientServiceImpl) {
		this.clientService = clientServiceImpl;
	}

	//Get method
	@GetMapping(value = "/all_client")
	public List<Client> findAll() {
		return clientService.findAll();
	}

	//add method
		@PostMapping("/addclient")
	public Client save(@RequestBody Client client) {
	       clientService.save(client);
	        return client;
	}

	//Update method
	@PutMapping("/update")
	public ResponseEntity<Client> updateClient(Client client) {
//		if (clientService.findById(client.getId_client()) == null) {
//			return null;
//		} else {
//			return clientService.save(client);
//		}
		client = this.clientService.update(client);
		return new ResponseEntity<Client>(client, HttpStatus.OK);
	
	}

	@DeleteMapping("/delete")
	public void deleteClient(@RequestBody Client client){
			clientService.delete(client);
		}
	
	@GetMapping("/findByName")
	public  ResponseEntity<List<Client>> findByNomAndNom(@RequestBody String nom, @RequestBody String prenom){			
	List<Client> clients = this.clientService.findByNomAndNom(nom, prenom);
	return new ResponseEntity<>(clients, HttpStatus.OK);}

	

	
}