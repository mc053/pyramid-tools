package de.hdm_stuttgart.workoutgenerator.models.training_week;

import de.hdm_stuttgart.workoutgenerator.models.training_day.TrainingDay;

import java.util.List;

public class TrainingWeek {

    private List<TrainingDay> trainingDays;

    public TrainingWeek() {}

    public TrainingWeek(List<TrainingDay> trainingDays) {
        this.trainingDays = trainingDays;
    }

    public List<TrainingDay> getTrainingDays() {
        return trainingDays;
    }

    public void setTrainingDays(List<TrainingDay> trainingDays) {
        this.trainingDays = trainingDays;
    }

}
