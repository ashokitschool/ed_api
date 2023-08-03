package in.ashokit.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "IES_APPS")
public class AppEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long caseNum;

	private String fullname;

	private String email;

	private String gender;

	private LocalDate dob;

	private Long phno;

	private Long ssn;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	@OneToOne
	private PlanSelEntity planSel;

	@OneToOne
	private IncomeEntity income;

	@OneToOne
	private EducationEntity education;

	@OneToMany
	private List<KidEntity> kid;

	public Long getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public PlanSelEntity getPlanSel() {
		return planSel;
	}

	public void setPlanSel(PlanSelEntity planSel) {
		this.planSel = planSel;
	}

	public IncomeEntity getIncome() {
		return income;
	}

	public void setIncome(IncomeEntity income) {
		this.income = income;
	}

	public EducationEntity getEducation() {
		return education;
	}

	public void setEducation(EducationEntity education) {
		this.education = education;
	}

	public List<KidEntity> getKid() {
		return kid;
	}

	public void setKid(List<KidEntity> kid) {
		this.kid = kid;
	}

}
