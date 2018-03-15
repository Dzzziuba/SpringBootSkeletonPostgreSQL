package roma.test.app1.DAO.repository;

import org.springframework.data.repository.CrudRepository;
import roma.test.app1.domain.Human;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface HumanRepository extends CrudRepository<Human, Long>{
    List<Human> findBySurName(String surName);
}
