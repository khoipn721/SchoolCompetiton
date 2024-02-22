package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.Contestant;
import SchoolCompetition.repository.ContestantRepository;
import SchoolCompetition.service.ContestantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContestantServiceImpl implements ContestantService {
    @Autowired
    ContestantRepository contestantRepository;
    @Override
    public List<Contestant> getAll() {
        return contestantRepository.findAll();
    }
}
