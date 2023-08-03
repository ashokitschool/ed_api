package in.ashokit.service;

import in.ashokit.bindings.EdResponse;

public interface EligService {

	public EdResponse determineEligibility(Long caseNum);

	public boolean generateCo(Long caseNum);
}
