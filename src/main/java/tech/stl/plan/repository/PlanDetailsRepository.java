package tech.stl.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.stl.plan.entity.PlanDetails;

@Repository
public  interface   PlanDetailsRepository  extends JpaRepository<PlanDetails, Integer>  {
	
	 public PlanDetails findById(int planId);

}
