package SchoolCompetition.repository;

import SchoolCompetition.model.entity.Contestant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ContestantRepository extends JpaRepository<Contestant, Integer> {
}
