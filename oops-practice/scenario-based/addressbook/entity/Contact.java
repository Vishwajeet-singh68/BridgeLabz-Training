package addressbook.entity;

public class Contact {
	private String firstName, lastName, address, city, state, addressBookName;
	private int zipCode;
	private long phoneNumber;
	
	public Contact(String firstName, String lastName, String address, String city, String state, int zipCode,
			long phoneNumber, String addressBookName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.addressBookName = addressBookName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj==null || obj.getClass()!=getClass())
			return false;
		
		Contact c = (Contact) obj;
		
		return zipCode == c.zipCode &&
		           phoneNumber == c.phoneNumber &&
		           firstName.equals(c.firstName) &&
		           lastName.equals(c.lastName) &&
		           address.equals(c.address) &&
		           city.equals(c.city) &&
		           state.equals(c.state) &&
		           addressBookName.equals(c.addressBookName);
	}

	//Getter and setter 
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddressBookName() {
		return addressBookName;
	}

	public void setAddressBookName(String addressBookName) {
		this.addressBookName = addressBookName;
	}
	
}
