package SchoolCompetition.service;

import SchoolCompetition.model.entity.Result;
import SchoolCompetition.model.entity.Round;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoundService {
    List<Round> getAllRound();
}
