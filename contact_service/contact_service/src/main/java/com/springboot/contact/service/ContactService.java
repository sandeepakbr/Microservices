package com.springboot.contact.service;

import java.util.List;

import com.springboot.contact.bean.Contact;

public interface ContactService {
	
	public List<Contact> getContact(Long id);
	
	public List<Contact> getContactList(Contact contact);

}
