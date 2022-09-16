package de.hdm_stuttgart.workoutgenerator.models.movement_pattern;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;

import java.util.List;

public class MovementPatternInclineHorizontalPush extends MovementPatternHorizontalPush {

    @Override
    public List<MuscleGroupEnums> getSecondaryMuscleGroups() {
        return List.of(MuscleGroupEnums.TRIS, MuscleGroupEnums.MIDDLE_DELTS);
    }
}
