package functionalinterface.markerinterface;

public class Main {
	public static void main(String[] args) {
		User user = new User("Vishwajeet" , 21);
		String str = "hello world";
		
		if (user instanceof BackupSerializable) {
			System.out.println("Object backed up");
		} else {
			System.out.println("Not backed up");
		}
		
		if ((Object)str instanceof BackupSerializable) {
			System.out.println("Object backed up");
		} else {
			System.out.println("Not backed up");
		}
	}
}
