package tech.stl.plan.entity;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int planId;
	private String planName;
	private int price;
	private String planDuration;
	private String description;
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
	public void setPlanDuration(String planDuration) {
		this.planDuration = planDuration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Plan(int planId, String planName, int price, String planDuration, String description) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.price = price;
		this.planDuration = planDuration;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", planName=" + planName + ", price=" + price + ", planDuration="
				+ planDuration + ", description=" + description + "]";
	}
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}