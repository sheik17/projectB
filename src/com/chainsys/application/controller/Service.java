package com.chainsys.application.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Service {
	@RequestMapping("/welcome")
			public String welcomePage()
			{
				return "<h1>Welcome</h1>";
			}
	@RequestMapping("/home")
			public String homePage()
			{
				String html="<div>Hi how are you</div>";
				return html;
			}
	@RequestMapping("/getData")
	public String getData(@RequestParam(value="city",defaultValue="madurai")String city)
	{
		return "<h1>Welcome to "+city+"</h1>";
	}
}
