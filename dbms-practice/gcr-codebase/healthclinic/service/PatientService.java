package healthclinic.service;

import healthclinic.models.Patient;
import healthclinic.repository.PatientRepository;

public class PatientService {
	
	private PatientRepository repo = new PatientRepository();
	public void registerPatient(Patient newPatient){
		if(repo.searchByPhone(newPatient.getContact())) {
			throw new RuntimeException("Contact already exist!");
		}
		repo.registerPatient(newPatient);
	}
	
	
}
