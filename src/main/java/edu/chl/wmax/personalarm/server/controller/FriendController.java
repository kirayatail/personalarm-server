package edu.chl.wmax.personalarm.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Supplies HTTP methods for Friends. Requirements specify that a user should be
 * able to list all friends, remove friends, send and accept friend requests.
 * 
 * A standard routing table and additional information can be found at
 * siteroot/friends/info
 * 
 * @author Max Witt
 * 
 */
@Controller
@RequestMapping("friends")
public class FriendController {

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String index() {
		return "friend/index";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listFriends(){
		// Get all friends, return a list of them
		return null;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String removeFriend(@PathVariable long id) {
		// Remove friend linking
		return null;
	}
	
	@RequestMapping(value = "/req", method = RequestMethod.POST)
	public String createRequest() {
		return "friend/index";
	}
	
	@RequestMapping(value = "/req", method = RequestMethod.GET)
	public String listRequests(){
		// Get all friends, return a list of them
		return null;
	}
	
	@RequestMapping(value = "/req/{id}", method = RequestMethod.POST)
	public String acceptRequest(@PathVariable long id){
		return null;
	}
	
	@RequestMapping(value = "/req/{id}", method = RequestMethod.DELETE)
	public String removeRequest(@PathVariable long id) {
		// Remove friend linking
		return null;
	}
}