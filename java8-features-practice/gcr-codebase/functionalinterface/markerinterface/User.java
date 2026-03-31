package functionalinterface.markerinterface;

public class User implements BackupSerializable{
	String name;
	int age;
	
	User(String name, int age){
		this.name=name;
		this.age=age;
	}
}
