package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.SchoolYear;
import SchoolCompetition.repository.SchoolYearRepository;
import SchoolCompetition.service.SchoolYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolYearServiceImpl implements SchoolYearService {
    @Autowired
    SchoolYearRepository schoolYearRepository;

    @Override
    public List<SchoolYear> getAll(){
        return schoolYearRepository.findAll();
    }
}
