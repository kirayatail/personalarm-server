package edu.chl.wmax.personalarm.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Supplies HTTP methods for user-related CRUD. Note that friends are handled in a separate controller
 * 
 * A standard routing table and additional information can be found at siteroot/users/info
 * 
 * @author Max Witt
 *
 */
@Controller
@RequestMapping("users")
public class UserController {
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String index(){
		return "user/index";
	}
}
