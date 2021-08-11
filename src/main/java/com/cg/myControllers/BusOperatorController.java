package com.cg.myControllers;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Bus;
import com.cg.model.BusOperator;
import com.cg.model.BusRoute;
import com.cg.model.LoginBusOperator;
import com.cg.service.IBusOperatorService;

@RestController

public class BusOperatorController {

	@Autowired
	private IBusOperatorService bs;
	
	@PostMapping(value="/registerbusoperator")
	public String registerBusOPerator(@RequestBody BusOperator bo) {
		bs.registerBusOperator(bo);
			return "Bus Operator Registered"+bo.getBusOperatorUsername();
		
	}
	
	@GetMapping(value="/getBusOperatorById/{id}")
	public BusOperator getBusOperatorById(@PathVariable int id) {
		
		
		return bs.getBusOPeratorByid(id);
		 
	}
	
	/*@GetMapping(value="/signIn/{username}/{password}")
	public BusOperator SignInBusOperator(@PathVariable String username,@PathVariable String password) {
		return bs.signIn(username, password);
		
	}*/
		
	@GetMapping(value="/Login2")	
	@ResponseBody
	public ResponseEntity<Object> SignInBusOperator2(@RequestBody LoginBusOperator login) {
		
		
		BusOperator bo= bs.signIn2(login.getBusOperatorUsername(),login.getPassword());
		
		
		return new ResponseEntity<Object>("Login successfully",HttpStatus.CREATED);
		
	} 
	
	
		
	
	@GetMapping(value="/DailyRouteNameRevnue/{routeName}")
	public List<Float> findRevenueByBusRouteRouteName(@PathVariable String routeName) {
		
		
		
		return bs.findRevenueByBusRouteRouteName(routeName);
	}
	
	
	@GetMapping(value="/DailyBusRevnue/{busId}")
	public List<Float> findRevenueByBusName(@PathVariable int busId) {
		return bs.findRevenueByBusId(busId);
	}
	
	@PostMapping(value="/addNewBusRoute")
	public ResponseEntity<BusRoute> addNewBusRoute(@RequestBody BusRoute busroute){
	BusRoute br=	bs.addBusRoute(busroute);
		return new ResponseEntity<BusRoute>(br, HttpStatus.CREATED);
	}
	
	@PostMapping(value="/addNewBus")
	public ResponseEntity<Bus> addNewBus(@Valid @RequestBody Bus bus){
		
		bs.addBus(bus);
		return new ResponseEntity<Bus>(bus, HttpStatus.CREATED);
	}
	@PutMapping(value="/updateSeatCost/{busid}/{newfare}")
	public ResponseEntity<Bus> updateseatcost(@PathVariable int busid,@PathVariable int newfare){
		Bus b=bs.updateseatcost(busid, newfare);
		
		return new ResponseEntity<Bus>(b,HttpStatus.CREATED);
		
		
	}
	/*@PutMapping(value="/udateBus")
	public ResponseEntity<Bus> UpdateBus(@RequestBody BusOperator busoperator){
		
	}*/
	
}
