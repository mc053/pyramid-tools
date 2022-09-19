package de.hdm_stuttgart.workoutgenerator.services.muscle_group.get;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class GetAllMuscleGroupsDTOService implements IGetAllMuscleGroupsDTOService {
    @Override
    public Iterable<String> getAllMuscleGroupsDTO() {
        return Arrays.stream(MuscleGroupEnums.values()).map(MuscleGroupEnums::toString).collect(Collectors.toList());
    }
}
