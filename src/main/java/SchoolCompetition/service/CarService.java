package SchoolCompetition.service;

import SchoolCompetition.model.entity.Car;
import SchoolCompetition.model.entity.SchoolYear;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {
    List<Car> getAllCar();
}
