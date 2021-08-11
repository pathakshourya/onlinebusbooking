package com.cg.service;

import com.cg.model.BusOperator;
import com.cg.model.BusRoute;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.model.Bus;

public interface IBusOperatorService {

	//public BusOperator signIn(String busOperatorUsername,String password);
	
	public BusOperator registerBusOperator(BusOperator busoperator);
	
	public BusOperator getBusOPeratorByid(int id);
	
	public List<Float> findRevenueByBusRouteRouteName(String routeName);
	
	public BusOperator signIn2(String busOperatorUsername, String password);
	
	public List<Float> findRevenueByBusId(int busId);
	
	public BusRoute addBusRoute(BusRoute busroute);

	public void addBus(Bus bus);
	
	public BusOperator updatepassword(String busOperatorUsername, String password);
	
	public Bus updateseatcost(int id,int fare);
	
	
	//public BusOperator UpdateBus( BusOperator busoperator);
	
	
	
}
