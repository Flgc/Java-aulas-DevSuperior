package entities;

import java.util.Date;

public class Installment {
	
	private Date dueDate;		
	private Double amount;
	
	//Association 
	
	public Installment() { 							// Empty constructor
	}

	public Installment(Date dueDate, Double amount) {		// Argument constructor
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {							// Getters and settings constructor
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	

}
