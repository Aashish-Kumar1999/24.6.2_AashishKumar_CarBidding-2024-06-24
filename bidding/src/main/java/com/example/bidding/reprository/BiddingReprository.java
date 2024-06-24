package com.example.bidding.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidding.entity.BiddingEntity;

@Repository
public interface BiddingReprository extends JpaRepository <BiddingEntity, Long> {
	
	

}
