package pe.com.dyd.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.dyd.contacts.dao.ContactRepository;
import pe.com.dyd.contacts.dto.Contact;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository dao;
	
	public Contact save(Contact contact) {
		return dao.saveAndFlush(contact);
	}

}
