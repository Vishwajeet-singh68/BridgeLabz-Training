package functionalinterface;


interface Sensitive{
	
}

class Data implements Sensitive{
	String secretKey;
	int securityPin;
	
	Data(String secretKey, int securityPin){
		this.secretKey = secretKey;
		this.securityPin = securityPin;
	}
}

public class SensitiveMain {
	public static void main(String[] args) {
		Sensitive data = new Data("fkahnuirea216845312",5689);
		String s = "hellow world";
		
		if (data instanceof Sensitive) {
			System.out.println("Data Marked Sensitive");			
		} else {
			System.out.println("Not sensitive");
		}
		
		if ((Object)s instanceof Sensitive) {
			System.out.println("Data Marked Sensitive");			
		} else {
			System.out.println("Not sensitive");
		}
	}
}
