package application;

import services.OnlinePaymentService;
import services.PaypalService;

public class Program {
	
	public static void main(String[] args) {
		
		//calculate Sample 
		OnlinePaymentService ps = new PaypalService();
		
		System.out.println(ps.paymentFree(200.00));		//Taxa de pagamento sobre R$ 200,00
		
		System.out.println(ps.interest(200.00, 3));		//Juro sobre R$ 200,00 após 3 meses
	}
}
