package services;

public class PaypalService implements OnlinePaymentService {

	//hard code for implementation
	public static final double PAYMENT_FREE = 0.02;				//2% - Taxa de pagamento	
	public static final double MONTHLY_INTEREST = 0.01;			//1% - Taxa de juros mensal
	
	//Automatic method implementation
	@Override
	public double paymentFree(double amount) {
		return amount * PAYMENT_FREE;							// Retorna 2% sobre o valor do pagamento
	}

	@Override
	public double interest(double amount, int months) {
		return amount * months * MONTHLY_INTEREST;				// Retorna o juro mensal
	}

}
