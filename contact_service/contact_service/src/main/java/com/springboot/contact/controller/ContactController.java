package com.springboot.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.contact.bean.Contact;
import com.springboot.contact.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/{employeeId}")
	public List<Contact> getContact(@PathVariable("employeeId") Long employeeId){
		return contactService.getContact(employeeId);
	}
	
	@GetMapping("/contactList")
	public List<Contact> getContactList(Contact contact){
		return contactService.getContactList(contact);
		
	}

}
