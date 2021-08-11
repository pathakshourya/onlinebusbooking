package com.cg.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Repositries.IBus;
import com.cg.Repositries.IBusOperatorRespostry;
import com.cg.Repositries.IBusRoute;
import com.cg.exception.BusNotFoundException;
import com.cg.exception.BusOperatorNotFoundException;
import com.cg.exception.BusRouteNotFoundException;
import com.cg.model.Bus;
import com.cg.model.BusOperator;
import com.cg.model.BusRoute;


@Service
public class BusOperatorImpl implements IBusOperatorService {
	
	@Autowired
	private IBusOperatorRespostry ib; 
	
	@Autowired
	private IBusRoute ibr;
	
	@Autowired
	private IBus ibus;

	/*@Override
	public BusOperator signIn(String busOperatorUsername, String password) {
		BusOperator bo=ib.signIn(busOperatorUsername, password);
		
		if(bo==null)
			throw new BusOperatorNotFoundException("Bus Operator is not registered");
		    
		else	
			return bo;
	}*/
	@Override
	public BusOperator signIn2(String busOperatorUsername, String password) {
		BusOperator bo=ib.signIn2(busOperatorUsername, password);
		
		if(bo==null)
			throw new BusOperatorNotFoundException("Bus Operator is not registered");
		    
		else	
			return bo;
	}
	
	

	@Override
	public BusOperator registerBusOperator(BusOperator busoperator) {
		//if(busoperator.)Want to throw a exception if busoperator username is not unique
		
		// TODO Auto-generated method stub
		return ib.save(busoperator);
	}

	@Override
	public BusOperator getBusOPeratorByid(int id) {
		Optional<BusOperator> op=ib.findById(id);
		
		if(op.isPresent())
			return op.get();
		else
			throw new BusOperatorNotFoundException("Enterend Id Is Not Found");
	
	}

	@Override
	public List<Float> findRevenueByBusRouteRouteName(String routeName) {
		List<Float> list= ib.findRevenueByBusRouteRouteName(routeName);
		if(list.isEmpty())
			 throw new BusRouteNotFoundException("Entered Route name not found");
		else
			return list;
	}

	@Override
	public List<Float> findRevenueByBusId(int busId) {
		List<Float> list= ib.findRevenueByBusId(busId);
		if(list.isEmpty())
			 throw new BusNotFoundException("Entered BusID  not found");
		else
			return list;
		
		
	}

	@Override
	public BusRoute addBusRoute(BusRoute busroute) throws BusRouteNotFoundException{
		if(busroute.equals(null))
			throw new BusNotFoundException("Enter all the Details");
		
		  return ibr.save(busroute);
	}

	@Override
	public void addBus(Bus bus) {
		// TODO Auto-generated method stub
		
		if(bus.equals(null))
			throw new BusRouteNotFoundException("Enter all Details");
	ibus.save(bus);
		
	}



	@Override
	public BusOperator updatepassword(String busOperatorUsername, String password) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Bus updateseatcost(int id,int fare) {
		Bus b=ibus.findBybusId(id);
		if(b==null)
			throw new BusNotFoundException("Entered Id Not Found");
		else
			b.setFare(fare);
			return ibus.save(b);
	}



	



	/*@Override
	public BusOperator UpdateBus(BusOperator busoperator) {
		
		Optional<BusOperator> op=ib.findById(busoperator.getBusopeartorId());
		if(op.isPresent())
			List<Bus> b1=new ArrayList<>();
		b1=busoperator.getBus();
		
		
		
	}*/

	

	
	
	
	
	

}
