package in.ashokit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entities.EducationEntity;

public interface EducationRepo extends JpaRepository<EducationEntity, Integer>{
	
	@Query("from EducationEntity where caseNum=:caseNum")
	public EducationEntity findByCaseNum(Long caseNum);

}
