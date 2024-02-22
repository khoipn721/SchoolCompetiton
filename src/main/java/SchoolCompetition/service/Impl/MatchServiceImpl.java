package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.Match;
import SchoolCompetition.repository.MatchRepository;
import SchoolCompetition.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MatchServiceImpl implements MatchService {
    @Autowired
    MatchRepository matchRepository;

    @Override
    public List<Match> getAllMatch() {
        return matchRepository.findAll();
    }
}
