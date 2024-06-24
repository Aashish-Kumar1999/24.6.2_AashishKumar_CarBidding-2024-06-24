package com.example.auctions.auctions.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.auctions.auctions.entity.AuctionsEntity;
import com.example.auctions.auctions.service.AuctionsService;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@RestController
public class AuctionsController {

	private final AuctionsService auctionservice;

	@Autowired
	public AuctionsController (AuctionsService auctionservice){
		this.auctionservice =auctionservice;
	}

	@GetMapping("/getallauctions")
	public List<AuctionsEntity> getallauctions() {
		return auctionservice.getallauctions();
	}

	@PostMapping("/auctionupdate")
	public AuctionsEntity addauctions( @Valid @RequestBody AuctionsEntity auctions) {
		AuctionsEntity p = auctionservice.save(auctions);
		return p;
	}

	@DeleteMapping("/Users/{}")
	public void delete(@PathVariable("AuctionId") Long AuctionsId) {
		auctionservice.deleteauctions(AuctionsId);
	}

	@PutMapping("/users/{UserId}")
	public void updateauctions(@PathVariable("auctionsid") long AuctionsId, @RequestBody AuctionsEntity auctions) {
		auctionservice.updateauctions(AuctionsId, auctions);
	}

}
