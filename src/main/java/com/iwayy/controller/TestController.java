package com.iwayy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iwayy.client.ITestClient;

@RestController
@RequestMapping("/api/v1")
public class TestController {

	@Autowired
	ITestClient testClient;

	@RequestMapping(value = "/test/ping", method = RequestMethod.GET)
	public String pong() {
		return testClient.pong();
	}
}
