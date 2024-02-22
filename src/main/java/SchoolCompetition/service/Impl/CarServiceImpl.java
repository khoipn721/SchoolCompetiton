package SchoolCompetition.service.Impl;

import SchoolCompetition.model.entity.Car;
import SchoolCompetition.repository.CarRepository;
import SchoolCompetition.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepository carRepository;
    @Override
    public List<Car> getAllCar() {
        return carRepository.findAll();
    }
}
