package SchoolCompetition.service;

import SchoolCompetition.model.entity.Competition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompetitionService {
    List<Competition> getAllCompetition();
}
