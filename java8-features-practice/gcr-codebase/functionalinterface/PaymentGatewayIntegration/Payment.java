package functionalinterface.PaymentGatewayIntegration;

public interface Payment {
	void processPayment(double amount);
	
	default void refund(double amount) {
		System.out.println("Default refund of "+amount);
	}
}
