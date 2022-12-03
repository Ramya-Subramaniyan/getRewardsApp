/**
 * 
 */
package com.example.demo.servicedata;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bean.CustomerVO;
import com.example.demo.bean.TransactionVO;


/**
 * @author Ramya
 *
 */
@Service
public class RewardService implements RewardServiceImpl {

	@Override
	public List<CustomerVO> getRewards() {
		
		ArrayList<CustomerVO> vo=new ArrayList<CustomerVO>();
		
		vo.add(new CustomerVO("1","Ramya",getTransactionList()));
		vo.add(new CustomerVO("2", "Subramaniyan",getTransactionList2()));
		vo.add(new CustomerVO("3", "Ram",getTransactionList3()));
		
		return vo;
	}

	private List<TransactionVO> getTransactionList3() {
		// TODO Auto-generated method stub
		
		ArrayList<TransactionVO> vo = new ArrayList<TransactionVO>();
		vo.add(new TransactionVO(1, LocalDate.of(2022, Month.SEPTEMBER, 11), 70));
		vo.add(new TransactionVO(2, LocalDate.of(2022, Month.SEPTEMBER, 25), 70));
		vo.add(new TransactionVO(3, LocalDate.of(2022, Month.OCTOBER, 12), 200));
		vo.add(new TransactionVO(4, LocalDate.of(2022, Month.OCTOBER, 24), 70));
		vo.add(new TransactionVO(5, LocalDate.of(2022, Month.NOVEMBER, 30), 70));
		

		return vo;
	}

	private List<TransactionVO> getTransactionList2() {
		// TODO Auto-generated method stub
		ArrayList<TransactionVO> vo = new ArrayList<TransactionVO>();
		vo.add(new TransactionVO(1, LocalDate.of(2022, Month.AUGUST, 11), 220));
		vo.add(new TransactionVO(2, LocalDate.of(2022, Month.AUGUST, 25), 70));
		vo.add(new TransactionVO(3, LocalDate.of(2022, Month.SEPTEMBER, 12), 200));
		vo.add(new TransactionVO(4, LocalDate.of(2022, Month.OCTOBER, 24), 11));
		vo.add(new TransactionVO(5, LocalDate.of(2022, Month.NOVEMBER, 30), 72));
		

		return vo;
	}

	public List<TransactionVO> getTransactionList() {
		// TODO Auto-generated method stub
		ArrayList<TransactionVO> vo = new ArrayList<TransactionVO>();
		vo.add(new TransactionVO(1, LocalDate.of(2022, Month.AUGUST, 11), 20));
		vo.add(new TransactionVO(2, LocalDate.of(2022, Month.SEPTEMBER, 12), 200));
		vo.add(new TransactionVO(3, LocalDate.of(2022, Month.OCTOBER, 24), 200));
		vo.add(new TransactionVO(4, LocalDate.of(2022, Month.NOVEMBER, 30), 700));
		vo.add(new TransactionVO(5, LocalDate.of(2022, Month.DECEMBER, 02), 70));
		
		return vo;
	}


	

}
