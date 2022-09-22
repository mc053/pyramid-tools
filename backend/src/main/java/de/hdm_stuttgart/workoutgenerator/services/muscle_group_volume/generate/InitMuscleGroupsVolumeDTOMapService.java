package de.hdm_stuttgart.workoutgenerator.services.muscle_group_volume.generate;

import de.hdm_stuttgart.workoutgenerator.dtos.MuscleGroupVolumeDTO;
import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InitMuscleGroupsVolumeDTOMapService implements IInitMuscleGroupsVolumeDTOMapService {
    @Override
    public Map<MuscleGroupEnums, MuscleGroupVolumeDTO> initMuscleGroupsVolumeDTOMap() {
        Map<MuscleGroupEnums, MuscleGroupVolumeDTO> result = new HashMap<>();

        Arrays.stream(MuscleGroupEnums.values()).forEach(m -> {
            result.put(m, new MuscleGroupVolumeDTO(m, 0, 0, 0));
        });

        return result;
    }
}
