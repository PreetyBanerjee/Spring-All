package tech.stl.plan.entity;

import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bill {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 int planId;
	 String	 planName ;
     String	 cardHolderName ;
     Date  expiryDate  ;
	 int   cvv ;
	 int price;
	 String planDuration;
	 String benefits;
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
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
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
	public String getBenefits() {
		return benefits;
	}
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	public Bill(int planId, String planName, String cardHolderName, Date expiryDate, int cvv, int price,
			String planDuration, String benefits) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.cardHolderName = cardHolderName;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.price = price;
		this.planDuration = planDuration;
		this.benefits = benefits;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bill [planId=" + planId + ", planName=" + planName + ", cardHolderName=" + cardHolderName
				+ ", expiryDate=" + expiryDate + ", cvv=" + cvv + ", price=" + price + ", planDuration=" + planDuration
				+ ", benefits=" + benefits + "]";
	}
	
	 

}
