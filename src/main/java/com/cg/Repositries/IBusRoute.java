package com.cg.Repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.BusRoute;

public interface IBusRoute extends JpaRepository<BusRoute, Integer> {

}
