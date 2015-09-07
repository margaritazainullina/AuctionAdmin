package com.ith.auctionadmin.service;
 
import java.util.List;

import com.ith.auctionadmin.dao.ContactDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ith.auctionadmin.domain.Contact;
 
@Service
public class ContactServiceImpl implements ContactService {
 
    @Autowired
    private ContactDAO contactDAO;
 
    @Transactional
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }
 
    @Transactional
    public List<Contact> listContact() {
 
        return contactDAO.listContact();
    }
 
    @Transactional
    public void removeContact(Integer id) {
        contactDAO.removeContact(id);
    }
}
