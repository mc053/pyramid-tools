package de.hdm_stuttgart.workoutgenerator.services.volume;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;
import de.hdm_stuttgart.workoutgenerator.models.volume.Volume;

public interface IAddPrimaryMuscleGroupToVolumeService {
    void addPrimaryMuscleGroupToVolume(MuscleGroupEnums primaryMuscleGroup, Volume volume);
}
