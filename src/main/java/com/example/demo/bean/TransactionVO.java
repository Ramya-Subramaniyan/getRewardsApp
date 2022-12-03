/**
 * 
 */
package com.example.demo.bean;

import java.time.LocalDate;

/**
 * @author Ramya
 *
 */
public class TransactionVO {
	private int transactionID;
	private LocalDate transactionDate;
	private int amount;
	
	public TransactionVO(int transactionID, LocalDate transactionDate, int amount) {
		
		super();
		this.transactionID=transactionID;
		this.transactionDate=transactionDate;
		this.amount=amount;
	}
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
