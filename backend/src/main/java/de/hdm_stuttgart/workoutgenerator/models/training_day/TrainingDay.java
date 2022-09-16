package de.hdm_stuttgart.workoutgenerator.models.training_day;

import de.hdm_stuttgart.workoutgenerator.models.movement_pattern.IMovementPattern;

import java.util.List;

public class TrainingDay {

    private String name;

    private List<IMovementPattern> movementPatterns;

    public TrainingDay() {}

    public TrainingDay(String name, List<IMovementPattern> movementPatterns) {
        this.name = name;
        this.movementPatterns = movementPatterns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IMovementPattern> getMovementPatterns() {
        return movementPatterns;
    }

    public void setMovementPatterns(List<IMovementPattern> movementPatterns) {
        this.movementPatterns = movementPatterns;
    }
}
