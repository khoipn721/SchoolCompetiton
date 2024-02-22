package SchoolCompetition.service;

import SchoolCompetition.model.entity.Round;
import SchoolCompetition.model.entity.Team;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeamService {
    List<Team> getAllTeam();
}
