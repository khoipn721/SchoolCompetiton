package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.Round;
import SchoolCompetition.repository.RoundRepository;
import SchoolCompetition.service.RoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoundServiceImpl implements RoundService {
    @Autowired
    RoundRepository roundRepository;

    @Override
    public List<Round> getAllRound() {
        return roundRepository.findAll();
    }
}
