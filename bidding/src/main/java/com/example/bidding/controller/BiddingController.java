package com.example.bidding.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.bidding.entity.BiddingEntity;
import com.example.bidding.service.BiddingService;


@RestController
@CrossOrigin("*")
public class BiddingController {

	private static final Logger log = LoggerFactory.getLogger(BiddingController.class);
	@Autowired
	private BiddingService biddingservice;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();

	}

	@GetMapping("/getallauctions")
	public List<BiddingEntity> getallbiddings() {
		log.info("receiving ");
		return biddingservice.getallBidding();
    }

	@PostMapping("/bidding")
	public BiddingEntity addauctions(@Valid @RequestBody BiddingEntity auctions) {
		BiddingEntity p = biddingservice.save(auctions);
		log.info("receiving ");
		return p;
	}

	@DeleteMapping("/bidding/{}")
	public void delete(@PathVariable("biddingid") Long Bid_id) {
		biddingservice.deletebidding(Bid_id);
	}

	@PutMapping("/users/{UserId}")
	public void updatebidding(@PathVariable("biddingid") long Bid_id, @Valid @RequestBody BiddingEntity bidding) {
		log.info("receiving ");
		biddingservice.updatebidding(Bid_id, bidding);
	}
//valid annotation is used to trigger validation on requester object. //
}
