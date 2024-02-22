package SchoolCompetition.service;

import SchoolCompetition.model.entity.Coach;
import SchoolCompetition.model.entity.SchoolYear;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CoachService {
    List<Coach> getAllCoach();
}
