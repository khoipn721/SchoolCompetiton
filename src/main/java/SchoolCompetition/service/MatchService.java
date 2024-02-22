package SchoolCompetition.service;

import SchoolCompetition.model.entity.Contestant;
import SchoolCompetition.model.entity.Match;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatchService {
    List<Match> getAllMatch();
}
