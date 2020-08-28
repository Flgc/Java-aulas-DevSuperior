package services;

public interface OnlinePaymentService {
	
	//Method signature declaration
	
	double paymentFree(double amount);
	double interest(double amount, int months);

}
