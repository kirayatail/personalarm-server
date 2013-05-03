package edu.chl.wmax.personalarm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/friendreq")
public class FriendRequestController {
	
	@RequestMapping(value = "/sender/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String listReqForSender(@PathVariable("id") int ident){
		
		return "{friendReq: // Listing all requests with sender "+ ident +" }";
	}
	
	@RequestMapping(value = "/receiver/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String listReqForReceiver(@PathVariable("id") int ident){
		
		return "{friendReq: // Listing all requests with receiver "+ ident +" }";
	}

}
