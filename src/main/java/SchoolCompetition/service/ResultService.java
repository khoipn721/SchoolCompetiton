package SchoolCompetition.service;

import SchoolCompetition.model.entity.Match;
import SchoolCompetition.model.entity.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ResultService {
    List<Result> getAllResult();
}
