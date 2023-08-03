package in.ashokit.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class KidEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer kidId;

	private String kidName;

	private LocalDate kidDob;

	private Long kidSsn;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	@OneToOne
	@JoinColumn(name = "case_num")
	private AppEntity app;

	public Integer getKidId() {
		return kidId;
	}

	public void setKidId(Integer kidId) {
		this.kidId = kidId;
	}

	public String getKidName() {
		return kidName;
	}

	public void setKidName(String kidName) {
		this.kidName = kidName;
	}

	public LocalDate getKidDob() {
		return kidDob;
	}

	public void setKidDob(LocalDate kidDob) {
		this.kidDob = kidDob;
	}

	public Long getKidSsn() {
		return kidSsn;
	}

	public void setKidSsn(Long kidSsn) {
		this.kidSsn = kidSsn;
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
