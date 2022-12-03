/**
 * 
 */
package com.example.demo.bean;

import java.util.List;

/**
 * @author Ramya
 *
 */
public class CustomerVO {
	private String customerID;
	private String customerName;
	private List<TransactionVO> transVO;

	public CustomerVO(String customerID, String customerName,List<TransactionVO> transactionList) {
		
		super();
		this.customerID=customerID;
		this.customerName=customerName;
		this.transVO=transactionList;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<TransactionVO> getTransVO() {
		return transVO;
	}

	public void setTransVO(List<TransactionVO> transVO) {
		this.transVO = transVO;
	}
	

}
