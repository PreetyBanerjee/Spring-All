package tech.stl.plan;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import tech.stl.plan.entity.Bill;
import tech.stl.plan.entity.Plan;
import tech.stl.plan.entity.PlanDetails;
import tech.stl.plan.repository.BillRepository;
import tech.stl.plan.repository.PlanDetailsRepository;
import tech.stl.plan.repository.PlanRepository;
import tech.stl.plan.service.PlanService;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes= {ServiceMokitoTest.class})
public class ServiceMokitoTest {
	@Mock
    PlanDetailsRepository planDetailsRepository;
	
	@Mock
    BillRepository billRepository;
	
	@Mock
    PlanRepository planRepository;
    
    @InjectMocks
    PlanService planService;
    
    @Test
    @Order(1)
    public void   test_getAllPlan(){
        
        List<Plan> plan=new ArrayList<Plan>(); 
        plan.add(new Plan(1,"Value",450,"30","calling"));
        when(planRepository.findAll()).thenReturn(plan); //mocking
        assertEquals(1,planService.getPlans().size());
        }
    
    @Test
    @Order(2)
    public void  test_planById() {
    	Plan plan=new Plan(1,"Value",450,"30","calling");
    	when(planRepository.findById(1)).thenReturn(plan);
    	assertEquals(plan, planService.getById(1));
    	
    }
    @Test
    @Order(3)
    public void  test_planDetailsById() {
    	PlanDetails planDetails=new PlanDetails(1,"Value",450,"30","calling");
    	when(planDetailsRepository.findById(1)).thenReturn(planDetails);
    	assertEquals(planDetails, planService.getPlanById(1));
    	
    }
    @Test
    @Order(4)
    public void test_addPlan() {
    	Plan plan=new Plan(1,"Value",450,"30","calling");
    	 when(planRepository.save(plan)).thenReturn(plan);
         assertEquals(plan, planService.addPlan(plan));
    }
    @Test
    @Order(5)
    public void test_addPlanDetails() {
    	PlanDetails planDetails=new PlanDetails(1,"Value",450,"30","calling");
    	 when(planDetailsRepository.save(planDetails)).thenReturn(planDetails);
         assertEquals(planDetails, planService.addPlanDetails(planDetails));
    }
    
//    @Test
//    @Order(6)
//    public void test_addBill() {
//    	Bill bill=new Bill(1,"Value","Barsha",22-09-09,450,600,"30 days","calling");
//    	 when(billRepository.save(bill)).thenReturn(bill);
//         assertEquals(bill, planService.recharge(bill));
//    }

    @Test
    @Order(6)
    public void test_updatePlan() {
    	Plan plan=new Plan(1,"Value",450,"30","calling");
    	plan.setPlanName("Super");;
    	planRepository.save(plan);
    	assertEquals("Super",plan.getPlanName());
    	
    }
    @Test
    @Order(7)
    public void test_updatePlanDetails() {
    	PlanDetails planDetails=new PlanDetails(1,"Value",450,"30","calling");
    	planDetails.setPlanName("Super");;
    	planDetailsRepository.save(planDetails);
    	assertEquals("Super",planDetails.getPlanName());
    	
    }

}
