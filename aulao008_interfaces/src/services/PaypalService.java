package services;

public class PaypalService implements OnlinePaymentService {

	//hard code for implementation
	public static final double PAYMENT_FREE = 0.02;
	public static final double MONTHLY_INTEREST = 0.01;
	
	
	//Time:  37:21
	
	//Automatic method implementation
	@Override
	public double paymentFree(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double interest(double amount, int months) {
		// TODO Auto-generated method stub
		return 0;
	}

}
