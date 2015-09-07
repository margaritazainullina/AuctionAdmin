package com.ith.auctionadmin.service;

import java.util.List;
import com.ith.auctionadmin.domain.Contact;

public interface ContactService {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}
