package de.hdm_stuttgart.workoutgenerator.services.volume;

import de.hdm_stuttgart.workoutgenerator.models.training_week.TrainingWeek;
import de.hdm_stuttgart.workoutgenerator.models.volume.Volume;

public interface IGetVolumeForTrainingWeekService {

    Volume getVolumeForTrainingWeek(TrainingWeek trainingWeek);

}
