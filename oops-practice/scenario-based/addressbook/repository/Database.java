package addressbook.repository;

import java.util.*;
import addressbook.entity.Contact;

public class Database implements AddressRepository {
	private Map<String,List<Contact>> addressBook;
	
	public Database(){
		addressBook = new HashMap<>();
	}
	
	public boolean isDuplicate(Contact contact) {
		for(String s : addressBook.keySet()) {
			for(Contact c: addressBook.get(s)) {
				if(c.equals(contact))	return true;
			}
		}
		return false;
	}
	
	@Override
	public void addAddressBook(String addressBookName) throws DatabaseException {
		if(addressBook.containsKey(addressBookName)) {
			throw new DatabaseException("Address Book already Exist!!");
		}
		addressBook.put(addressBookName,new ArrayList<>());
	}
	
	@Override
	public void add(Contact contact) throws DatabaseException {
		if(isDuplicate(contact)) {
			throw new DatabaseException("Contact already Exist!");
		}
		
		String addressBookName = contact.getAddressBookName();
		if(!addressBook.containsKey(addressBookName)) {
			addAddressBook(addressBookName);
		}
		addressBook.get(addressBookName).add(contact);
	}

	@Override
	public void edit(Contact oldContact, Contact newContact) {
		oldContact.setAddress(newContact.getAddress());
		oldContact.setCity(newContact.getCity());
		oldContact.setFirstName(newContact.getFirstName());
		oldContact.setLastName(newContact.getLastName());
		oldContact.setPhoneNumber(newContact.getPhoneNumber());
		oldContact.setState(newContact.getState());
		oldContact.setZipCode(newContact.getZipCode());
		oldContact.setAddressBookName(newContact.getAddressBookName());
	}

	@Override
	public void delete(Contact contact) {
		addressBook.get(contact.getAddressBookName()).remove(contact);
	}
	
	@Override
	public List<Contact> findByName(String firstName) throws DatabaseException{
		List<Contact> found = new ArrayList<>();
		for(String s : addressBook.keySet()) {
			for(Contact c: addressBook.get(s)) {
				if(c.getFirstName().equalsIgnoreCase(firstName)) {	
					found.add(c);
				}
			}
		}
		if(found.size()==0)
			throw new DatabaseException("No Match Found!");
		return found;
	}
	
	@Override
	public List<Contact> getAllContact() {
		List<Contact> allContacts = new ArrayList<>();
		for(String s : addressBook.keySet()) {
			for(Contact c: addressBook.get(s)) {
				allContacts.add(c);
			}
		}
		return allContacts;
	}
	
	
}
