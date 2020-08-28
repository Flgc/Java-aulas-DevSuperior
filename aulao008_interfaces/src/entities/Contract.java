package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer numbers;
	private Date date;
	private Double totalValue;
	
	List<Installment> installments = new ArrayList<Installment>();		//Association
	
	public Contract() {		//Empty constructor
	}

	public Contract(Integer numbers, Date date, Double totalValue) {	//Argument constructor 
		this.numbers = numbers;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumbers() {		// Getters and settings constructor
		return numbers;
	}

	public void setNumbers(Integer numbers) {
		this.numbers = numbers;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {	// Getters for List<Installment>
		return installments;						// Don't make changes, just add and remove
	}

}
