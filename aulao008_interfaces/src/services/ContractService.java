package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	/*
	 * Composition of service objects 
	 * 
	 * A classe deve ser fechada para alteração e aberta para extensão. 
	 * 
	 * open close principal 
	 * 
	 * Inversão de controle / injeção de dependência
	 * 
	 * Essa classe não possui o controle das instância necessárias do objeto.
	 * Será controlada por outra classe.
	 * 
	 */
	
	
	private OnlinePaymentService onlinePaymentService;
	
	//Injeção de dependência através do construtor da classe.
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	//Essa operação será responsálvel por instanciar os objetos das parcelas do contrato.
	public void processContract(Contract contract, int months) {
		
		double basicQuota = contract.getTotalValue()/months; //Divide o valor do contrato pelo numero de meses.
		
		for (int quota = 1; quota <= months; quota++) {
			
			//Guarda o valor atualizado com o juro do contrato por mês.
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, quota);
			
			//Aplica a taxa de pagamento e grava o valor a ser pago.
			double fullQuota = updatedQuota + onlinePaymentService.paymentFree(updatedQuota);
			
			//Guarda a data de vencimento com base na data do contrato
			Date dueDate = addMonths(contract.getDate(), quota);
			
			//Adiciona ao contrato uma nova instância com os dados dos objetos.
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}
	
	//Função auxiliar que adiciona nº meses a uma data com o Calendar
	private Date addMonths(Date date, int n) {
		Calendar calendar = Calendar.getInstance(); 
		calendar.setTime(date);					
		calendar.add(Calendar.MONTH, n);
		return calendar.getTime();
	}
		
}
