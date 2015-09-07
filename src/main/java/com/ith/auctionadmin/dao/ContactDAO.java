package com.ith.auctionadmin.dao;

import java.util.List;
import com.ith.auctionadmin.domain.Contact;

public interface ContactDAO {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}