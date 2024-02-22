package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.Match;
import SchoolCompetition.repository.MatchRepository;
import SchoolCompetition.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatchServiceImpl implements MatchService {
    @Autowired
    MatchRepository matchRepository;

    @Override
    public List<Match> getAllMatch() {
        return matchRepository.findAll();
    }
}
