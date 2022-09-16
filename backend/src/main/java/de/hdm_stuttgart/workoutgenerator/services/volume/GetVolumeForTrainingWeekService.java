package de.hdm_stuttgart.workoutgenerator.services.volume;

import de.hdm_stuttgart.workoutgenerator.models.training_week.TrainingWeek;
import de.hdm_stuttgart.workoutgenerator.models.volume.Volume;
import org.springframework.stereotype.Service;

@Service
public class GetVolumeForTrainingWeekService implements IGetVolumeForTrainingWeekService {

    private final IAddTrainingDayToVolumeService addTrainingDayToVolumeService;

    public GetVolumeForTrainingWeekService(IAddTrainingDayToVolumeService addTrainingDayToVolumeService) {
        this.addTrainingDayToVolumeService = addTrainingDayToVolumeService;
    }

    @Override
    public Volume getVolumeForTrainingWeek(TrainingWeek trainingWeek) {
        Volume volume = new Volume();

        trainingWeek.getTrainingDays().forEach(trainingDay -> addTrainingDayToVolumeService.addTrainingDayToVolume(trainingDay, volume));

        return volume;
    }
}
