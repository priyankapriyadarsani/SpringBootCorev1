package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt;
	public String generateMessage(String user) {
		int hour=ldt.getHour();
		if(hour<12)
			return "Good morning"+user;
	
	else if(hour<16)
		return "Good morning"+user;
		
	else if(hour<20)
		return "Good evening"+user;
	else
		return "Good night"+user;
	}
}
