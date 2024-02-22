package SchoolCompetition.controller;

import SchoolCompetition.model.dto.ApiResponse;
import SchoolCompetition.model.entity.Result;
import SchoolCompetition.model.entity.Round;
import SchoolCompetition.service.ResultService;
import SchoolCompetition.service.RoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/round")
public class RoundController {
    @Autowired
    RoundService roundService;

    @GetMapping(value = {"getAll"})
    public ResponseEntity<ApiResponse<List<Round>>> getAll() {
        ApiResponse apiResponse = new ApiResponse();
        List<Round> rounds = roundService.getAllRound();
        apiResponse.ok(rounds);
        return ResponseEntity.ok(apiResponse);
    }
}
