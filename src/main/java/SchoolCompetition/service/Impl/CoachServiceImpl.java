package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.Coach;
import SchoolCompetition.repository.CoachRepository;
import SchoolCompetition.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoachServiceImpl implements CoachService {
    @Autowired
    CoachRepository coachRepository;
    @Override
    public List<Coach> getAllCoach() {
        return coachRepository.findAll();
    }
}
