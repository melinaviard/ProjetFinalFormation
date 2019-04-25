package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
import com.adaming.entity.Client;


@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	ClientServiceImpl clientService;
	
	//Get method
	@GetMapping(value = "/all_client")

	public List<Client> findAll() {
		return clientService.findAll();
	}

	//Add method
	public Client addClient(@RequestBody Client client) {
		System.out.println(client.getNom());
		return this.clientService.add(client);
	}

	//Update method
	@PutMapping("/{id}")
	public Client updateClient(@RequestBody Client client, @PathVariable int id_client) {
		if (clientService.findById(id_client) == null) {
			return null;
		} else {
			return clientService.add(client);
		}
	}
	
	@DeleteMapping("/{id}")
	public void deleteClient(@PathVariable int id_client){
		if(clientService.findById(id_client)!= null){
			clientService.delete(clientService.findById(id_client));
		}
	}
}
