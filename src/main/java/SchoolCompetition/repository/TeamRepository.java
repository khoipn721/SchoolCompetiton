package SchoolCompetition.repository;

import SchoolCompetition.model.entity.Competition;
import SchoolCompetition.model.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
