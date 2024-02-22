package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.Competition;
import SchoolCompetition.repository.CompetitionRepository;
import SchoolCompetition.service.CompetitionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionServiceImpl implements CompetitionService {
    @Autowired
    CompetitionRepository competitionRepository;

    @Override
    public List<Competition> getAllCompetition(){
        return competitionRepository.findAll();
    }
}
