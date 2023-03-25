package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.entity.Ticket;

@RestController
public class ErailController {
	
	private Map<Integer,Ticket>map=new HashMap<>();
	
	@PostMapping(value = "/ticket",
			produces = {"application/xml","application/json"},
			consumes = {"application/xml","application/json"})
	public ResponseEntity<Ticket> saveAndReturnTicketDetails(@RequestBody Person person){
		
		Ticket ticket=new Ticket();
		
		Random random=new Random();
		
		int ticketId = random.nextInt();
		
		ticket.setTicketNo(ticketId);
		ticket.setName(person.getName());
		ticket.setFrom(person.getFrom());
		ticket.setTo(person.getTo());
		ticket.setStatus("confirm");
		ticket.setAmount(1000.00);
		
		map.put(ticketId, ticket);
		
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "/ticket/{ticketNo}",
			produces = {"application/xml","application/json"})
	public ResponseEntity<Ticket>  getTicketDetails(@PathVariable Integer ticketNo){
		
		if(map.containsKey(ticketNo)) {
			 Ticket ticket = map.get(ticketNo);
			 return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
		}
		
		return null;
		
	}

}
