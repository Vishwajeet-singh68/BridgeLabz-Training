package healthclinic.models;

import java.time.LocalDate;

public class Patient {
	private String name;
	private LocalDate dob;
	private long contact;
	private String address;
	private String bloodGroup;
	
	
	public Patient(String name, LocalDate dob, long contact, String address, String bloodGroup) {
		this.name = name;
		this.dob = dob;
		this.contact = contact;
		this.address = address;
		this.bloodGroup = bloodGroup;
	}


	public String getName() {
		return name;
	}


	public LocalDate getDob() {
		return dob;
	}


	public long getContact() {
		return contact;
	}


	public String getAddress() {
		return address;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}
}
