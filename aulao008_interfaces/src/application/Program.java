package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {
	
	public static void main(String[] args) throws ParseException {					
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter contract date");
	System.out.print("Number: ");
	Integer number = sc.nextInt();
	
	System.out.print("Date (dd/MM/yyyy): ");
	Date date = sdf.parse(sc.next());
	
	System.out.print("Contract value: ");
	Double totalValue = sc.nextDouble();
	
	//Intanciando o contrato
	Contract contract = new Contract(number, date, totalValue);
	
	System.out.print("Enter numer of installments: ");
	int nmr = sc.nextInt();
	
	//Intanciando o serviço para gerar as parcelas - Injetando a dependência com o new PaypalService
	ContractService cs = new ContractService(new PaypalService());
	
	//
	cs.processContract(contract, nmr);
	
	System.out.println("Installments: ");
	
	//Para cada installment it na lista de contrato imprime
	for (Installment it : contract.getInstallments()) {
		System.out.println(it);
	}
	
	sc.close();
		
	}
}
