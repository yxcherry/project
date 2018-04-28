package com.mt.service.di;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
	public String sayHello(String world) {
		return "hello " + world;
	}

}
