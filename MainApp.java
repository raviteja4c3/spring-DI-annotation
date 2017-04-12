package com.tpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.services.MyService;

public class MainApp {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			
	//MyService myService = new MyService();	
	MyService myService = context.getBean("PrintService",MyService.class);
	//MyServiceImpl myService = context.getBean("PrintService",MyServiceImpl.class);
	//MyServiceImpl myService = (MyServiceImpl)context.getBean("PrintService");
		
	myService.printMe();		
	}
	
}
/*
If you observe Line 13, it is commented, where object is crated manually. Dependecy Injection is to let Spring create the object. 
So the next three lines will do that.
In the above example, getBean("string", <class>) method retruns the object of type mentioned in <class>
Another method getBean("string") method returns the the object but it won't type cast to any particular calss,
which we have to manually do (in line 15 we did that, type casting return object of method to 'MyServiceImpl' type).
So you can use any of the above two methods, both are same.
*/
