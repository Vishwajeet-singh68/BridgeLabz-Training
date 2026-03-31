package functionalinterface.PaymentGatewayIntegration;

public class RazorPay implements Payment {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paymenet processing via Razorpay of "+amount);;
	}
}
