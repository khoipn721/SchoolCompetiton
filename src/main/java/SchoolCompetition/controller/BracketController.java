package SchoolCompetition.controller;

import SchoolCompetition.model.dto.ApiResponse;
import SchoolCompetition.model.entity.Bracket;
import SchoolCompetition.model.entity.Competition;
import SchoolCompetition.model.entity.SchoolYear;
import SchoolCompetition.service.BracketService;
import SchoolCompetition.service.SchoolYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bracket")
public class BracketController {
    @Autowired
    BracketService bracketService;

    @GetMapping(value = {"getAll"})
    public ResponseEntity<ApiResponse<List<Bracket>>> getAll() {
        ApiResponse apiResponse = new ApiResponse();
        List<Bracket> brackets = bracketService.getAllBracket();
        apiResponse.ok(brackets);
        return ResponseEntity.ok(apiResponse);
    }
}
