package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.Bracket;
import SchoolCompetition.repository.BracketRepository;
import SchoolCompetition.service.BracketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BracketServiceImpl implements BracketService {
    @Autowired
    BracketRepository bracketRepository;

    @Override
    public List<Bracket> getAllBracket() {
        return bracketRepository.findAll();
    }


}
