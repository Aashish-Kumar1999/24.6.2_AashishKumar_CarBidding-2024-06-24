package com.example.auctions.auctions.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*import javax.persistence.Id;*/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AuctionsEntity {

	@NotNull(message = "id cannot be null")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long auctions_id;

	@NotNull(message = "id cannot be null")
	private long car_id;

	@NotNull(message = "id cannot be null")
	private String starttime;

	@NotNull(message = "id cannot be null")
	private String end_time;

	@NotNull(message = "id cannot be null")
	private String  higest_bid;

	@NotNull(message = "id cannot be null")
	private long    higest_bidder_id;

	@NotNull(message = "id cannot be null")
	private String status;
	
	}
