package healthclinic.repository;

import java.sql.*;
import healthclinic.db.DBConnection;
import healthclinic.models.Patient;

public class PatientRepository {

	//Register new Patient
    public boolean registerPatient(Patient p) {
        String sql = """
                INSERT INTO Patient
                (name, dob, contact, address, blood_group)
                VALUES (?, ?, ?, ?, ?)
                """;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, p.getName());
            statement.setDate(2, java.sql.Date.valueOf(p.getDob()));
            statement.setLong(3, p.getContact());
            statement.setString(4, p.getAddress());
            statement.setString(5, p.getBloodGroup());

            int rows = statement.executeUpdate();

            return rows > 0;

        } catch (SQLException e) {
            throw new RuntimeException("Failed to register patient", e);
        }
    }
    
    //Update patient information
    public void update() {
    	
    }
    
    //search by phone
    public boolean searchByPhone(long contact) {
    	String sql = "Select * from Patient WHERE contact = ?";
    	
    	try (Connection conn = DBConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
    		statement.setLong(1, contact);
    		
    		ResultSet rs = statement.executeQuery();
    		
    		return rs.next();
        } catch (SQLException e) {
           throw new RuntimeException("Internal error!!", e);
        }
    }
}
