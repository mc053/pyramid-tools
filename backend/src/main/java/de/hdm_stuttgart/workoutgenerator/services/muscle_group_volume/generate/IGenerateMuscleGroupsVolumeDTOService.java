package de.hdm_stuttgart.workoutgenerator.services.muscle_group_volume.generate;

import de.hdm_stuttgart.workoutgenerator.dtos.MovementPatternDTO;
import de.hdm_stuttgart.workoutgenerator.dtos.MuscleGroupVolumeDTO;

public interface IGenerateMuscleGroupsVolumeDTOService {
    Iterable<MuscleGroupVolumeDTO> generateMuscleGroupsVolumeDTO(Iterable<MovementPatternDTO> movementPatternsDTO);
}
