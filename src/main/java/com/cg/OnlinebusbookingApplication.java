package com.cg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.validation.annotation.Validated;

import com.cg.model.Bus;
import com.cg.model.BusOperator;
import com.cg.model.BusRoute;
import com.cg.service.BusOperatorImpl;

@SpringBootApplication

public class OnlinebusbookingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=  SpringApplication.run(OnlinebusbookingApplication.class, args);
		
		/*BusOperatorImpl boi=ctx.getBean("busOperatorImpl",BusOperatorImpl.class);
		
		
		BusOperator bo=new BusOperator();
		bo.setBusOperatorUsername("Shour");
		bo.setPassword("1234");
		List<Bus> listbus=new ArrayList<Bus>();
		
		//Bus(int busId, String busNumber, BusRoute busRoute, int totalSeats, int fare)
		//BusRoute(int busrouteId, String routeName, String source, String destination)
		listbus.add(new Bus(9,"MP12", new BusRoute(), 23, 534));
		listbus.add(new Bus(10,"UP23", new BusRoute( ), 24, 234));
		//listbus.add(new Bus(3,"CG15", new BusRoute( "viasagar", "Dalatnganj","Bhopal"), 33, 634));
		bo.setBus(listbus);
		
		BusOperator registerbusoperator=  boi.registerBusOperator(bo);
		
		System.out.println("Bus Operator Is registered"+registerbusoperator);
		*/
	
	}

}
