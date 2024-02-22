package SchoolCompetition.repository;

import SchoolCompetition.model.entity.Competition;
import SchoolCompetition.model.entity.Round;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RoundRepository extends JpaRepository<Round, Integer> {
}
