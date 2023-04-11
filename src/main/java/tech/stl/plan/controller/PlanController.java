package tech.stl.plan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tech.stl.plan.service.PlanService;
import tech.stl.plan.entity.Bill;
import tech.stl.plan.entity.Plan;
import tech.stl.plan.entity.PlanDetails;

@CrossOrigin
@RestController
public class PlanController {
	
	@Autowired
    private PlanService planService;
	
	@GetMapping("/viewPlan")
	public ResponseEntity<List<Plan>> getPlan() {
		List<Plan> list = planService.getPlans();
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	@GetMapping("/viewPlan/{id}")
	public ResponseEntity<Plan> getPlan( @PathVariable("id") int planId) {
		Plan plan = planService.getById(planId);
		return ResponseEntity.of(Optional.of(plan));
	}
	
	@GetMapping("/planDetails/{id}")
	public ResponseEntity<PlanDetails> getPlanDetail( @PathVariable("id") int planId) {
		PlanDetails planDetails = planService.getPlanById(planId);
		return ResponseEntity.of(Optional.of(planDetails));
	}
	
	@PostMapping("/viewPlan")
	public ResponseEntity<Plan> addPlan( @RequestBody Plan plan) {
		Plan b = null;
		try {
			b = this.planService.addPlan(plan);
			System.out.println(plan);
			return ResponseEntity.of(Optional.of(b));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	
	@PostMapping("/planDetails")
	public ResponseEntity<PlanDetails> addPlanDetails( @RequestBody PlanDetails planDetails) {
		PlanDetails b = null;
		try {
			b = this.planService.addPlanDetails(planDetails);
			System.out.println(planDetails);
			return ResponseEntity.of(Optional.of(b));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	
	 @PutMapping("/viewPlan/{planId}")
	    public ResponseEntity<Plan> updatePlan(@RequestBody Plan plan,
	            @PathVariable("planId") int planId) {
	        try {
	            this.planService.updatePlan(plan, planId);
	            return ResponseEntity.ok().body(plan);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	        }

	    }
	 
	 
	 @PutMapping("/planDetails/{planId}")
	    public ResponseEntity<PlanDetails> updatePlanDetails(@RequestBody PlanDetails planDetails,
	            @PathVariable("planId") int planId) {
	        try {
	            this.planService.updatePlanDetails(planDetails, planId);
	            return ResponseEntity.ok().body(planDetails);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	        }

	    }
	 
	 @PostMapping("/bill")
		public ResponseEntity<Bill> recharge( @RequestBody Bill bill) {
			Bill b = null;
			try {
				b = this.planService.recharge(bill);
				System.out.println(bill);
				return ResponseEntity.of(Optional.of(b));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

}
