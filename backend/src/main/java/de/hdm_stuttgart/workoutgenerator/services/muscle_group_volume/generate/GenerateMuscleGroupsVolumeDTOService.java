package de.hdm_stuttgart.workoutgenerator.services.muscle_group_volume.generate;

import de.hdm_stuttgart.workoutgenerator.dtos.MovementPatternDTO;
import de.hdm_stuttgart.workoutgenerator.dtos.MuscleGroupVolumeDTO;
import org.springframework.stereotype.Service;

@Service
public class GenerateMuscleGroupsVolumeDTOService implements IGenerateMuscleGroupsVolumeDTOService {
    private final IInitMuscleGroupsVolumeDTOMapService initMuscleGroupsVolumeDTOMapService;
    private final ICalculateMuscleGroupsVolumeDTOService calculateMuscleGroupsVolumeDTOService;

    public GenerateMuscleGroupsVolumeDTOService(IInitMuscleGroupsVolumeDTOMapService initMuscleGroupsVolumeDTOService, ICalculateMuscleGroupsVolumeDTOService calculateMuscleGroupsVolumeDTOService) {
        this.initMuscleGroupsVolumeDTOMapService = initMuscleGroupsVolumeDTOService;
        this.calculateMuscleGroupsVolumeDTOService = calculateMuscleGroupsVolumeDTOService;
    }

    @Override
    public Iterable<MuscleGroupVolumeDTO> generateMuscleGroupsVolumeDTO(Iterable<MovementPatternDTO> movementPatternsDTO) {
        var muscleGroupsVolumeDTOMap = initMuscleGroupsVolumeDTOMapService.initMuscleGroupsVolumeDTOMap();

        return calculateMuscleGroupsVolumeDTOService.calculateMuscleGroupsVolumeDTO(muscleGroupsVolumeDTOMap, movementPatternsDTO);
    }
}
