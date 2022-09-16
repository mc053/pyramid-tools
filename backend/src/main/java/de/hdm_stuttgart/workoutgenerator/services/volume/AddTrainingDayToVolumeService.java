package de.hdm_stuttgart.workoutgenerator.services.volume;

import de.hdm_stuttgart.workoutgenerator.models.training_day.TrainingDay;
import de.hdm_stuttgart.workoutgenerator.models.volume.Volume;
import org.springframework.stereotype.Service;

@Service
public class AddTrainingDayToVolumeService implements IAddTrainingDayToVolumeService {

    private final IAddMovementPatternToVolumeService addMovementPatternToVolumeService;

    public AddTrainingDayToVolumeService(IAddMovementPatternToVolumeService addMovementPatternToVolumeService) {
        this.addMovementPatternToVolumeService = addMovementPatternToVolumeService;
    }

    @Override
    public Volume addTrainingDayToVolume(TrainingDay trainingDay, Volume volume) {
        trainingDay.getMovementPatterns().forEach(movementPattern -> addMovementPatternToVolumeService.addMovementPatternToVolume(movementPattern, volume));

        return volume;
    }
}
