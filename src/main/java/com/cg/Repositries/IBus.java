package com.cg.Repositries;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.model.Bus;


public interface IBus extends JpaRepository<Bus, Integer> {

	//@Query("from Bus where busId?=1 ")
	//public Bus updateSeatCost(int busId);
	public Bus findBybusId(int busId);
}
