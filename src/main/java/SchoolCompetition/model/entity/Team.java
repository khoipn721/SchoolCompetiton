package SchoolCompetition.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Team")
public class Team {
    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "coach_id")
    private int coachId;

    @Column(name = "competition_id")
    private int competitionId;
}
