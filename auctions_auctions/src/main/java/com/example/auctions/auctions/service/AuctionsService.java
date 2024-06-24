package com.example.auctions.auctions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.auctions.auctions.entity.AuctionsEntity;
import com.example.auctions.auctions.reprository.AuctionsReprositorys;

@Service
public class AuctionsService {

	private final AuctionsReprositorys auctionsReprositorys;

	@Autowired
	public AuctionsService(AuctionsReprositorys auctionsReprositorys) {
		this.auctionsReprositorys = auctionsReprositorys;
	}

	public void updateauctions(Long Auctions, AuctionsEntity auctions) {
		auctionsReprositorys.save(auctions);

	}

	public void deleteauctions(Long AuctionsId) {
		auctionsReprositorys.deleteById(AuctionsId);

	}

	public List<AuctionsEntity> getallauctions() {
		List<AuctionsEntity> list = (List<AuctionsEntity>) this.auctionsReprositorys.findAll();
		return list;
	}

	public AuctionsEntity save(AuctionsEntity auctions) {
		AuctionsEntity p = auctionsReprositorys.save(auctions);
		return p;
	}

}
