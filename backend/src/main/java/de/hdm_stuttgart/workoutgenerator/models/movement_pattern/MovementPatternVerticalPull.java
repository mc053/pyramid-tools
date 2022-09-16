package de.hdm_stuttgart.workoutgenerator.models.movement_pattern;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;

import java.util.List;

public class MovementPatternVerticalPull implements IMovementPattern {
    @Override
    public List<MuscleGroupEnums> getPrimaryMuscleGroups() {
        return List.of(MuscleGroupEnums.LATS, MuscleGroupEnums.BIS);
    }

    @Override
    public List<MuscleGroupEnums> getSecondaryMuscleGroups() {
        return List.of(MuscleGroupEnums.REAR_DELTS);
    }
}
