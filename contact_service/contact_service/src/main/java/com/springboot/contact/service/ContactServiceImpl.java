package com.springboot.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springboot.contact.bean.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	static List<Contact> contactList = new ArrayList<Contact>();
	
	static {
		contactList.add(new Contact(100L,"Sandeep Kumar","sandeepcontact1@gmail.com",1234L));
		contactList.add(new Contact(101L,"Sandeep Kumar1","sandeepcontact2@gmail.com",1234L));
	}
	@Override
	public List<Contact> getContact(Long id) {
		// TODO Auto-generated method stub
		return this.contactList.stream().filter(contact-> contact.getEmployeeId().equals(id)).collect(Collectors.toList());
	}
	@Override
	public List<Contact> getContactList(Contact contact) {
		// TODO Auto-generated method stub
		
		ArrayList<Contact> cList = new ArrayList<Contact>();
		for(Contact contacts : contactList){
			cList.add(contacts);
		}
		return cList;
	}

	
}
