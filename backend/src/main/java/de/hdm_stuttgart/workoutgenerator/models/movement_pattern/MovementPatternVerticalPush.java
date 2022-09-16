package de.hdm_stuttgart.workoutgenerator.models.movement_pattern;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;

import java.util.List;

public class MovementPatternVerticalPush implements IMovementPattern {
    @Override
    public List<MuscleGroupEnums> getPrimaryMuscleGroups() {
        return List.of(MuscleGroupEnums.ANTERIOR_DELTS, MuscleGroupEnums.TRIS);
    }

    @Override
    public List<MuscleGroupEnums> getSecondaryMuscleGroups() {
        return List.of(MuscleGroupEnums.MIDDLE_DELTS);
    }
}
