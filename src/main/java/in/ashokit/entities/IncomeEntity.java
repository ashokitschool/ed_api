package in.ashokit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class IncomeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer incomeId;

	private Double rentIncome;

	private Double salaryIncome;

	private Double propertyIncome;

	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity user;

	@OneToOne
	@JoinColumn(name = "case_num")
	private AppEntity app;

	public Integer getIncomeId() {
		return incomeId;
	}

	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
	}

	public Double getRentIncome() {
		return rentIncome;
	}

	public void setRentIncome(Double rentIncome) {
		this.rentIncome = rentIncome;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getPropertyIncome() {
		return propertyIncome;
	}

	public void setPropertyIncome(Double propertyIncome) {
		this.propertyIncome = propertyIncome;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public AppEntity getApp() {
		return app;
	}

	public void setApp(AppEntity app) {
		this.app = app;
	}

}
