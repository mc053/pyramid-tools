package de.hdm_stuttgart.workoutgenerator.models.movement_pattern;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;

import java.util.List;

public class MovementPatternHorizontalHipExtension implements IMovementPattern {
    @Override
    public List<MuscleGroupEnums> getPrimaryMuscleGroups() {
        return List.of(MuscleGroupEnums.GLUTES);
    }

    @Override
    public List<MuscleGroupEnums> getSecondaryMuscleGroups() {
        return List.of(MuscleGroupEnums.HAMS);
    }
}
