package de.hdm_stuttgart.workoutgenerator.services.volume;

import de.hdm_stuttgart.workoutgenerator.models.training_day.TrainingDay;
import de.hdm_stuttgart.workoutgenerator.models.volume.Volume;

public interface IAddTrainingDayToVolumeService {

    Volume addTrainingDayToVolume(TrainingDay trainingDay, Volume volume);

}
