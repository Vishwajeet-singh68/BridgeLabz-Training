package functionalinterface.PaymentGatewayIntegration;

public class Main {
	public static void main(String[] args) {
		Payment payPal = new PayPal();
		Payment razorpay = new RazorPay();
		
		payPal.refund(1000);
		
		razorpay.refund(5000);
	}
}
