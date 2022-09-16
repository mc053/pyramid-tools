package de.hdm_stuttgart.workoutgenerator.models.movement_pattern;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;

import java.util.List;

public class MovementPatternHorizontalPush implements IMovementPattern {
    @Override
    public List<MuscleGroupEnums> getPrimaryMuscleGroups() {
        return List.of(MuscleGroupEnums.CHEST, MuscleGroupEnums.ANTERIOR_DELTS);
    }

    @Override
    public List<MuscleGroupEnums> getSecondaryMuscleGroups() {
        return List.of(MuscleGroupEnums.TRIS);
    }
}
