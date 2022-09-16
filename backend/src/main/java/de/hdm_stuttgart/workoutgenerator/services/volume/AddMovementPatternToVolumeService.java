package de.hdm_stuttgart.workoutgenerator.services.volume;

import de.hdm_stuttgart.workoutgenerator.models.movement_pattern.IMovementPattern;
import de.hdm_stuttgart.workoutgenerator.models.volume.Volume;
import org.springframework.stereotype.Service;

@Service
public class AddMovementPatternToVolumeService implements IAddMovementPatternToVolumeService {
    private final IAddPrimaryMuscleGroupToVolumeService addPrimaryMuscleGroupToVolumeService;
    private final IAddSecondaryMuscleGroupToVolumeService addSecondaryMuscleGroupToVolumeService;

    public AddMovementPatternToVolumeService(IAddPrimaryMuscleGroupToVolumeService addPrimaryMuscleGroupToVolumeService, IAddSecondaryMuscleGroupToVolumeService addSecondaryMuscleGroupToVolumeService) {
        this.addPrimaryMuscleGroupToVolumeService = addPrimaryMuscleGroupToVolumeService;
        this.addSecondaryMuscleGroupToVolumeService = addSecondaryMuscleGroupToVolumeService;
    }

    @Override
    public Volume addMovementPatternToVolume(IMovementPattern movementPattern, Volume volume) {
        movementPattern.getPrimaryMuscleGroups().forEach(primaryMuscleGroup -> addPrimaryMuscleGroupToVolumeService.addPrimaryMuscleGroupToVolume(primaryMuscleGroup, volume));
        movementPattern.getSecondaryMuscleGroups().forEach(secondaryMuscleGroup -> addSecondaryMuscleGroupToVolumeService.addSecondaryMuscleGroupToVolume(secondaryMuscleGroup, volume));

        return volume;
    }
}
