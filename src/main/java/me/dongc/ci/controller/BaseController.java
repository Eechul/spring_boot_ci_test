package me.dongc.ci.controller;

import javax.servlet.http.HttpServletRequest;

public class BaseController {


	public String referer(HttpServletRequest req){
		String server = req.getServerName() + ":" + req.getServerPort();
		if(req.getServerPort() == 80) {
			server = req.getServerName();
		}
		return "redirect:" + req.getHeader("referer").replaceAll("http://", "").replaceAll("https://", "").replaceAll(server, "");
	}

	protected String alert(String message) {
		return "alert:/msg=" + message;
	}
	protected String alertRedirect(String message,String redirect) {
		return "alert:/msg=" + message + "&redirect=" + redirect;
	}

	protected String redirect(String redirect) {
		return "redirect:" + redirect;
	}

}
