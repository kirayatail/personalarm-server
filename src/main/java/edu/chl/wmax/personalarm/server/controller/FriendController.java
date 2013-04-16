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
}