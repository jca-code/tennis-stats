package org.jca.tennisstats.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorHandlerController implements ErrorController {

	@RequestMapping("/error")
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public String getErrorPath() {
		return "";
	}
}
