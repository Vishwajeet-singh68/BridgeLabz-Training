package addressbook.repository;

import addressbook.entity.Contact;
import java.util.*;

public interface AddressRepository {
	void add(Contact contact) throws DatabaseException;
	void edit(Contact oldContact, Contact newContact);
	void delete(Contact contact);
	List<Contact> findByName(String name) throws DatabaseException;
	List<Contact> getAllContact();
	void addAddressBook(String addresssBookName)throws DatabaseException;
}
