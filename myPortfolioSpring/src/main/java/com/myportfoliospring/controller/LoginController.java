package com.myportfoliospring.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myportfoliospring.constant.ViewConstant;
import com.myportfoliospring.service.UserService;

/**
 * @author Omar
 *
 */

//@RestController
@Controller
@RequestMapping("/myportfoliospring")
public class LoginController {

	public static final Log LOG = LogFactory.getLog(LoginController.class);

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	@GetMapping("")
	public String login() {
		LOG.info("METHOD:'login'");
		// model.addAttribute("userModel", new LoginModel());
		return ViewConstant.LOGIN;
	}

	@GetMapping("/logout")
	public String logout() {
		LOG.info("METHOD:'logout'");

		return ViewConstant.LOGIN;

	}

	@GetMapping("/principal")
	public String validateUser(Model model) {
		LOG.info("METHOD:'principal'");
		//User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		//model.addAttribute("userName", user.getUsername());
		return ViewConstant.MAIN;

	}
	
	@GetMapping("/validateUser")
	public ResponseEntity<Boolean> validateUser() {
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);

	}

}
