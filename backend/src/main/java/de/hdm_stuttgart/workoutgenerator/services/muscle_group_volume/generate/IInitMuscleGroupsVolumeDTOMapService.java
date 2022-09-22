package de.hdm_stuttgart.workoutgenerator.services.muscle_group_volume.generate;

import de.hdm_stuttgart.workoutgenerator.dtos.MuscleGroupVolumeDTO;
import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;

import java.util.Map;

public interface IInitMuscleGroupsVolumeDTOMapService {
    Map<MuscleGroupEnums, MuscleGroupVolumeDTO> initMuscleGroupsVolumeDTOMap();
}
