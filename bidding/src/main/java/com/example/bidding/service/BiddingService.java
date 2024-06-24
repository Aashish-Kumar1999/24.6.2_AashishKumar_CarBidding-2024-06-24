package com.example.bidding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.bidding.entity.BiddingEntity;
import com.example.bidding.reprository.BiddingReprository;


@Service
public class BiddingService {
	
	
	@Autowired
	private BiddingReprository biddingreprository;

	@Autowired
	public RestTemplate restTemplate;

	public BiddingEntity save(BiddingEntity users) {
		return biddingreprository.save(users);
	}

	public void updatebidding(Long Bid_id,BiddingEntity user) {
		biddingreprository.save(user);

	}

	public void deletebidding(Long Bid_id) {
		biddingreprository.deleteById(Bid_id);

	}

	public List<BiddingEntity> getallBidding() {
		List<BiddingEntity> list = (List<BiddingEntity>) this.biddingreprository.findAll();
		return list;
	}

	
}
