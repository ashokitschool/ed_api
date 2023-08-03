package in.ashokit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class EducationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eduId;

	private String highestDegree;

	private Integer graduationYear;

	private String uniName;

	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity user;

	@OneToOne
	@JoinColumn(name="case_num")
	private AppEntity app;

	
	public Integer getEduId() {
		return eduId;
	}

	public void setEduId(Integer eduId) {
		this.eduId = eduId;
	}

	public String getHighestDegree() {
		return highestDegree;
	}

	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}

	public Integer getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(Integer graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
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
