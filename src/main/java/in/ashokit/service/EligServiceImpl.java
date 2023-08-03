package in.ashokit.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.bindings.EdResponse;
import in.ashokit.entities.EducationEntity;
import in.ashokit.entities.EligEntity;
import in.ashokit.entities.IncomeEntity;
import in.ashokit.entities.KidEntity;
import in.ashokit.entities.PlanEntity;
import in.ashokit.entities.PlanSelEntity;
import in.ashokit.repositories.EducationRepo;
import in.ashokit.repositories.EligRepo;
import in.ashokit.repositories.IncomeRepo;
import in.ashokit.repositories.KidRepo;
import in.ashokit.repositories.PlanRepo;
import in.ashokit.repositories.PlanSelRepo;

@Service
public class EligServiceImpl implements EligService {

	@Autowired
	private PlanSelRepo planSelRepo;

	@Autowired
	private PlanRepo planRepo;

	@Autowired
	private IncomeRepo incomeRepo;

	@Autowired
	private EducationRepo eduRepo;

	@Autowired
	private KidRepo kidRepo;

	@Autowired
	private EligRepo eligRepo;

	@Override
	public EdResponse determineEligibility(Long caseNum) {

		EdResponse response = new EdResponse();

		// get citizen plan name using caseNum

		PlanSelEntity planSel = planSelRepo.findByCaseNum(caseNum);

		Integer planId = planSel.getPlanId();

		PlanEntity planEntity = planRepo.findById(planId).get();

		String planName = planEntity.getPlanName();

		// get citizen info using caseNum

		IncomeEntity incomeEntity = incomeRepo.findByCaseNum(caseNum);
		EducationEntity educationEntity = eduRepo.findByCaseNum(caseNum);
		List<KidEntity> kidsEntities = kidRepo.findByCaseNum(caseNum);

		response.setPlanName(planName);
		response.setCaseNum(caseNum);

		if ("SNAP".equals(planName)) {

			Double salaryIncome = incomeEntity.getSalaryIncome();
			if (salaryIncome > 300) {
				response.setPlanStatus("DN");
				response.setDenialRsn("High Salary Income");
			} else {
				response.setPlanStatus("AP");
				response.setBenefitAmt(350.00);
				response.setEligStartDate(LocalDate.now());
				response.setEligEndDate(LocalDate.now().plusMonths(6));
			}

		} else if ("CCAP".equals(planName)) {
			// logic
		} else if ("Medicaid".equals(planName)) {
			// logic
		} else if ("Medicare".equals(planName)) {
			// logic
		} else if ("RIW".equals(planName)) {
			// logic
		}

		EligEntity entity = new EligEntity();
		BeanUtils.copyProperties(response, entity);

		eligRepo.save(entity);

		return response;
	}

	@Override
	public boolean generateCo(Long caseNum) {

		// get ed record based on casenum
		
		// insert into co table
		
		return false;
	}

}
