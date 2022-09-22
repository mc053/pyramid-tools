package de.hdm_stuttgart.workoutgenerator.dtos;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;

public class MuscleGroupDTO {
    private MuscleGroupEnums name;

    public MuscleGroupDTO() {
    }

    public MuscleGroupDTO(MuscleGroupEnums name) {
        this.name = name;
    }

    public MuscleGroupEnums getName() {
        return name;
    }

    public void setName(MuscleGroupEnums name) {
        this.name = name;
    }
}
