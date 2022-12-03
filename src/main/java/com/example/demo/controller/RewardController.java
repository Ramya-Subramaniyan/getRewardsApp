/**
 * 
 */
package com.example.demo.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.CustomerVO;
import com.example.demo.bean.TransactionVO;
import com.example.demo.servicedata.RewardServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Ramya
 *
 */
@RestController
public class RewardController {
	
	@Autowired
	private RewardServiceImpl rs;

	@GetMapping(value = "/getpointrewards")
	public List<CustomerVO> getRewardsList() {
		
		List<CustomerVO> list = rs.getRewards();
		
		return list;
	}
	
	@GetMapping(value = "/getjsonrewards/{id}")
	 public String getRewards(@PathVariable(value = "id")String id)throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		String name=null;
		int totalPoints = 0;
		TypeReference<List<CustomerVO>> type=new TypeReference<List<CustomerVO>>() {};
		InputStream obj=TypeReference.class.getResourceAsStream("/json/reward.json");
		//convert JSON file to map
		List<CustomerVO> list = objectMapper.readValue(obj,type);
		for(CustomerVO s: list) {
			if(s.getCustomerID().equalsIgnoreCase(id)) {
				name=s.getCustomerName();
				 totalPoints=calculateRewardPoints(s.getTransVO());
			}
		}
		
		
		return name + " has total reward of " + String.valueOf(totalPoints);
	}
	
	@GetMapping(value = "/getpointrewards/{id}")
	public String getReward(@PathVariable(value = "id")String id) {
		
		String name=null;
		int totalPoints = 0;
		List<CustomerVO> list = rs.getRewards();
		for(CustomerVO s: list) {
			if(s.getCustomerID().equalsIgnoreCase(id)) {
				name=s.getCustomerName();
				 totalPoints=calculateRewardPoints(s.getTransVO());
			}
		}
		
		
		return name + " has total reward of " + String.valueOf(totalPoints);
	}
	private int calculateRewardPoints(List<TransactionVO> transVO) {
		LocalDate now = LocalDate.now();
		int totrewards= 0;
		LocalDate lastThreeMonth = now.minusMonths(3); // last three month
		
		for(TransactionVO transvo:transVO) {
			int compareValue = transvo.getTransactionDate().compareTo(lastThreeMonth);
			//System.out.println(transvo.getTransactionDate()+"-->>"+lastThreeMonth+"-->>>"+compareValue);
			if(compareValue > 0) {
				totrewards+=calculateActualRewardPoint(transvo.getAmount());
				//System.out.println("totrewards---> " +totrewards);
			}
		
	}
		return totrewards;
		
	}
	private int calculateActualRewardPoint(int amount) {
		// TODO Auto-generated method stub
		int points = 0;
		if (amount > 100) { // A customer receives 2 points for every dollar spent over $100 in each transaction
			int diffamount= amount - 100;
			points=diffamount*2 + 1*50; // plus 1 point for every dollar spent between $50 and $100 in each transaction.
		}
		else {
			if (amount > 50) {
				int diffamount= amount - 50;
				points=diffamount*1;
			}
		}
		return points;
	}

}
