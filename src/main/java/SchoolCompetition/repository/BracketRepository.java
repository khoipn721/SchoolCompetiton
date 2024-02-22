package SchoolCompetition.repository;

import SchoolCompetition.model.entity.Bracket;
import SchoolCompetition.model.entity.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface BracketRepository extends JpaRepository<Bracket, Integer> {
}
