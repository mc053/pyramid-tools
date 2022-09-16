package de.hdm_stuttgart.workoutgenerator.models.movement_pattern;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;

import java.util.List;

public interface IMovementPattern {
    List<MuscleGroupEnums> getPrimaryMuscleGroups();
    List<MuscleGroupEnums> getSecondaryMuscleGroups();
}
