package fr.formation.ponionz.domain.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "requests")

public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int amount;
	private double contribution;
	private double duration;
	private double interestRate;
	private double insuranceRate;
	private boolean jobLossInsurance;
	private Integer jobLossCover;
	private LocalDate date;

	public Request() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", amount=" + amount + ", contribution=" + contribution + ", duration=" + duration
				+ ", interestRate=" + interestRate + ", insuranceRate=" + insuranceRate + ", jobLossInsurance="
				+ jobLossInsurance + ", jobLossCover=" + jobLossCover + ", date=" + date + "]";
	}

}
