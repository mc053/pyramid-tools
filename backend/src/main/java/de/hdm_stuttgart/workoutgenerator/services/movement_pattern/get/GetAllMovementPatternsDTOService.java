package de.hdm_stuttgart.workoutgenerator.services.movement_pattern.get;

import de.hdm_stuttgart.workoutgenerator.dtos.MovementPatternDTO;
import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllMovementPatternsDTOService implements IGetAllMovementPatternsDTOService {
    private static final List<MovementPatternDTO> ALL_MOVEMENT_PATTERNS_DTO = List.of(
            new MovementPatternDTO("Free Weight Squat (all variations, single leg variants)", 0, List.of(
                    MuscleGroupEnums.QUADS,
                    MuscleGroupEnums.GLUTES
            ), List.of(
                    MuscleGroupEnums.ERECTORS
            )),
            new MovementPatternDTO("Non-Free Weight Squat (leg press)", 0, List.of(
                    MuscleGroupEnums.QUADS,
                    MuscleGroupEnums.GLUTES
            ), List.of()),
            new MovementPatternDTO("Hip Hinge (deadlift variations, good morning, back ext)", 0, List.of(
                    MuscleGroupEnums.GLUTES,
                    MuscleGroupEnums.HAMS,
                    MuscleGroupEnums.ERECTORS
            ), List.of(
                    MuscleGroupEnums.SCAPULAR_RETRACTORS
            )),
            new MovementPatternDTO("Vertical Pull (chins, lat pull)", 0, List.of(
                    MuscleGroupEnums.LATS,
                    MuscleGroupEnums.BIS
            ), List.of(
                    MuscleGroupEnums.REAR_DELTS
            )),
            new MovementPatternDTO("Vertical Push (OHP variations)", 0, List.of(
                    MuscleGroupEnums.ANTERIOR_DELTS,
                    MuscleGroupEnums.TRIS
            ), List.of(
                    MuscleGroupEnums.MIDDLE_DELTS
            )),
            new MovementPatternDTO("Horizontal Pull (row variations)", 0, List.of(
                    MuscleGroupEnums.LATS,
                    MuscleGroupEnums.SCAPULAR_RETRACTORS
            ), List.of(
                    MuscleGroupEnums.REAR_DELTS,
                    MuscleGroupEnums.BIS,
                    MuscleGroupEnums.MIDDLE_DELTS
            )),
            new MovementPatternDTO("Horizontal Push (flat, decline pushing variants)", 0, List.of(
                    MuscleGroupEnums.CHEST,
                    MuscleGroupEnums.ANTERIOR_DELTS
            ), List.of(
                    MuscleGroupEnums.TRIS
            )),
            new MovementPatternDTO("CG Horizontal Push", 0, List.of(
                    MuscleGroupEnums.CHEST,
                    MuscleGroupEnums.ANTERIOR_DELTS,
                    MuscleGroupEnums.TRIS
            ), List.of()),
            new MovementPatternDTO("Incline Push", 0, List.of(
                    MuscleGroupEnums.CHEST,
                    MuscleGroupEnums.ANTERIOR_DELTS
            ), List.of(
                    MuscleGroupEnums.TRIS,
                    MuscleGroupEnums.MIDDLE_DELTS
            )),
            new MovementPatternDTO("CG Incline Push", 0, List.of(
                    MuscleGroupEnums.CHEST,
                    MuscleGroupEnums.ANTERIOR_DELTS,
                    MuscleGroupEnums.TRIS
            ), List.of(
                    MuscleGroupEnums.MIDDLE_DELTS
            )),
            new MovementPatternDTO("Dips", 0, List.of(
                    MuscleGroupEnums.CHEST,
                    MuscleGroupEnums.ANTERIOR_DELTS,
                    MuscleGroupEnums.TRIS
            ), List.of()),
            new MovementPatternDTO("Horizontal Hip Extension (hip thrust, glute bridge etc)", 0, List.of(
                    MuscleGroupEnums.GLUTES
            ), List.of(
                    MuscleGroupEnums.HAMS
            )),
            new MovementPatternDTO("Pull Over (DB pullover, lat pushdown, BB pullover etc)", 0, List.of(
                    MuscleGroupEnums.LATS
            ), List.of(
                    MuscleGroupEnums.TRIS,
                    MuscleGroupEnums.CHEST
            )),
            new MovementPatternDTO("Fly (cable crossover, DB flys)", 0, List.of(
                    MuscleGroupEnums.CHEST
            ), List.of(
                    MuscleGroupEnums.ANTERIOR_DELTS
            ))
    );

    @Override
    public Iterable<MovementPatternDTO> getAllMovementPatternsDTO() {
        return ALL_MOVEMENT_PATTERNS_DTO;
    }
}
