package de.hdm_stuttgart.workoutgenerator.services.volume;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;
import de.hdm_stuttgart.workoutgenerator.models.volume.Volume;

public interface IAddSecondaryMuscleGroupToVolumeService {
    void addSecondaryMuscleGroupToVolume(MuscleGroupEnums secondaryMuscleGroup, Volume volume);
}
