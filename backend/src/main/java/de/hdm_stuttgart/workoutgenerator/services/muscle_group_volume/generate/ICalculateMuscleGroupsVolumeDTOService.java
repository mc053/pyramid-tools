package de.hdm_stuttgart.workoutgenerator.services.muscle_group_volume.generate;

import de.hdm_stuttgart.workoutgenerator.dtos.MovementPatternDTO;
import de.hdm_stuttgart.workoutgenerator.dtos.MuscleGroupVolumeDTO;
import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;

import java.util.List;
import java.util.Map;

public interface ICalculateMuscleGroupsVolumeDTOService {
    List<MuscleGroupVolumeDTO> calculateMuscleGroupsVolumeDTO(Map<MuscleGroupEnums, MuscleGroupVolumeDTO> muscleGroupsVolumeDTOMap, Iterable<MovementPatternDTO> movementPatternsDTO);
}
