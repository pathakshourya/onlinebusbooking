package com.cg.Repositries;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.model.BusOperator;

@Repository
public interface IBusOperatorRespostry extends JpaRepository<BusOperator, Integer> {
	
	@Query("from BusOperator where busOperatorUsername=?1 AND password=?2")
	public BusOperator signIn2(String busOperatorUsername,String password);
	/*@Query("from BusOperator where busOperatorUsername=?1 AND password=?2")
	public BusOperator signIn(String busOperatorUsername,String password);
	*/
	//
	@Query("select (b.totalSeats*b.fare )from Bus b,BusRoute br where b.busRoute=br and br.routeName=(:routeName)" )
	//and lower(br.routeName)=lower(:routeName)
	public List<Float> findRevenueByBusRouteRouteName(@Param("routeName") String routeName);
	//
	@Query("select (b.totalSeats*b.fare )from Bus b where b.busId=(:busId) " )
	
	public List<Float> findRevenueByBusId(@Param("busId") int busId);
	
	
	
}
