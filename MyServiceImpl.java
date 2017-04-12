package com.services;

import org.springframework.stereotype.Service;

@Service("PrintService")
public class MyServiceImpl implements MyService {
	public void printMe(){
		System.out.println("Hey Your message is Printed!!!!");	
	}
	
	}
