package SchoolCompetition.service;

import SchoolCompetition.model.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAll();
}
