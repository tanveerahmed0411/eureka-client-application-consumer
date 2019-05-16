package com.iwayy.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="EUREKA-CLIENT-APPLICATION",url="http://localhost:8081")
@FeignClient("EUREKA-CLIENT-APPLICATION")

public interface ITestClient {
	@GetMapping("/api/v1/ping")
	public String pong();
}
