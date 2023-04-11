package tech.stl.plan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.stl.plan.entity.Bill;
import tech.stl.plan.entity.Plan;
import tech.stl.plan.entity.PlanDetails;
import tech.stl.plan.repository.BillRepository;
import tech.stl.plan.repository.PlanDetailsRepository;
import tech.stl.plan.repository.PlanRepository;
@Service
public class PlanService {
	@Autowired
	private PlanRepository planRepository;
	
	@Autowired
	private BillRepository billRepository;
	
	@Autowired
	private PlanDetailsRepository planDetailsRepository;
	
	
	 //ViewPlans
		public List<Plan> getPlans() {
			return this.planRepository.findAll();
		}
		
		//View Plans By Id
			public Plan getById(int planId) {
				return this.planRepository.findById(planId);
			}
		
		//View PlanDetails By Id
		public PlanDetails getPlanById(int planId) {
			return this.planDetailsRepository.findById(planId);
		}
		
		//Add Plan
		public Plan addPlan(Plan plan) {
			return planRepository.save(plan);
		}
		
		//Add Plan Details
		public PlanDetails addPlanDetails(PlanDetails planDetails) {
			return planDetailsRepository.save(planDetails);
		}
		
		//Update Plan by id
		public void updatePlan(Plan plan, int planId) {
			plan.setPlanId(planId);
			planRepository.saveAndFlush(plan);

		}
		
		//Update Plan details by id
		public void updatePlanDetails(PlanDetails planDetails, int planId) {
			planDetails.setPlanId(planId);
			planDetailsRepository.saveAndFlush(planDetails);

		}
		
		//Add Bill
		public Bill recharge(Bill bill) {
			return billRepository.save(bill);
		}

}
