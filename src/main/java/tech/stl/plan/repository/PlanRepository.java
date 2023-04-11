package tech.stl.plan.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.stl.plan.entity.Bill;
import tech.stl.plan.entity.Plan;


@Repository
public interface   PlanRepository  extends JpaRepository<Plan, Integer>  {
	
	public Plan findById(int planId);

	

}
