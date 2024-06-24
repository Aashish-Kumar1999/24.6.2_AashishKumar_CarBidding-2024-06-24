package com.example.auctions.auctions.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.auctions.auctions.entity.AuctionsEntity;



@Repository
@EnableJpaRepositories
public interface AuctionsReprositorys extends JpaRepository <AuctionsEntity, Long> {
	
	

}
