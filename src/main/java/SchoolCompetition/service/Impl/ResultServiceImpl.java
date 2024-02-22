package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.Result;
import SchoolCompetition.repository.ResultRepository;
import SchoolCompetition.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    ResultRepository resultRepository;

    @Override
    public List<Result> getAllResult() {
        return resultRepository.findAll();
    }
}
