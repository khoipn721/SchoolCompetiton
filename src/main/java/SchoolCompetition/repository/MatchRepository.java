package SchoolCompetition.repository;

import SchoolCompetition.model.entity.Competition;
import SchoolCompetition.model.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface MatchRepository extends JpaRepository<Match, Integer> {
}
