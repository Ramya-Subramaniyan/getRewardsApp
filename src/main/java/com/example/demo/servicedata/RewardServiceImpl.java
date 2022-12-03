package com.example.demo.servicedata;

import java.util.List;

import com.example.demo.bean.CustomerVO;
import com.example.demo.bean.TransactionVO;


public interface RewardServiceImpl {
	
	List<CustomerVO> getRewards();
	
	List<TransactionVO> getTransactionList();

}
