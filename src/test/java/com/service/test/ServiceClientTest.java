package com.service.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.SpringBootRunner;

import com.adaming.dao.IClientRepository;
import com.adaming.entity.Client;
import com.adaming.service.ClientServiceImpl;





@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootRunner.class)
public class ServiceClientTest {


	//Declarer un logger
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceClientTest.class);


	    private ClientServiceImpl clientService;


	//Creer faux repository 

		@Mock
	private IClientRepository clientRepository;

	/**
	 * Preparing the class to accept the use of the @Mock annotation
	 */
	@Before
	  public final void setUp() {
	    MockitoAnnotations.initMocks(this);
	   clientService = new ClientServiceImpl(clientRepository);
	}



//	// Test que methodes dao sont bien appelées par ce service là
//	@Test
//	public void should_store_when_save_is_called() { 
//		LOGGER.info("--------------- Executing should_store_when_save_is_called test Of ClientServiceTest ---------------");
//		Client myClient = new Client();
//		clientService.add(myClient);
//		Mockito.verify(clientRepository).save(myClient); // pour tracker l'objet
//	}

//	@Test
//	public void should_update_when_update_is_called() {
//		LOGGER.info("--------------- Executing should_update_when_update_is_called test Of UserServiceImplTest ---------------");
//		Client myClient = new Client();
//		clientService.update(myClient);
//		Mockito.verify(clientRepository).save(myClient);
//	}
//
//

	


	// Test delete methode
	@Test
	public void should_delete_when_delete_is_called() {
		LOGGER.info("--------------- Executing should_delete_when_delete_is_called test Of ClientServiceTest  ---------------");
		Client client = new Client();
		clientService.delete(client);
		Mockito.verify(clientRepository).save(client);
	}
	
//	// Test findById methode ( findById(Integer id) )
//	@Test
//	public void should_search_by_id_when_findById_is_called() {
//		LOGGER.info("--------------- Executing should_search_by_id_when_findById_is_called test Of ClientServiceTest  ---------------");
//		clientService.findById(new Integer(1));
//		Mockito.verify(clientRepository).findById(new Integer(1));
//	}
//
//	// Test findAll methode
//	@Test
//	public void should_search_all_when_findAll_is_called() {
//		LOGGER.info("--------------- Executing should_search_all_when_findAll_is_called test Of ClientServiceTest  ---------------");
//		clientService.findAll();
//		Mockito.verify(clientRepository).findAll();
//	}
//
//	// Test findFirst1ByNomAndNom methode (findFirst1ByNomAndNom(String prenom, String nom)
//	@Test
//	public void should_search_by_user_when_findByUserCreator_is_called() {
//		LOGGER.info("--------------- Executing should_search_by_user_when_findByUserCreator_is_called test Of ClientServiceTest  ---------------");
//		clientService.findFirst1ByNomAndNom(new String ("prenom"), new String ("nom"));
//		Mockito.verify(clientRepository).findFirst1ByNomAndNom(new String ("prenom"), new String ("nom"));
//	}
}