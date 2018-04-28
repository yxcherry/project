package com.mt.service.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	@Autowired
	FunctionService functionService;
	
	public String sayHello(String world) {
		return functionService.sayHello(world);
	}
}
