package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.Team;
import SchoolCompetition.repository.TeamRepository;
import SchoolCompetition.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    TeamRepository teamRepository;

    @Override
    public List<Team> getAllTeam() {
        return teamRepository.findAll();
    }
}
