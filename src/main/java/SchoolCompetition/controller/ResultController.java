package SchoolCompetition.controller;

import SchoolCompetition.model.dto.ApiResponse;
import SchoolCompetition.model.entity.Bracket;
import SchoolCompetition.model.entity.Result;
import SchoolCompetition.model.entity.Student;
import SchoolCompetition.service.ResultService;
import SchoolCompetition.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultController {
    @Autowired
    ResultService resultService;

    @GetMapping(value = {"getAll"})
    public ResponseEntity<ApiResponse<List<Result>>> getAll() {
        ApiResponse apiResponse = new ApiResponse();
        List<Result> students = resultService.getAllResult();
        apiResponse.ok(students);
        return ResponseEntity.ok(apiResponse);
    }
}
