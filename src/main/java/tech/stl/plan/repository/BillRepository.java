package tech.stl.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.stl.plan.entity.Bill;



@Repository
public interface   BillRepository  extends JpaRepository<Bill, Integer> {
	

}
