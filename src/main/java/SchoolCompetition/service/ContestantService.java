package SchoolCompetition.service;

import SchoolCompetition.model.entity.Competition;
import SchoolCompetition.model.entity.Contestant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContestantService {
    List<Contestant> getAll();
}
