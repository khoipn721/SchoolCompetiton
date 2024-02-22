package SchoolCompetition.controller;

import SchoolCompetition.model.dto.ApiResponse;
import SchoolCompetition.model.entity.Competition;
import SchoolCompetition.model.entity.SchoolYear;
import SchoolCompetition.service.SchoolService;
import SchoolCompetition.service.SchoolYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schoolyear")
public class SchoolYearController {
    @Autowired
    SchoolYearService schoolYearService;

    @GetMapping(value = {"getAll"})
    public ResponseEntity<ApiResponse<List<SchoolYear>>> getAllClass() {
        ApiResponse apiResponse = new ApiResponse();
        List<SchoolYear> schoolYears = schoolYearService.getAll();
        apiResponse.ok(schoolYears);
        return ResponseEntity.ok(apiResponse);
    }
}
