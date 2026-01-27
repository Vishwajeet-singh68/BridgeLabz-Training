package functionalinterface.PaymentGatewayIntegration;

public class PayPal implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("payment processing using PayPal of "+amount);		
	}
	
	@Override
	public void refund(double amount) {
		System.out.println("PayPal refund amount of "+amount);
	}

}
