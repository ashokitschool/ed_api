package in.ashokit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class PlanSelEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer planSelId;

	private Integer planId;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	@OneToOne
	@JoinColumn(name = "case_num")
	private AppEntity app;

	public Integer getPlanSelId() {
		return planSelId;
	}

	public void setPlanSelId(Integer planSelId) {
		this.planSelId = planSelId;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
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
