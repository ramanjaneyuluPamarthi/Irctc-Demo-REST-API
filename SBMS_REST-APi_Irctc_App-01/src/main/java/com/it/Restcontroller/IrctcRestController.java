package com.it.Restcontroller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.request.PassengerRequest;
import com.nit.response.TicketResponse;

@RestController
@RequestMapping("/irctc")
public class IrctcRestController {

	@GetMapping("/ggggggggg")
	public ResponseEntity<String> getMsg() {
		return new ResponseEntity<String>("home",HttpStatus.OK);
	}
	
	
	@PostMapping("/bookticket")
	public ResponseEntity<TicketResponse> getStatusDetails(@RequestBody PassengerRequest request){
		
		//logic to write to book the ticket
		TicketResponse response = new TicketResponse();
		response.setPrice(1200.00);
		response.setStatus("Confired");
		BeanUtils.copyProperties(request, response);
		System.out.println(response);
		return new ResponseEntity<TicketResponse>(response,HttpStatus.CREATED);
	}
	
	@PostMapping(value="/bookingticket",
			consumes = {"application/json"}
			)
	public TicketResponse getDetails(@RequestBody PassengerRequest request){
		
		//logic to write to book the ticket
		TicketResponse response = new TicketResponse();
		response.setPrice(1200.00);
		response.setStatus("Confired");
		BeanUtils.copyProperties(request, response);
		System.out.println(response);
		return response;
	}
}
