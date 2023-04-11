package tech.stl.plan.entity;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class PlanDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int planId;
	private String planName;
	private int price;
	private String planDuration;
	private String benefits;
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPlanDuration() {
		return planDuration;
	}
	public void setPlanDuration(  String planDuration) {
		this.planDuration = planDuration;
	}
	public String getBenefits() {
		return benefits;
	}
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	public PlanDetails(int planId, String planName, int price, String planDuration, String benefits) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.price = price;
		this.planDuration = planDuration;
		this.benefits = benefits;
	}
	public PlanDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PlanDetails [planId=" + planId + ", planName=" + planName + ", price=" + price + ", planDuration="
				+ planDuration + ", benefits=" + benefits + "]";
	}
	
	
	
	

}
