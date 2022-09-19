package de.hdm_stuttgart.workoutgenerator.dtos;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;

import java.util.List;

public class MovementPatternDTO {
    private String name;

    private Integer sets;

    private List<MuscleGroupEnums> primaryMuscleGroups;

    private List<MuscleGroupEnums> secondaryMuscleGroups;

    public MovementPatternDTO() {
    }

    public MovementPatternDTO(String name, Integer sets, List<MuscleGroupEnums> primaryMuscleGroups, List<MuscleGroupEnums> secondaryMuscleGroups) {
        this.name = name;
        this.sets = sets;
        this.primaryMuscleGroups = primaryMuscleGroups;
        this.secondaryMuscleGroups = secondaryMuscleGroups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }

    public List<MuscleGroupEnums> getPrimaryMuscleGroups() {
        return primaryMuscleGroups;
    }

    public void setPrimaryMuscleGroups(List<MuscleGroupEnums> primaryMuscleGroups) {
        this.primaryMuscleGroups = primaryMuscleGroups;
    }

    public List<MuscleGroupEnums> getSecondaryMuscleGroups() {
        return secondaryMuscleGroups;
    }

    public void setSecondaryMuscleGroups(List<MuscleGroupEnums> secondaryMuscleGroups) {
        this.secondaryMuscleGroups = secondaryMuscleGroups;
    }
}
