package edu.chl.wmax.personalarm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import edu.chl.wmax.personalarm.model.entity.User;

@Controller
@RequestMapping("/users")
public class UserController {

	public String create() {

		return null;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String list() {

		return "{user: //list all users }";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String show(@PathVariable int ident) {

		return "{user: {id: " + ident + " } }";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public String add(User usr) {

		return null;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String remove() {

		return null;
	}
}
