package de.hdm_stuttgart.workoutgenerator.dtos;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;

public class MuscleGroupVolumeDTO extends MuscleGroupDTO {
    private Integer sets;

    private Integer directWork;

    private Integer indirectWork;

    public MuscleGroupVolumeDTO() {
    }

    public MuscleGroupVolumeDTO(MuscleGroupEnums name, Integer sets, Integer directWork, Integer indirectWork) {
        super(name);
        this.sets = sets;
        this.directWork = directWork;
        this.indirectWork = indirectWork;
    }

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }

    public Integer getDirectWork() {
        return directWork;
    }

    public void setDirectWork(Integer directWork) {
        this.directWork = directWork;
    }

    public Integer getIndirectWork() {
        return indirectWork;
    }

    public void setIndirectWork(Integer indirectWork) {
        this.indirectWork = indirectWork;
    }
}
