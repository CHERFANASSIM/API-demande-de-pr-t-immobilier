package fr.formation.ponionz.domain.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import fr.formation.ponionz.validation.Contribution;
import fr.formation.ponionz.validation.InsuranceRate;

@Contribution
public class RequestCreate {

	@Min(1)
	@Max(600000)
	@NotNull
	private int amount;
	@Positive
	private double contribution;

	@Min(2)
	@Max(30)
	@NotNull
	private double duration;
	@Positive
	private double interestRate;
	@Positive
	private double insuranceRate;

	private boolean jobLossInsurance;
	@InsuranceRate
	private Integer jobLossCover;

	public RequestCreate() {

	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getContribution() {
		return contribution;
	}

	public void setContribution(double contribution) {
		this.contribution = contribution;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInsuranceRate() {
		return insuranceRate;
	}

	public void setInsuranceRate(double insuranceRate) {
		this.insuranceRate = insuranceRate;
	}

	public boolean isJobLossInsurance() {
		return jobLossInsurance;
	}

	public void setJobLossInsurance(boolean jobLossInsurance) {
		this.jobLossInsurance = jobLossInsurance;
	}

	public Integer getJobLossCover() {
		return jobLossCover;
	}

	public void setJobLossCover(Integer jobLossCover) {
		this.jobLossCover = jobLossCover;
	}

	@Override
	public String toString() {
		return "RequestCreate [amount=" + amount + ", contribution=" + contribution + ", duration=" + duration
				+ ", interestRate=" + interestRate + ", insuranceRate=" + insuranceRate + ", jobLossInsurance="
				+ jobLossInsurance + ", jobLossCover=" + jobLossCover + "]";
	}

}
