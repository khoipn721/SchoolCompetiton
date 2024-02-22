package SchoolCompetition.service;

import SchoolCompetition.model.entity.Match;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MatchService {
    List<Match> getAllMatch();
}
