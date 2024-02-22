package SchoolCompetition.controller;

import SchoolCompetition.model.dto.ApiResponse;
import SchoolCompetition.model.entity.Car;
import SchoolCompetition.model.entity.Coach;
import SchoolCompetition.service.CarService;
import SchoolCompetition.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coach")
public class CoachController {
    @Autowired
    CoachService coachService;

    @GetMapping(value = {"getAll"})
    public ResponseEntity<ApiResponse<List<Coach>>> getAll() {
        ApiResponse apiResponse = new ApiResponse();
        List<Coach> coaches = coachService.getAllCoach();
        apiResponse.ok(coaches);
        return ResponseEntity.ok(apiResponse);
    }
}
