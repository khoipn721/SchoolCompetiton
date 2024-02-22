package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.School;
import SchoolCompetition.repository.SchoolRepository;
import SchoolCompetition.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService{
    @Autowired
    SchoolRepository schoolRepository;
    @Override
    public List<School> getAll() {
        return schoolRepository.findAll();
    }
}
