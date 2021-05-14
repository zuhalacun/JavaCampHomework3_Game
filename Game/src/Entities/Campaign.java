package Entities;

import java.time.LocalDate;

public class Campaign {
	  int campaignNumber;
      String campaignName;
      double discountRate;
      LocalDate startDate;
      LocalDate endDate;
	
      public Campaign(int campaignNumber, String campaignName, double discountRate, LocalDate startDate,
			LocalDate endDate) {
		super();
		this.campaignNumber = campaignNumber;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getCampaignNumber() {
		return campaignNumber;
	}

	public void setCampaignNumber(int campaignNumber) {
		this.campaignNumber = campaignNumber;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
}
