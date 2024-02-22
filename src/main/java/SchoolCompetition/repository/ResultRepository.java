package SchoolCompetition.repository;

import SchoolCompetition.model.entity.Competition;
import SchoolCompetition.model.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ResultRepository extends JpaRepository<Result, Integer> {
}
