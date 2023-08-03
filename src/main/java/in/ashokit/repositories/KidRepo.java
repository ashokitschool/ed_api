package in.ashokit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entities.KidEntity;

public interface KidRepo extends JpaRepository<KidEntity, Integer> {

	@Query("from KidEntity where caseNum=:caseNum")
	public List<KidEntity> findByCaseNum(Long caseNum);

}
