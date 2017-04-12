package com.tpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.services.MyService;

public class MainApp {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	
	MyService myService = context.getBean("PrintService",MyService.class);
	//MyServiceImpl myService = context.getBean("PrintService",MyServiceImpl.class);
	//MyServiceImpl myService = (MyServiceImpl)context.getBean("PrintService");
		
	myService.printMe();		
	}
	
}
/*
In the above example, getBean("string", <class>) method retruns the object of type mentioned in <class>
Another method getBean("string") method returns the the object but it won't type cast to any particular calss,
which we have to manually do (in line 15 we did that, type casting return object of method to 'MyServiceImpl' type).
So you can use any of the above two methods, both are same.
*/
