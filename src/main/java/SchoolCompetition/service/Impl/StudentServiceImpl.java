package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.Student;
import SchoolCompetition.repository.StudentRepository;
import SchoolCompetition.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
}
