package de.hdm_stuttgart.workoutgenerator.services.muscle_group_volume.generate;

import de.hdm_stuttgart.workoutgenerator.dtos.MovementPatternDTO;
import de.hdm_stuttgart.workoutgenerator.dtos.MuscleGroupVolumeDTO;
import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CalculateMuscleGroupsVolumeDTOService implements ICalculateMuscleGroupsVolumeDTOService {
    @Override
    public List<MuscleGroupVolumeDTO> calculateMuscleGroupsVolumeDTO(Map<MuscleGroupEnums, MuscleGroupVolumeDTO> muscleGroupsVolumeDTOMap, Iterable<MovementPatternDTO> movementPatternsDTO) {
        calculatePrimaryMuscleGroups(muscleGroupsVolumeDTOMap, movementPatternsDTO);
        calculateSecondaryMuscleGroups(muscleGroupsVolumeDTOMap, movementPatternsDTO);

        return muscleGroupsVolumeDTOMap.values().stream().toList();
    }

    private void calculatePrimaryMuscleGroups(Map<MuscleGroupEnums, MuscleGroupVolumeDTO> muscleGroupsVolumeDTOMap, Iterable<MovementPatternDTO> movementPatternsDTO) {
        movementPatternsDTO.forEach(m -> {
            var primaryMuscleGroups = m.getPrimaryMuscleGroups();

            primaryMuscleGroups.forEach(e -> {
                var muscleGroupsVolume = muscleGroupsVolumeDTOMap.get(e);

                if (muscleGroupsVolume != null) {
                    muscleGroupsVolume.setSets(muscleGroupsVolume.getSets() + m.getSets());
                    muscleGroupsVolume.setDirectWork(muscleGroupsVolume.getDirectWork() + m.getSets());
                }
            });
        });
    }

    private void calculateSecondaryMuscleGroups(Map<MuscleGroupEnums, MuscleGroupVolumeDTO> muscleGroupsVolumeDTOMap, Iterable<MovementPatternDTO> movementPatternsDTO) {
        movementPatternsDTO.forEach(m -> {
            var secondaryMuscleGroups = m.getSecondaryMuscleGroups();

            secondaryMuscleGroups.forEach(e -> {
                var muscleGroupsVolume = muscleGroupsVolumeDTOMap.get(e);

                if (muscleGroupsVolume != null) {
                    muscleGroupsVolume.setSets(muscleGroupsVolume.getSets() + m.getSets());
                    muscleGroupsVolume.setIndirectWork(muscleGroupsVolume.getIndirectWork() + m.getSets());
                }
            });
        });
    }
}
