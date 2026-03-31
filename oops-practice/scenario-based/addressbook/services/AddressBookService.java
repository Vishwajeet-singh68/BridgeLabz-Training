package addressbook.services;

import java.util.*;
import addressbook.entity.Contact;
import addressbook.repository.*;

public class AddressBookService {
	
	Scanner in = new Scanner(System.in);
    private AddressRepository addressBookRepository;

    public AddressBookService() {
        addressBookRepository = new Database();
    }
    
    //add contact
    public void addContact(Contact newContact) {
    	try {
    		addressBookRepository.add(newContact);
    	}
    	catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
    
    //add multiple contacts
    public void addContact(List<Contact> newContact) {
    	for(Contact c:newContact) {
    		addContact(c);
    	}
    }
    
    //edit by name
    public void editByName(String name, Contact editedContact) {
    	try {
    		List<Contact> availableContacts = addressBookRepository.findByName(name);
        	int choice = display(availableContacts);
        	addressBookRepository.edit(availableContacts.get(choice), editedContact);
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
    
    //delete by name
    public void deleteByName(String name) {
    	try {
    		List<Contact> availableContacts = addressBookRepository.findByName(name);
        	int choice = display(availableContacts);
        	addressBookRepository.delete(availableContacts.get(choice));
    	}
    	catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
    
    public List<Contact> searchByCityOrState(String cityOrState) {
    	List<Contact> found = new ArrayList<>();
    	for(Contact c: allContacts()) {
    		if(c.getCity().equals(cityOrState) || c.getState().equals(cityOrState)) {
    			found.add(c);
    		}
    	}
    	return found;
    }
    
    public List<Contact> allContacts(){
    	return addressBookRepository.getAllContact();
    }
    
    private int display(List<Contact> contact) {
    	int count=0;
    	for(Contact c:contact) {
    		System.out.println((count++)+" "+ c.getFirstName()+" "+c.getLastName()+"\n");
    		System.out.println("  "+ c.getAddress()+"\n");
    		System.out.println("  "+ c.getCity()+"\n");
    		System.out.println("  "+ c.getState()+"\n");
    		System.out.println("  "+ c.getZipCode()+"\n");
    		System.out.println("  "+ c.getPhoneNumber()+"\n");
    		System.out.println("-------------------------------------------");
    	}
    	System.out.println("Enter which contact to edit: (0-"+(contact.size()-1)+")");
    	int n=in.nextInt();
    	return n;
    }
}

