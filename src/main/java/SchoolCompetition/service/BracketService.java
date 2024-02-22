package SchoolCompetition.service;

import SchoolCompetition.model.entity.Bracket;
import SchoolCompetition.model.entity.SchoolYear;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BracketService {
    List<Bracket> getAllBracket();
}
