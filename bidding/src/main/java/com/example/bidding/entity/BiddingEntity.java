package com.example.bidding.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BiddingEntity {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Bid_id;
     
	@NotBlank
	private String auction_id;
  
	@NotBlank
	private String bidder_id;

	@NotBlank
	private String bid_ammout;

	@NotBlank
	private String bid_time;
	
	
}
